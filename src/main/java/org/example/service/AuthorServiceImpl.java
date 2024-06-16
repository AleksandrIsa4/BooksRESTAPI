package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.exceptions.DataNotFoundException;
import org.example.model.Author;
import org.example.repository.AuthorRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public Author post(Author author) {
        return authorRepository.save(author);
    }

    public Author put(Author author, Long id) {
        get(id);
        author.setId(id);
        return authorRepository.save(author);
    }

    public Author get(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(() -> new DataNotFoundException("Нет автора с id=" + id));
        return author;
    }

    public void delete(Long id) {
        get(id);
        authorRepository.deleteById(id);
    }

    public Author search(String name) {
        Author author = authorRepository.findByName(name).orElse(new Author());
        if (author.getName() == null) {
            author.setName(name);
            author = authorRepository.save(author);
        }
        return author;
    }

    public List<Author> searchNames(List<String> names){
        List<Author> authors=authorRepository.findByNameIn(names);
        if(authors.size() != names.size()){
            for (Author author:authors){
                names.remove(author.getName());
            }
            throw new DataNotFoundException("Не существуют следующие авторы "+names.toString());
        }
        return authors;
    }

    public List<Author> getAll(Pageable pageable){
        return authorRepository.findAllBy(pageable);
    }
}
