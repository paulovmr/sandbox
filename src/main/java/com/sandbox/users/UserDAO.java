package com.sandbox.users;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class UserDAO {
	
	private Date date;
		
	public UserDAO() {
		date = new Date();
	}

	public String searchUser() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
		return "data: " + sdf.format(date);
	}
}
