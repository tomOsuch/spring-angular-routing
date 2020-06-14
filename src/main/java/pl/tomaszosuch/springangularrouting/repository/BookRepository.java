package pl.tomaszosuch.springangularrouting.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.tomaszosuch.springangularrouting.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
