package com.umesh.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.umesh.demo.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    List<User> findByFirstName(String firstName);

    List<User> findByMiddleNameContains(String firstName);

    List<User> findByRole_RoleName(String roleName);
}