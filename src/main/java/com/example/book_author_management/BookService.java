package com.example.book_author_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book_Author addBook(Book_Author book_author){
        return  bookRepository.addBook(book_author);
    }

    public String getBookByHighestPages(){
        return bookRepository.getBookByHighestPages();
    }

    public String getAuthorWithHighestPages(){
        return bookRepository.getAuthorWithHighestPages();
    }
    public String updatePages(String bookName){
        int pages=100;
        return bookRepository.updatePages(bookName,pages);
    }
}
