package com.wdf.springmvc.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

public interface EmailService {
	
	public void sendEmailLinkResetPassword(String recipientEmail, String link) throws MessagingException, UnsupportedEncodingException;
	
	public void sendEmailRegisterSuccess(String recipientEmail, String firstName) throws MessagingException, UnsupportedEncodingException;

}
