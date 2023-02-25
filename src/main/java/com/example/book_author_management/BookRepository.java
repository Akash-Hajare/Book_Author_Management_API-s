package com.example.book_author_management;

import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.*;

@Repository
public class BookRepository {
    Map<String, List<Book_Author>> db;
    //mapping author with their books

    public BookRepository(Map<String, List<Book_Author>> db) {
        this.db = db;
    }

    public Book_Author addBook(Book_Author book) {

        List<Book_Author> bookList = db.getOrDefault(book.getAuthorName(), new ArrayList<>());
        bookList.add(book);
        db.put(book.getAuthorName(), bookList);
        return book;
    }

    public String getBookByHighestPages() {
        int pages = 0;
        String bookName = "";
        Set<String> authorName = db.keySet();

        for (String name : authorName) {
            List<Book_Author> bookList = db.get(name);

            for (Book_Author book : bookList) {
                if (book.getPages() > pages) {
                    pages = book.getPages();
                    bookName = book.getBookName();
                }
            }
        }
        return bookName;
    }


    public String updatePages(String book_name, int pages) {
        Set<String> authorName = db.keySet();
        for (String name : authorName) {
            List<Book_Author> bookList = db.get(name);

            for (Book_Author book : bookList) {
                if (book.getBookName().equals(book_name)) {
                    book.setPages(pages);
                }
            }
        }
        return "Pages update SuccessFully";
    }


    public String getAuthorWithHighestPages() {
        int pages = 0;
        String author = "";
        Set<String> authorName = db.keySet();

        for (String name : authorName) {
            List<Book_Author> bookList = db.get(name);

            for (Book_Author book : bookList) {
                if (book.getPages() > pages) {
                    pages = book.getPages();
                    author = book.getAuthorName();
                }
            }
        }
        return author;
    }

}