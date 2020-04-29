package com.sabaragamuwa.miniproject.EventPlatformBackend.Service;

import com.sabaragamuwa.miniproject.EventPlatformBackend.DAO.PlannerDAO;
import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.Planner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PlannerServiceImpl implements PlannerService {

    private PlannerDAO plannerDAO;

    @Autowired
    public PlannerServiceImpl(PlannerDAO thePlannerDAO) {
        plannerDAO = thePlannerDAO;
    }

    @Override
    @Transactional
    public Planner findByName(String theName) {
        return plannerDAO.findById(theName);
    }

    @Override
    @Transactional
    public void save(Planner thePlanner) {
        plannerDAO.save(thePlanner);
    }

    @Override
    @Transactional
    public void deleteByName(String theName) {
        plannerDAO.deleteById(theName);
    }
}
