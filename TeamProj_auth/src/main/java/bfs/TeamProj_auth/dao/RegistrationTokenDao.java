package bfs.TeamProj_auth.dao;


import bfs.TeamProj_auth.domain.RegistrationToken;

import java.util.List;

public interface RegistrationTokenDao {
    RegistrationToken getRegistrationTokenByToken(String token);

    RegistrationToken addRegistrationToken(RegistrationToken token);

    List<RegistrationToken> getAllRegistrationToken();
}
