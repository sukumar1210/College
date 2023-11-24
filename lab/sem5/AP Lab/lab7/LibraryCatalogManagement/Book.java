package LibraryCatalogManagement;

public class Book {
    String title;
    String author;
    int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public void checkoutBook(){
        try {
            if (availableCopies <= 0) {
                throw new BookUnavailableException("Book is currently unavailable");
            }
            availableCopies--;
        } catch (BookUnavailableException e) {
            System.out.println("BookUnavailableException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
