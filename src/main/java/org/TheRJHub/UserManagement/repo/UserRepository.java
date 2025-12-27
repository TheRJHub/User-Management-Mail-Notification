package org.TheRJHub.UserManagement.repo;

import org.TheRJHub.UserManagement.dto.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String>{

}
