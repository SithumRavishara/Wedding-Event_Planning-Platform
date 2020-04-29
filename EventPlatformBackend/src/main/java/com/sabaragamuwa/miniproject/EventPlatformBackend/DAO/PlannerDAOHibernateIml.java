package com.sabaragamuwa.miniproject.EventPlatformBackend.DAO;

import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.Planner;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class PlannerDAOHibernateIml implements PlannerDAO {

    private EntityManager entityManager;

    @Autowired
    public PlannerDAOHibernateIml(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }

    @Override
    public void save(Planner thePlanner) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(thePlanner);
    }

    @Override
    public void deleteById(String theName) {

        Session currentSession = entityManager.unwrap(Session.class);

        Query theQuery = currentSession.createQuery("delete from planner where p_name=: plannerName");

        theQuery.setParameter("plannerName",theName);

        theQuery.executeUpdate();

    }

    @Override
    public Planner findById(String theName) {
        Session currentSession = entityManager.unwrap(Session.class);

        Planner thePlanner = currentSession.get(Planner.class,theName);

        return thePlanner;
    }
}
