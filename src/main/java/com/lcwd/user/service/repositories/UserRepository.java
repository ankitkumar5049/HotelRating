package com.lcwd.user.service.repositories;

import com.lcwd.user.service.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

}
