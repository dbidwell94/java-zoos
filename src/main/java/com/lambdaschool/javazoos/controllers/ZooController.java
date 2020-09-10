package com.lambdaschool.javazoos.controllers;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.services.ZooServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zoos")
public class ZooController {

    @Autowired
    ZooServices zooServices;

    @GetMapping(value = "/zoos", produces = "application/json")
    private ResponseEntity<?> getAllZoos() {
        List<Zoo> zoos = zooServices.getAllZoos();
        return new ResponseEntity<>(zoos, HttpStatus.OK);
    }
}
