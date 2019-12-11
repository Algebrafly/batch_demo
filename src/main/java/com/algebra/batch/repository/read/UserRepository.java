package com.algebra.batch.repository.read;


import com.algebra.batch.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author al
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();
}
