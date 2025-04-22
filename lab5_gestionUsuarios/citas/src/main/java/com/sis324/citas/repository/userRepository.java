package com.sis324.citas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sis324.citas.model.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {

}
