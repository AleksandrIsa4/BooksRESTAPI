package org.example.service;

import org.example.model.Author;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AuthorService {

    Author post(Author author);

    Author put(Author author,Long id);

    Author get(Long id);

    void delete(Long id);

    Author search(String name);

    List<Author> searchNames(List<String> names);

    List<Author> getAll(Pageable pageable);
}
