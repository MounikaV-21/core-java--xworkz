class BooksTester{
public static void main(String b[]){

Books book = new Books("War and Peace", 300.00, "Novel", "Leo Tolstoy", "The Russian Messenger", 300);
/* book.name = "War and Peace";
book.price = 300.00;
book.type = "Novel";
book.author = "Leo Tolstoy";
book.publicationName = "The Russian Messenger";
book.noOfPages = 300; */
book.gainKnowledge();
System.out.println("Creating 1st copy of books");
System.out.println(book.name +", "+ book.price +", "+ book.type +", "+ book.author +", "+ book.publicationName +", "+ book.noOfPages);
System.out.println(" ");

Books book2 = new Books("Harry Potter", 900.00, "Fantasy NOvel", "Leo Tolstoy", "Bloomsbury", 500);
/* book2.name = "Harry Potter";
book2.price = 900.00;
book2.type = "Fantasy NOvel";
book2.author = "Leo Tolstoy";
book2.publicationName = "Bloomsbury";
book2.noOfPages = 500; */
book2.gainKnowledge();
System.out.println("Creating 2nd copy of books");
System.out.println(book2.name +", "+ book2.price +", "+ book2.type +", "+ book2.author +", "+ book2.publicationName +", "+ book2.noOfPages);
System.out.println(" ");

Books book3 = new Books("Where the side walk ends", 400.00, "Poetry", "Shel Silverstein", "Harper & Row", 650);
/* book3.name = "Where the side walk ends";
book3.price = 400.00;
book3.type = "Poetry";
book3.author = "Shel Silverstein";
book3.publicationName = "Harper & Row";
book3.noOfPages = 650; */
book3.gainKnowledge();
System.out.println("Creating 3rd copy of books");
System.out.println(book3.name +", "+ book3.price +", "+ book3.type +", "+ book3.author +", "+ book3.publicationName +", "+ book3.noOfPages);
System.out.println(" ");

Books book4 = new Books("Shantaram", 1049.00, "Culture", "Georgory David Roberts", "Scribe Publication", 553);
/* book4.name = "Shantaram";
book4.price = 1049.00;
book4.type = "Culture";
book4.author = "Georgory David Roberts";
book4.publicationName = "Scribe Publication";
book4.noOfPages = 553; */
book4.gainKnowledge();
System.out.println("Creating $th copy of books");
System.out.println(book4.name +", "+ book4.price +", "+ book4.type +", "+ book4.author +", "+ book4.publicationName +", "+ book4.noOfPages);
System.out.println(" ");

Books book5 = new Books("Fasting Feasting", 420.00, "Family", "Anita Desai", "Random House", 100);
/* book5.name = "Fasting Feasting";
book5.price = 420.00;
book5.type = "Family";
book5.author = "Anita Desai";
book5.publicationName = "Random House";
book5.noOfPages = 100; */
book5.gainKnowledge();
System.out.println("Creating 5th copy of books");
System.out.println(book5.name +", "+ book5.price +", "+ book5.type +", "+ book5.author +", "+ book5.publicationName +", "+ book5.noOfPages);
System.out.println(" ");

Books book6 = new Books("The White Tiger", 750.00, "Literature", "Aravind Adiga", "HarperCollins", 220);
/* book6.name = "The White Tiger";
book6.price = 750.00;
book6.type = "Literature";
book6.author = "Aravind Adiga";
book6.publicationName = "HarperCollins";
book6.noOfPages = 220; */
book6.gainKnowledge();
System.out.println("Creating 6th copy of books");
System.out.println(book6.name +", "+ book6.price +", "+ book6.type +", "+ book6.author +", "+ book6.publicationName +", "+ book6.noOfPages);
System.out.println(" ");

Books book7 = new Books("Untouchable", 250.00, "Literature", "Mulk Raj Anand", "Penguin India", 230);
/* book7.name = "Untouchable";
book7.price = 250.00;
book7.type = "Literature";
book7.author = "Mulk Raj Anand";
book7.publicationName = "Penguin India";
book7.noOfPages = 230; */
book7.gainKnowledge();
System.out.println("Creating 7th copy of books");
System.out.println(book7.name +", "+ book7.price +", "+ book7.type +", "+ book7.author +", "+ book7.publicationName +", "+ book7.noOfPages);
System.out.println(" ");

Books book8 = new Books("The shadow lines", 480.00, "Novel", "Amitav Ghosh", "Ravi Dayal", 580);
/* book8.name = "The shadow lines";
book8.price = 480.00;
book8.type = "Novel";
book8.author = "Amitav Ghosh";
book8.publicationName = "Ravi Dayal";
book8.noOfPages = 580; */
book8.gainKnowledge();
System.out.println("Creating 8th copy of books");
System.out.println(book8.name +", "+ book8.price +", "+ book8.type +", "+ book8.author +", "+ book8.publicationName +", "+ book8.noOfPages);
System.out.println(" ");

Books book9 = new Books("In custody", 80.00, "History", "Anita Desai", "Desai", 620);
/* book9.name = "In custody";
book9.price = 80.00;
book9.type = "History";
book9.author = "Anita Desai";
book9.publicationName = "Desai";
book9.noOfPages = 620; */
book9.gainKnowledge();
System.out.println("Creating 9th copy of books");
System.out.println(book9.name +", "+ book9.price +", "+ book9.type +", "+ book9.author +", "+ book9.publicationName +", "+ book9.noOfPages);
System.out.println(" ");

Books book10 = new Books("Serious Men", 220.00, "NOvel", "Menu Joseph", "HarperCollins", 410);
/* book10.name = "Serious Men";
book10.price = 220.00;
book10.type = "NOvel";
book10.author = "Menu Joseph";
book10.publicationName = "HarperCollins";
book10.noOfPages = 410; */
book10.gainKnowledge();
System.out.println("Creating 10th copy of books");
System.out.println(book10.name +", "+ book10.price +", "+ book10.type +", "+ book10.author +", "+ book10.publicationName +", "+ book10.noOfPages);
}
}