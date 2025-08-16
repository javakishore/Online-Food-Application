package com.kishore.response;


import com.kishore.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	


}
