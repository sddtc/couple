package com.sddtc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;

import com.sddtc.model.User;

/**
 * @author sddtc
 * 
 */
public class LoginSecurityServlet extends HttpServlet implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] ignoreTypes;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession(true);
		String url = req.getRequestURI();
		User user = (User) session.getAttribute("currUser");
		boolean ignoreType = false;

		if (null != ignoreTypes) {
			for (int i = 0; i < ignoreTypes.length; i++) {
				if (url.endsWith("." + ignoreTypes[i])) {
					ignoreType = true;
					break;
				}
			}

			if (!ignoreType) {
				if (null == user) {
					if (StringUtils.isNotBlank(url) && url.indexOf("login") < 0
							&& url.indexOf("authLogin") < 0) {
						res.sendRedirect(req.getContextPath()
								+ "/account/login");
						return;
					}
				}
			}
		}

		chain.doFilter(request, response);
		return;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		String types = arg0.getInitParameter("ignoreTypes");
		if (StringUtils.isNotBlank(types)) {
			this.ignoreTypes = types.split(",");
		}
	}
}
