package com.example.grrs.service;

import com.example.grrs.entity.Guest;

import java.util.List;

public interface RegistrationService {
    List<Guest> getAllGuests();
    Guest getGuestById(String id);
    void save(Guest guest);
    void deleteById(String id);
}
