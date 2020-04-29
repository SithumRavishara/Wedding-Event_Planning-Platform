package com.sabaragamuwa.miniproject.EventPlatformBackend.Service;

import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.User;

public interface UserService {

    public User findById(int theId);

    public void save(User theUser);

    public  void deleteById(int theId);
}
