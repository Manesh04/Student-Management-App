package com.example.user.Controller;

import com.example.user.User;
import com.example.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestUserController {

    @Autowired
    UserService userService;
    @PostMapping("/createUser")
    public User addUser(@RequestBody User user){
        return userService.createUser(user);
    }

    // CLEARLY WORKING
    @PutMapping("/updateUser/{id}")
    public User updateGroup(@PathVariable(value = "id") int id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }


    @DeleteMapping("/deleteGroup/{groupId}")
    public String deleteUser(@PathVariable(value = "id") int id) {
        userService.deleteUser(id);
        return "Deleted successfully....!";
    }


}
