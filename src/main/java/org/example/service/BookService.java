package org.example.service;

import org.example.model.Book;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {

    Book post(Book book);

    Book put(Book book,Long id);

    Book get(Long id);

    List<Book> getAll(Pageable pageable);

    void delete(Long id);
}
