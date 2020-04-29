package com.sabaragamuwa.miniproject.EventPlatformBackend.rest;

import com.sabaragamuwa.miniproject.EventPlatformBackend.DAO.UserDAO;
import com.sabaragamuwa.miniproject.EventPlatformBackend.Service.UserService;
import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private UserService userService;

    public UserRestController(UserService theUserService) {
        userService = theUserService;
    }

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable int userId){

        User theUser = userService.findById(userId);

        if (theUser == null) {
            throw new RuntimeException("User Id did not found" + userId);

        }
        return theUser;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User theUser){

        theUser.setId(0);

        userService.save(theUser);
        return theUser;
    }

//    @PutMapping("/users")
//    public User updateUser(@RequestBody User theUser){
//
//        userService.save(theUser);
//
//        return theUser;
//    }

    @DeleteMapping("/users/{userId}")
    public String deleteUser(@PathVariable int userId){

        User theUser = userService.findById(userId);

        if (theUser == null){
            throw  new RuntimeException("Employee did not found "+ userId);

        }

        userService.deleteById(userId);

        return "Deleted Employee Id:" + userId ;
    }


}
