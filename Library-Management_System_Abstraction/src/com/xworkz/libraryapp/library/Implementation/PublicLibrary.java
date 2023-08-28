package com.xworkz.libraryapp.library.Implementation;

import com.xworkz.libraryapp.Constants.BookType;
import com.xworkz.libraryapp.DTO.BookDTO;
import com.xworkz.libraryapp.library.Library;

import java.util.Arrays;

public class PublicLibrary implements Library {

public BookDTO bookDTO[];

public PublicLibrary(int size){
    bookDTO = new BookDTO[size];
}

int index;
int id = 0;
    @Override
    public boolean addBooks(BookDTO dto) {
        boolean isAdded = false;

        if(dto != null){
            dto.setBookId(++id);
            this.bookDTO[index++] = dto;
            isAdded = true;
        }
        else{
            System.out.println("Book Details are not provided..");
        }
        return isAdded;
    }

    @Override
    public void getAllBooks() {
        System.out.println("The Number Of Books Available Are: ");
        for(int dtoIndex=0; dtoIndex<bookDTO.length; dtoIndex++){
            System.out.println(bookDTO[dtoIndex]);
        }

    }

    @Override
    public BookDTO getBooksById(int id) {
        BookDTO book = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookId() == id){
                book = bookDTO[index];
            }
        }
        return book;
    }

    @Override
    public BookDTO[] getBookByYear(int yearOfPublish) {
        //BookDTO dto1 = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getYearOfPublish() == yearOfPublish){
                return bookDTO;
            }
        }
        return bookDTO;
    }

    @Override
    public BookDTO[] getBooksByAuthor(String author) {
        //BookDTO dto2 = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getAuthorName().equals(author)){
               return bookDTO;
            }
        }
        return bookDTO;
    }

    @Override
    public BookDTO getBooksByPublisher(String publisher) {
        BookDTO book1 = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getPublisher().equals(publisher)){
                book1 = bookDTO[index];
            }
        }
        return book1;
    }

    @Override
    public String getBookNameByBookType(BookType bookType) {
        String name = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookType().equals(bookType)){
                name = bookDTO[index].getBookName();
            }
        }
        return name;
    }

    @Override
    public double getBookPriceByBookName(String bookName) {
        double price = 0;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookName().equals(bookName)){
                price = bookDTO[index].getPrice();
            }
        }
        return price;
    }

    @Override
    public String getBookNameByYearOfPublish(int year) {
        String bookName = null;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getYearOfPublish()==year){
                bookName = bookDTO[index].getBookName();
            }
        }
        return bookName;
    }

    @Override
    public boolean deleteBookById(int id) {
        boolean isDeleted = false;
        int newIndex, oldIndex;
        for(oldIndex = 0, newIndex =0; oldIndex < bookDTO.length; oldIndex++){
            if(!(bookDTO[oldIndex].getBookId() == id)){
                bookDTO[newIndex++] = this.bookDTO[oldIndex];
                isDeleted = true;
            }
        }
        bookDTO = Arrays.copyOf(bookDTO, newIndex);
        return  isDeleted = true;

    }

    @Override
    public boolean updateBookPagesByBookName(String existingBook, int updatePages) {
        boolean isPagesUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookName().equals(existingBook)){
                bookDTO[index].setNoOfPages(updatePages);
                isPagesUpdated = true;
            }
        }
        return isPagesUpdated;
    }

    @Override
    public boolean updateBookPriceByBookId(int id, double updatePrice) {
        boolean isPriceUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getBookId() == id){
                bookDTO[index].setPrice(updatePrice);
                isPriceUpdated = true;
            }
        }

        return isPriceUpdated;
    }

    @Override
    public boolean updatePublisherByAuthor(String existingAuthor, String updatePublisher) {
        boolean isPublisherUpdated = false;
        for(int index=0; index<bookDTO.length; index++){
            if(bookDTO[index].getAuthorName().equals(existingAuthor)){
                bookDTO[index].setPublisher(updatePublisher);
                isPublisherUpdated = true;
            }
        }
        return isPublisherUpdated;
    }
}
