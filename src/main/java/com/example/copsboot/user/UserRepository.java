package com.example.copsboot.user;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, UUID>, UserRepositoryCustom {

}
