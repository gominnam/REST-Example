package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service //@Component도 가능하지만 용도를 명확하게 하기위해 @Service 사용
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static{
        users.add(new User(1, "kominjun", new Date()));
        users.add(new User(2, "cortexKK", new Date()));
        users.add(new User(3, "coolGuy", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++userCount);
        }

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }

        return null;
    }
}
