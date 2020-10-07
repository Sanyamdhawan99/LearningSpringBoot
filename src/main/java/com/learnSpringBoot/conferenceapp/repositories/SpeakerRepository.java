package com.learnSpringBoot.conferenceapp.repositories;

import com.learnSpringBoot.conferenceapp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
