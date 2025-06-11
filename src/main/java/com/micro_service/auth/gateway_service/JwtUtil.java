package com.micro_service.auth.gateway_service;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
//import java.util.Date;

@Component
public class JwtUtil {

    private final String SECRET_KEY = "secret"; // à externaliser dans un vrai projet

    @SuppressWarnings("deprecation")
	public Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
    }

    public boolean isInvalid(String token) {
        try {
            getAllClaimsFromToken(token);
            return false;
        } catch (JwtException e) {
            return true;
        }
    }
}