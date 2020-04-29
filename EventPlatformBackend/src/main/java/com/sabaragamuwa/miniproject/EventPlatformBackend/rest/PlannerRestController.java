package com.sabaragamuwa.miniproject.EventPlatformBackend.rest;

import com.sabaragamuwa.miniproject.EventPlatformBackend.Service.PlannerService;
import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.Planner;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apis")
public class PlannerRestController {

    private PlannerService plannerService;

    public PlannerRestController(PlannerService thePlannerService) {
        plannerService = thePlannerService;
    }

    @GetMapping("/planner/{plannerName}")
    public Planner getUser(@PathVariable String plannerName){

        Planner thePlanner = plannerService.findByName(plannerName);

        if (thePlanner == null) {
            throw new RuntimeException("Planner Name did not found" + plannerName);

        }
        return thePlanner;
    }

    @PostMapping("/planner")
    public Planner addPlanner(@RequestBody Planner thePlanner){

//        thePlanner.setP_name(null);

        Planner tempPlanner = plannerService.findByName(thePlanner.getP_name());

        if (tempPlanner != null) {
            throw new RuntimeException("Planner Name Alreay Exists. Please enter another one!");

        }

        plannerService.save(thePlanner);
        return thePlanner;
    }

    @PutMapping("/planner")
    public Planner updatePlanner(@RequestBody Planner thePlanner){

        plannerService.save(thePlanner);

        return thePlanner;
    }

    @DeleteMapping("/planner/{plannerName}")
    public String deletePlanner(@PathVariable String plannerName){

        Planner thePlanner = plannerService.findByName(plannerName);

        if (thePlanner == null){
            throw  new RuntimeException("Planner did not found "+ plannerName);

        }

        plannerService.deleteByName(plannerName);

        return "Deleted Planner Name:" + plannerName ;
    }
}
