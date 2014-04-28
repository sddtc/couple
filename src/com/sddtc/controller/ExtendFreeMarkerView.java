package com.sddtc.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Locale;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import freemarker.template.SimpleHash;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 
 * 扩展freemarker视图层
 * 为了更灵活的切换不同格式
 * 加快网站相应速度，对于静态页面和复杂页面的不同相应
 * @author sddtc
 * 
 */
public class ExtendFreeMarkerView extends FreeMarkerView {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.servlet.view.freemarker.FreeMarkerView#doRender
	 * (java.util.Map, javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doRender(Map<String, Object> model,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		exposeModelAsRequestAttributes(model, request);

		SimpleHash fmModel = buildTemplateModel(model, request, response);
		if (logger.isDebugEnabled()) {
			logger.debug("Rendering FreeMarker template [" + getUrl()
					+ "] in FreeMarkerView'" + getBeanName() + "'");
		}
		Locale locale = RequestContextUtils.getLocale(request);

		/*
		 * 在这里我们默认生成静态文件,当ModelAndView有指定STATIC_HTML = false时,就不会输出HTML文件
		 * 例如：ModelAndView modelAndView = new ModelAndView("htmlTest");
		 * modelAndView.addObject("STATICHTML", false);
		 */
		if (Boolean.FALSE.equals(model.get("STATIC_HTML"))) {
			processTemplate(getTemplate(locale), fmModel, response);
		} else {
			createHTML(getTemplate(locale), fmModel, request, response);
		}
	}

	private void createHTML(Template template, SimpleHash model,
			HttpServletRequest request, HttpServletResponse response) throws IOException, TemplateException, ServletException {
		// 站点根目录的绝对路径
		String basePath = request.getSession(false).getServletContext()
				.getRealPath("/");
		String requestHTML = this.getRequestHTML(request);
		// 静态页面绝对路径
		String htmlPath = basePath + requestHTML;
		File htmlFile = new File(htmlPath);
		if (!htmlFile.getParentFile().exists()) {
			htmlFile.getParentFile().mkdirs();
		}

		/**
		 * 如果静态页面已经存在,就不再创建静态页面.
		 */
		if (!htmlFile.exists()) {
			htmlFile.createNewFile();
			Writer out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(htmlFile), "UTF-8"));
			// 处理模版
			template.process(model, out);
			out.flush();
			out.close();
		}
		/* 将请求转发到生成的html文件 */
		request.getRequestDispatcher(requestHTML).forward(request, response);
	}

	/** 
     * 计算要生成的静态文件相对路径. 
     */  
    private String getRequestHTML(HttpServletRequest request){  
        //web应用名称,部署在ROOT目录时为空  
        String contextPath = request.getContextPath();  
        //web应用/目录/文件
        String requestURI = request.getRequestURI();  
        requestURI = requestURI.replaceFirst(contextPath, "");  
        //将后缀改为html,稍后将请求转发到此html文件  
        requestURI = requestURI + "1.html";  
           
        return requestURI;  
    } 
}
