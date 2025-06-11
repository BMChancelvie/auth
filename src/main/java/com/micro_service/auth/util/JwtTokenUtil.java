package com.micro_service.auth.util;

import com.micro_service.auth.model.User;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenUtil {
    public String generate(User user, String type) {
        // Ici une logique simplifiée. En vrai, utilise une lib JWT comme io.jsonwebtoken (jjwt)
        return "token_for_" + user.getEmail() + "_" + type;
    }
}
