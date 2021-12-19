package com.uj.user.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.uj.user.entity.User;

@RestController
public class UserController {

	List<User> users = new ArrayList<>(
			Arrays.asList(new User(1, "upendra", "joshi", "java"), new User(2, "Savy", "Yo", "Dot Net")));

	@GetMapping("/{userId}")
	public User getUserDetails(@PathVariable Integer userId) {
		return users.stream().filter(user -> user.getUserId().equals(userId)).findFirst().get();
	}

	@GetMapping("/")
	public List<User> getAllUserDetails() {
		return users;
	}

}
