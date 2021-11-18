package com.example.shop.repositories;

import com.example.shop.models.Users;
import org.springframework.data.repository.CrudRepository;

public interface Repositorie extends CrudRepository<Users,Long> {

}
