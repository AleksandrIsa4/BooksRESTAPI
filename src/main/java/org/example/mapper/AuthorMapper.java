package org.example.mapper;

import org.example.dto.*;
import org.example.model.Author;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AuthorMapper {

    AuthorResponse toAuthorResponse(Author author);

    Author toAuthor(AuthorRequest authorRequest);

    List<AuthorResponse> toAuthorResponseSet(List<Author> authors);
}
