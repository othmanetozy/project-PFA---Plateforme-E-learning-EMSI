package com.Elearning.securite;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String SECRET_KEY = "f8834a80c4b91970a9faa79b69549dbe9a3711f7c11f8fb71c65f91a84f0ef2f";
    public String extractUsername(String token) {
        return null;
    }
    private Claims extractAllClaims(String token){
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
