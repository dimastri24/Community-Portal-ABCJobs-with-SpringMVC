package com.wdf.springmvc.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
    @Autowired
    private JavaMailSender mailSender;

    
	/*
	 * Service for sending the email using MimeMessage from Java Mail
	 * and MimeMessageHelper from Spring Mail
	 * */
	@Override
	public void sendEmailLinkResetPassword(String recipientEmail, String link)
			throws MessagingException, UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();              
	    MimeMessageHelper helper = new MimeMessageHelper(message);
	    
	    helper.setTo(recipientEmail);
	     
	    String subject = "Here's the link to reset your password";
	     
	    String content = "<p>Hello,</p>"
	            + "<p>You have requested to reset your password.</p>"
	            + "<p>Click the link below to change your password:</p>"
	            + "<p><a href=\"" + link + "\">Change my password</a></p>"
	            + "<br>"
	            + "<p>Ignore this email if you do remember your password, "
	            + "or you have not made the request.</p>";
	     
	    helper.setSubject(subject);
	     
	    helper.setText(content, true);
	     
	    mailSender.send(message);

	}


	@Override
	public void sendEmailRegisterSuccess(String recipientEmail, String firstName)
			throws MessagingException, UnsupportedEncodingException {
		MimeMessage message = mailSender.createMimeMessage();              
	    MimeMessageHelper helper = new MimeMessageHelper(message);
	    
	    helper.setTo(recipientEmail);
	     
	    String subject = "Thankyou and Congrats, " + firstName + "!";
	    
	    String content = "<h1>Wellcome to ABCJobs<h1>"
	    		+ "<h3>A message from our Developer<h3>"
	    		+ "<br>"
	    		+ "<p>Thank you for joining ABCJobs! ABCJobs is an online community of millions of workers like you. We help each other find jobs faster, and have each other's backs every step of the way.<p>"
	    		+ "<p>I hope you love this community as much as I do - and I'd love to hear your thoughts any time.<p>"
	    		+ "<br>"
	    		+ "<p>-Dimas Tri Raharjo<p>";
	    
	    helper.setSubject(subject);
	    helper.setText(content, true);
	    
	    mailSender.send(message);
		
	}

}
