package com.example.RestAndJSON.Repository;

import com.example.RestAndJSON.Entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
@Transactional
public class userRepo implements crudRepo<User>{

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(User unit) {
        sessionFactory.getCurrentSession().save(unit);
    }

    @Override
    public List<User> findAll() {
        CriteriaBuilder builder =sessionFactory.getCriteriaBuilder();
        CriteriaQuery<User> usersCriteriaQuery = builder.createQuery(User.class);
        Root<User> root = usersCriteriaQuery.from(User.class);
        usersCriteriaQuery.select(root);
        Query query = sessionFactory.getCurrentSession().createQuery(usersCriteriaQuery);
        return query.getResultList();
    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public List<User> findByName(String name) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User u where name = :name");
        query.setParameter("name",name);
        return query.getResultList();
    }
}
