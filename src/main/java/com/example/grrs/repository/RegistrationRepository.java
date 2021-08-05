package com.example.grrs.repository;

import com.example.grrs.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Guest, String> {
}
