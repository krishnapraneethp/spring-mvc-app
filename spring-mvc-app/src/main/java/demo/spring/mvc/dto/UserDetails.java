package demo.spring.mvc.dto;

import java.io.Serializable;

public class UserDetails implements Serializable {

	private static final long serialVersionUID = -7240791916052750044L;

	private Integer userid;
	private String username;
	private String password;
	private String emailId;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}
