package com.sabaragamuwa.miniproject.EventPlatformBackend.DAO;

import com.sabaragamuwa.miniproject.EventPlatformBackend.entity.User;

public interface UserDAO {

    public  void save(User theUser);

    public void deleteById(int theId);

    public User findById(int theId);
}
