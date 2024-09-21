package com.example.SkillWillSpringProject3.Services;

import com.example.SkillWillSpringProject3.Entities.UserEntity;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.naming.NameNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private ArrayList<UserEntity> UserList = new ArrayList<>();

    public UserEntity createUser(UserEntity user)
    {
        UserList.add(user);
        return user;
    }

    public List<UserEntity> getAllUsers()
    {
        return UserList;
    }

    public UserEntity editUser(int index,UserEntity userEntity)
    {
        UserEntity user = UserList.get(index);
        user.setFirstname(userEntity.getFirstname());
        user.setLastname(userEntity.getLastname());
        user.setAge(userEntity.getAge());
        return user;

    }

    public UserEntity getUserByIndex(int index)
    {
        UserEntity user = UserList.get(index);
        return user;
    }

    public void removeUserByIndex(int index)
    {
        UserEntity user = UserList.get(index);
        if (user != null) {
            UserList.remove(index); // Successfully remove the user
        }else {
        System.out.println("user is not found");
}
    }
}
