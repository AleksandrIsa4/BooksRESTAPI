package org.example.repository;

import org.example.model.Author;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Optional<Author> findByName(String name);

    List<Author> findByNameIn(List<String> names);

    List<Author> findAllBy(Pageable pageable);
}
