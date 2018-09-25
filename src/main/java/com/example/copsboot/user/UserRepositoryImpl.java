package com.example.copsboot.user;

import java.util.UUID;

import com.example.orm.jpa.UniqueIdGenerator;

public class UserRepositoryImpl implements UserRepositoryCustom {

	private final UniqueIdGenerator<UUID> generator;
	
	public UserRepositoryImpl(UniqueIdGenerator<UUID> generator) {
		this.generator = generator;
	}
	
	@Override
	public UserId nextId() {			
		return new UserId(generator.getNextUniqueId());
	}

	
}
