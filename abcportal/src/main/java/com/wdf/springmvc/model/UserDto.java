package com.wdf.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserDto {

	@Id
	@Column(name = "userID")
	private Integer userID;
		
	@Column(name = "email")
    private String emailId;
	
	@Column(name = "pass")
    private String password;
	
	@Column(name = "reset_password_token")
    private String resetPasswordToken;
	
//    private String emailId;
//    private String password;
//    private String resetPasswordToken;
    
    
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
    public String getEmailId() {
        return emailId;
    }
	public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
	public String getResetPasswordToken() {
		return resetPasswordToken;
	}
	public void setResetPasswordToken(String resetPasswordToken) {
		this.resetPasswordToken = resetPasswordToken;
	}

}
