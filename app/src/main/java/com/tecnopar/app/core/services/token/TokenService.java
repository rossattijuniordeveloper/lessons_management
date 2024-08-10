package com.tecnopar.app.core.services.token;

public interface TokenService {

    String generateAccessToken(String subject);
    String getSubjectDoAccessToken(String accesToken);
    String generateRefreshToken(String subject);
    String getSubjectDoRefreshToken(String refreshToken);
    void InvalidatedTokens(String... tokens);

}
