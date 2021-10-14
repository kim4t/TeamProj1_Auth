package bfs.TeamProj_auth.service;

import bfs.TeamProj_auth.dao.RegistrationTokenDao;
import bfs.TeamProj_auth.domain.RegistrationToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("registrationService")
public class RegistrationTokenService {
    @Autowired
    private RegistrationTokenDao tokenDao;

    @Transactional
    public RegistrationToken addToken(RegistrationToken token) {
        return tokenDao.addRegistrationToken(token);
    }

    @Transactional
    public RegistrationToken getRegistrationTokenByName(String token){
        return tokenDao.getRegistrationTokenByToken(token);
    }

    @Transactional
    public List<RegistrationToken> getAllToken() {
        return tokenDao.getAllRegistrationToken();
    }
}
