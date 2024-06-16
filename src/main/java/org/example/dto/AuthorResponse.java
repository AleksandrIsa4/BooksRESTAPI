package org.example.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
public class AuthorResponse {

    Long id;
    String name;

    List<BookResponseForAuthor> books;
}