package com.sabaragamuwa.miniproject.EventPlatformBackend.DAO;

import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.Planner;

public interface PlannerDAO {
    public  void save(Planner thePlanner);

    public void deleteById(String theName);

    public Planner findById(String theName);
}
