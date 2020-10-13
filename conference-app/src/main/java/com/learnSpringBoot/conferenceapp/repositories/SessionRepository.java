package com.learnSpringBoot.conferenceapp.repositories;

import com.learnSpringBoot.conferenceapp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
