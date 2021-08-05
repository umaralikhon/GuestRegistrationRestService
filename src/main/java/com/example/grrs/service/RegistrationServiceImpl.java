package com.example.grrs.service;

import com.example.grrs.entity.Guest;
import com.example.grrs.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    private RegistrationRepository repository;

    @Override
    public List<Guest> getAllGuests(){
        List<Guest> allGuests = repository.findAll();
        return allGuests;
    }

    @Override
    public Guest getGuestById(String id){
        Guest guest = repository.getById(id);
        return guest;
    }

    @Override
    public void save(Guest guest){
        repository.save(guest);
    }

    @Override
    public void deleteById(String id){
        repository.deleteById(id);
    }
}
