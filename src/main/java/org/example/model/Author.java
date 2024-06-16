package org.example.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Builder
@Table(name = "autors")
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID автора")
    @Column(name = "id")
    Long id;

    @Schema(description = "Имя")
    @Column(name = "name")
    String name;

    @ManyToMany
            //(mappedBy = "author")
    @JoinTable(name = "books_autors",
            joinColumns = @JoinColumn(name = "autors_id"),
            inverseJoinColumns = @JoinColumn(name = "books_id"))
    List<Book> books;
}