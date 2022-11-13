package com.test.libapp.repository;

import com.test.libapp.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Person, Long> {
	Optional<Person> findByUsername(String username);
}
