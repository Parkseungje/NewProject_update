package com.example.selfmade.userRegisteration;

public class UserRegisterationModel {

	/* 유저코드 */
	private int user_code;

	/* 유저이름 */
	private String user_name;

	/*유저 아이디*/
	private String user_id;

	/*유저 패스워드*/
	private String user_password;

	/*유저 이메일*/
	private String user_email;

	/*유저 가입일*/
	private String user_registeration_date;

	/*유저 등급*/
	private String user_class;

	/*유저 이미지경로*/
	private String user_image_path;

	public int getUser_code() {
		return user_code;
	}

	public void setUser_code(int user_code) {
		this.user_code = user_code;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_registeration_date() {
		return user_registeration_date;
	}

	public void setUser_registeration_date(String user_registeration_date) {
		this.user_registeration_date = user_registeration_date;
	}

	public String getUser_class() {
		return user_class;
	}

	public void setUser_class(String user_class) {
		this.user_class = user_class;
	}

	public String getUser_image_path() {
		return user_image_path;
	}

	public void setUser_image_path(String user_image_path) {
		this.user_image_path = user_image_path;
	}


}
