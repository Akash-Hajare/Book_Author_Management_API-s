package com.example.book_author_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book-author")
public class BookController {
    @Autowired
    BookService bookService;


    @PostMapping("/add-book")
    public ResponseEntity<Book_Author> addBook(@RequestBody Book_Author book_author){
       Book_Author response= bookService.addBook(book_author);
       return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/get-book-by-highest-pages")
    public ResponseEntity<String> getBookByHighestPages(){
        String reponse= bookService.getBookByHighestPages();
        return new ResponseEntity<>(reponse,HttpStatus.OK);
    }

    @GetMapping("/get-author-by-highest-pages")
    public ResponseEntity<String> getAuthorByHighestPages(){
        String reponse= bookService.getAuthorWithHighestPages();
        return new ResponseEntity<>(reponse,HttpStatus.OK);
    }

    @PutMapping("/update-book-pages/{bookname}")
    public ResponseEntity<String> updatePages(@PathVariable("bookname") String bookName){
        String response= bookService.updatePages(bookName);
        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
    }
}
