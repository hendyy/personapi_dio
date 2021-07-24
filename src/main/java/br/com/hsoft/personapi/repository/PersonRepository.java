package br.com.hsoft.personapi.repository;

import br.com.hsoft.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
