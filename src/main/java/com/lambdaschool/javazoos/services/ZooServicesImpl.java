package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repositories.ZoosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ZooServicesImpl implements ZooServices {

    @Autowired
    ZoosRepository zoosRepository;

    @Override
    public List<Zoo> getAllZoos() {
        List<Zoo> zoos = new ArrayList<>();
        zoosRepository.findAll().iterator().forEachRemaining(zoos::add);
        return zoos;
    }

    @Override
    public Zoo getZooById(long id) {
        Zoo z = zoosRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Zoo with id %d not found", id)));
        return z;
    }
}
