package com.sddtc.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sddtc
 *
 */
public class EmailSender {
    private static Logger logger = LoggerFactory.getLogger(EmailSender.class);
    private static String URL = "http://localhost:8888/couple/account/authLogin?auth=";
    
    //发送邮件验证
    public static void sender(String email, String auth) {
        try {
            HtmlEmail htmlEmail = new HtmlEmail();
            htmlEmail.setHostName("smtp.163.com");//你的邮件服务器的地址  
            htmlEmail.setAuthentication("xxx", "password");//如果你的邮件服务器设置了密码，请输入密码，否则此语句可以忽略  
            htmlEmail.addTo(email, null);
            htmlEmail.setFrom("xxx", "sddtc");//发件人  
            htmlEmail.setCharset("UTF-8");
            htmlEmail.setSubject("couple登录验证邮件");
            htmlEmail.setMsg("hello guys");
            String testEditor = "couple：登录验证邮件，登陆请 <a href="+URL + auth +">  点击   </a>";
            htmlEmail.setHtmlMsg(testEditor);  
            htmlEmail.send();
            logger.info("向邮箱:{}发送登陆验证邮件成功", email);
        } catch (EmailException e) {
            logger.error("发送登陆验证邮箱异常", e);
        }
    }
}