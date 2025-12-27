package org.TheRJHub.UserManagement.service;

import org.TheRJHub.UserManagement.dto.Users;
import org.TheRJHub.UserManagement.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository up;
	
	@Autowired
	private MailSenderUser msu;

	
    public Users saveUser(Users user) {
        Users savedUser = up.save(user);
        msu.sendMail("UrMail@gmail.com", "New user inserted:\nName: "+user.getName());
        return savedUser;
    }
}
