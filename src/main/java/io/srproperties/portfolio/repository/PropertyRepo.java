package io.srproperties.portfolio.repository;

import io.srproperties.portfolio.model.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepo extends CrudRepository<Property, Long> {
}
