package com.rental.controller;
import com.rental.entity.User;
import com.rental.service.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Display all users
    @GetMapping("/list")
    public String listUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "user-list";
    }

    // Show form for creating a new user
    @GetMapping("/create")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    // Save or update a user
    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/user/list";
    }

    // Edit user
    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") String id, Model model) {
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            model.addAttribute("user", user.get());
            return "user-form";
        } else {
            return "error";  // Add a user-friendly error page
        }
    }

    // Delete user
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        userService.deleteUserById(id);
        return "redirect:/user/list";
    }
}
