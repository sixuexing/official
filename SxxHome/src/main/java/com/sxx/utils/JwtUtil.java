package com.sxx.utils;

import java.util.HashMap;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


public class JwtUtil {
	static final String SECRET = "yshweb";

	public static String generateToken(String username) {
		HashMap<String,Object>map=new HashMap();
		// 可以放任何数据
		map.put("username",username);
		String jwt=Jwts.builder().setClaims(map)
				.signWith(SignatureAlgorithm.HS512,SECRET).compact();
		return jwt;
	}

	public static void validateToken(String token) {
		try {
			// 解析令牌， 如果没有通过就会出现401
			Claims body = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			throw new IllegalStateException("Invalid Token. " + e.getMessage());
		}
	}
}
