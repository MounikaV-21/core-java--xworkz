package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.Constants.BookType;
import com.xworkz.libraryapp.DTO.BookDTO;

public interface Library {
    public boolean addBooks(BookDTO dto);

    public void getAllBooks();
    public BookDTO getBooksById(int id);
    public BookDTO[] getBookByYear(int yearOfPublish);
    public BookDTO[] getBooksByAuthor(String author);
    public BookDTO getBooksByPublisher(String publisher);

    public String getBookNameByBookType(BookType bookType);
    public double getBookPriceByBookName(String bookName);
    public String getBookNameByYearOfPublish(int year);

    public boolean deleteBookById(int id);

    public boolean updateBookPagesByBookName(String existingBook, int updatePages);

    public boolean updateBookPriceByBookId(int id, double updatePrice);
    public  boolean updatePublisherByAuthor(String existingAuthor, String updatePublisher);
}