package Module_1.Day_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Book
{
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author, boolean isAvailable) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Getter methods
    public int getBookID()
    {
        return bookID;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public boolean getIsAvailable()
    {
        return isAvailable;
    }

    //setter method
    public void setBookID(int bookID)
    {
        this.bookID=bookID;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

class Library
{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Library library=new Library();
//        ArrayList<Book> books=new ArrayList<>();
        System.out.println("Enter the number of books being sorted");
        int size=input.nextInt();
        Book [] book=new Book[size];

       boolean flag=true;
       int bookcount=0;
       while (flag)
       {
           System.out.println(
                                "1.Add books \n" +
                                "2.Remove book\n" +
                                "3.Search book\n" +
                                "4.Display books\n" +
                                "5.Exit");

           System.out.print("choose the option: ");

           int choice=input.nextInt();
           input.nextLine();

           System.out.println();
           switch (choice)
           {
               case 1:
               {
                   if(bookcount<size) {

                       for (int i = 0; i < book.length; i++) {
//                       Scanner input=new Scanner(System.in);
                           System.out.println();
                           System.out.print("Enter the bookId: ");
                           int bookid = Integer.parseInt(input.nextLine());  // storing book id
                           System.out.println();

                           System.out.print("Enter the title of the book: ");
                           String title = input.nextLine();  // Storing title of the book
                           System.out.println();

                           System.out.print("Enter the author name of the book: ");
                           String author = input.nextLine();
                           System.out.println();
                           //Storing author name
                           book[i] = new Book(bookid, title, author, true);  // storing the data in an object in the book class
                           bookcount++;
                       }

                   }
                   else {
                       System.out.println("Library is full. Cannot add more books\n");
                   }

                   break;
               }
               case 2:
               {
                   // removing a book from the class
                   System.out.print("Enter the id of the book: ");
                   int id=input.nextInt();
                   library.Removebook(book,id);
                   break;
               }
               case 3:
               {
                   //searching the book was in the class or not
                    System.out.println("Enter the id of the book");
                    int id=input.nextInt();
                    library.Searchbook(book,id);
                    break;
               }
               case 4:
               {
                   library.display(book);
                   break;
               }

               case 5:
               {
                   //use to close the program
                   flag=false;
                   break;
               }
               default:
               {
                   System.out.println("Invalid input try again");
               }
           }
       }


    }


    public Book[] Removebook(Book[] books,int id)
    {
        boolean found = false; // using to book was present or not
        int index_to_remove=-1;  // use to store which book we're removing index values
        for (int i = 0; i < books.length; i++)
        {

            if(books[i].getBookID()==id)
            {
                index_to_remove=i; //storing the index of the removing book
                found=true;
                break;
            }

        }

        //  removing the book from the array
        Book[] copy_book=new Book[books.length-1];  //we're copying the book full data in another new object

        int index=0; // we're using this index to make to remove the book

        for (int i = 0; i < copy_book.length; i++)
        {
            // if the removing book index gets, we don't add the data in the new book
            if (i!=index_to_remove)
            {
                copy_book[index++]=books[i];
            }

        }
        if(!found) {
        System.out.println("Book with ID " + id + " not found.");

            }
        return copy_book;
    }

    public void Searchbook(Book[] books,int id)
    {
        String avaiable;
        for (int i = 0; i < books.length; i++)
        {
            if(books[i].getBookID()==id) //checking the book was present in the book class
            {
                if(books[i].getIsAvailable())
                {
                    avaiable="yes";
                }
                else {
                    avaiable="No";
                }
                System.out.println("Book with ID " + id + " has been found.");
                System.out.println("Books details-> ");
                System.out.println("BookID: "+books[i].getBookID()+"\nBook Name: "+ books[i].getTitle()+"\nAuthor Name: "+books[i].getAuthor()+"\nIsAvailable: "+avaiable);
                System.out.println();
                break;
            }

        }

    }

    public void display(Book[] books)
    {
        String avaiable;

        for (Book book:books)
        {
            if(book.getIsAvailable())
            {
                avaiable="yes";
            }
            else {
                avaiable="No";
            }
            System.out.println("Books details-> ");
            System.out.println("BookID: "+book.getBookID()+"\nBook Name: "+ book.getTitle()+"\nAuthor Name: "+book.getAuthor()+"\nIsAvailable: "+avaiable);
            System.out.println();
        }


    }

}
