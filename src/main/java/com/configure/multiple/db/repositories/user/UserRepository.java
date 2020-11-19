package com.configure.multiple.db.repositories.user;

import com.configure.multiple.db.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
