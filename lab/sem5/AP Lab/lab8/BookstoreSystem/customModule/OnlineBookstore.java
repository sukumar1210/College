package customModule;

import java.util.HashSet;

public class OnlineBookstore {
    
    static HashSet<AbstractBook> books = new HashSet<AbstractBook>();
    static HashSet<CustomerClass> customers = new HashSet<CustomerClass>();

    public void addBook(AbstractBook book) {
        books.add(book);
    }

    public void addCustomer(CustomerClass customer) {
        customers.add(customer);
    }

    public void printBooks() {
        for (AbstractBook book : books) {
            System.out.println(book.title + " " + book.author + " " + book.price + " " + book.quantityAvailable);
        }
    }

    public void printCustomers() {
        for (CustomerClass customer : customers) {
            System.out.println(customer.name + " " + customer.email);
        }
    }

    public void purchaseBook(CustomerClass customer, AbstractBook book, int quantity) throws InsufficientBooksException {
        customer.purchase(book, quantity);
    }

    // public static void main(String[] args) {
    //     // Create some books
    //     AbstractBook book1 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, 5);
    //     AbstractBook book2 = new FictionBook("The Catcher in the Rye", "J. D. Salinger", 7.99, 3);
    //     AbstractBook book3 = new FictionBook("The Grapes of Wrath", "John Steinbeck", 9.99, 2);
    //     AbstractBook book4 = new NonFictionBook("The Elements of Style", "William Strunk Jr.", 9.99, 1);
    //     AbstractBook book5 = new NonFictionBook("The Immortal Life of Henrietta Lacks", "Rebecca Skloot", 12.99, 4);
    //     AbstractBook book6 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book7 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book8 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book9 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book10 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book11 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book12 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book13 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book14 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book15 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book16 = new NonFictionBook("The Right Stuff", "Tom Wolfe", 8.99, 2);
    //     AbstractBook book17 = new NonFictionBook("The Right Stuff",

}
