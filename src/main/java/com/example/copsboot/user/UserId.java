package com.example.copsboot.user;

import java.util.UUID;

import com.example.orm.jpa.AbstractEntityId;

public class UserId extends AbstractEntityId<UUID> {

	private static final long serialVersionUID = -6582017001997175193L;

	protected UserId() {		
	}
	
	public UserId(UUID id) {
		super(id);
	}
}
