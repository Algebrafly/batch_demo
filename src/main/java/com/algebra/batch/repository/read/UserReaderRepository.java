package com.algebra.batch.repository.read;


import com.algebra.batch.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author al
 */
public interface UserReaderRepository extends PagingAndSortingRepository<User, Long> {
    @Override
    Page<User> findAll(Pageable pageable);

    Page<User> findAllByFirstNameLike(String firstName, Pageable pageable);
}
