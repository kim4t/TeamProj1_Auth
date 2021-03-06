package bfs.TeamProj_auth.dao;

import bfs.TeamProj_auth.domain.RegistrationToken;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateRegistrationTokenDao extends AbstractHibernateDAO<RegistrationToken> implements RegistrationTokenDao {

    public HibernateRegistrationTokenDao() {
        setClazz(RegistrationToken.class);
    }


    @Override
    public RegistrationToken getRegistrationTokenByToken(String name) {
        return findByField("token", name);

    }

    @Override
    public RegistrationToken addRegistrationToken(RegistrationToken token) {
        return create(token);
    }

    @Override
    public List<RegistrationToken> getAllRegistrationToken() {
        return findAll();
    }
}
