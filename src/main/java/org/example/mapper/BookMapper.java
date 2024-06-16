package org.example.mapper;

import org.example.dto.BookRequest;
import org.example.dto.BookResponse;
import org.example.model.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toBook(BookRequest bookRequest);

    BookResponse toBookResponse(Book book);

    List<BookResponse> toBookResponseSet(List<Book> books);
}