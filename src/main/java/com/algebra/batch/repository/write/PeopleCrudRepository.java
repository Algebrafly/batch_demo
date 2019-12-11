package com.algebra.batch.repository.write;


import com.algebra.batch.domain.People;
import org.springframework.data.repository.CrudRepository;

/**
 * @author al
 */
public interface PeopleCrudRepository extends CrudRepository<People, Long> {
}
