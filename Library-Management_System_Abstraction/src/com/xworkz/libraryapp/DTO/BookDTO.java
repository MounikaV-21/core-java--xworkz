package com.xworkz.libraryapp.DTO;

import com.xworkz.libraryapp.Constants.BookType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookDTO {

private int bookId;
private  String bookName;
private String authorName;
private String publisher;
private  int yearOfPublish;
private  int noOfPages;
private double price;
private BookType bookType;
}
