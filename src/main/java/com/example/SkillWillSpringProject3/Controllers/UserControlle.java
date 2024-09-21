package com.example.SkillWillSpringProject3.Controllers;

import com.example.SkillWillSpringProject3.Entities.UserEntity;
import com.example.SkillWillSpringProject3.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Users")
public class UserControlle {

    @Autowired
    private UserService service;




    @GetMapping("/GetAllUsers")
    public List<UserEntity> getAllUsers()
    {
        return service.getAllUsers();
    }

    @GetMapping("/GetUserByIndex/{index}")
    public UserEntity getByIndex(int index)
    {
      return service.getUserByIndex(index);
    }

    @PostMapping("/CreateUser")
    public UserEntity creatUser(@RequestBody UserEntity user)
    {
        return service.createUser(user);
    }

    @DeleteMapping("/RemoveUser/{index}")
    public void removeUser(int index)
    {
        service.removeUserByIndex(index);
    }

    @PutMapping("/EditUser/{index}")
    public UserEntity editUser(@RequestParam int index,@RequestBody UserEntity user)
    {
        return service.editUser(index,user);

    }


}
