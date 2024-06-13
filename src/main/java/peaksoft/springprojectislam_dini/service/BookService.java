package peaksoft.springprojectislam_dini.service;

import peaksoft.springprojectislam_dini.entity.Book;
import peaksoft.springprojectislam_dini.entity.User;

import java.util.List;

public interface BookService {

    void saveBook(Long userId,Book newBook);
    List<Book>findAllBooks();
    Book findByIdBook(Long bookId);
    void updateBookById(Long bookId, Book newBook);
    void deleteById(Long bookId);
    List<Book> BookSearch(String word);
}
