package org.TheRJHub.UserManagement.Controller;
import java.util.List;

import org.TheRJHub.UserManagement.dto.Users;
import org.TheRJHub.UserManagement.repo.UserRepository;
import org.TheRJHub.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserRepository up;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public Users add(@RequestBody Users user) {
		 return userService.saveUser(user);
	}
	
    @GetMapping("/all")
    public List<Users> all() {
        return up.findAll();
    }
}
