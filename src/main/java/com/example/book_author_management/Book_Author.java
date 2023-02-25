package com.example.book_author_management;

public class Book_Author {
    private String bookName;
    private int pages;
    private String authorName;

    public Book_Author() {
    }

    public Book_Author(String bookName, int pages, String authorName) {
        this.bookName = bookName;
        this.pages = pages;
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
