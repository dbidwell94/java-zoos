package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZoosRepository extends CrudRepository<Zoo, Long> {

}
