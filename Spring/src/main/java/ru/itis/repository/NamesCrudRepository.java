package ru.itis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.itis.model.Name;

@Repository
public interface NamesCrudRepository extends CrudRepository<Name, Long> {
}
