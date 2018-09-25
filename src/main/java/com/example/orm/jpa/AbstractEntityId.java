package com.example.orm.jpa;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.MappedSuperclass;

import com.example.util.ArtifactForFramework;

@MappedSuperclass
public abstract class AbstractEntityId<T extends Serializable> implements Serializable, EntityId<T> {
	
	private static final long serialVersionUID = 5446822754021149721L;
	
	private T id;
	
	@ArtifactForFramework
	protected AbstractEntityId() {		
	}

	public AbstractEntityId(T id) {
		this.id = Objects.requireNonNull(id);
	}
	
	@Override
	public T getId() {		
		return id;
	}
	
	@Override
	public String asString() {		
		return id.toString();
	}

	@Override
	public int hashCode() {		
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (this == obj) {
			return true;
		} else if (obj instanceof AbstractEntityId) {
			AbstractEntityId other = (AbstractEntityId) obj;
			result = Objects.equals(id, other.id);
		}
		
		return result;
	}
	
	@Override
	public String toString() {		
		return toStringHelper(this)
				.add("id", id)
				.toString();
	}
}
