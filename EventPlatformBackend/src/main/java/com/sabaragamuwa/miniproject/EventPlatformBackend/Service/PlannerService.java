package com.sabaragamuwa.miniproject.EventPlatformBackend.Service;

import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.Planner;

public interface PlannerService {

    public Planner findByName(String theName);

    public void save(Planner thePlanner);

    public  void deleteByName(String theName);
}
