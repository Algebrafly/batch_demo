package com.algebra.batch.repository.write;

import com.algebra.batch.domain.People;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author al
 */
public interface PeopleRepository extends JpaRepository<People, Long> {
}
