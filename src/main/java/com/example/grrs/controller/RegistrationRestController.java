package com.example.grrs.controller;

import com.example.grrs.entity.Guest;
import com.example.grrs.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class RegistrationRestController {
    @Autowired
    private RegistrationService service;

    @GetMapping("/guests")
    public List<Guest> getAllGuests(){
        List<Guest> allGuests = service.getAllGuests();
        return allGuests;
    }

    @GetMapping("/guests/{id}")
    public Guest getGuestById(@PathVariable String id){
        Guest guest = service.getGuestById(id);
        return guest;
    }

    @PostMapping("/guests")
    public Guest save(@RequestBody Guest guest){
        service.save(guest);
        return guest;
    }

    @PutMapping("/guests")
    public Guest update(@RequestBody Guest  guest){
        service.save(guest);
        return guest;
    }

    @DeleteMapping("/guests/{id}")
    public String deleteById(@PathVariable String id){
        service.deleteById(id);
        return "Guest deleted!";
    }
}
