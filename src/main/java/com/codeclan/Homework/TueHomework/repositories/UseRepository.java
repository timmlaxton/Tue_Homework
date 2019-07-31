package com.codeclan.Homework.TueHomework.repositories;

import com.codeclan.Homework.TueHomework.projections.UserEmbed;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

@RepositoryRestResource(excerptProjection = UserEmbed.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
