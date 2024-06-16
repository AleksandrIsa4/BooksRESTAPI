package org.example.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class BookResponse {

    Long id;
    String title;

    String isbn;
    List<AuthorResponseForBooks> authors;
}