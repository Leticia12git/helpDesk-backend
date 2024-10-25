package com.leticia.HelpDesk.repositories;

import com.leticia.HelpDesk.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
