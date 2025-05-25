class Book {
    private String title = "Unknown Title";
    private String author;

    public Book() {
        author = "Unknown Author";
    }

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public void setTitle(String t) {
        title = t;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public String toString() {
		return "Title: " + title + ", Author: " + author;
	}
}

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "Riya");

        b1.setAuthor("Diya");
        
        System.out.println(b1);
        System.out.println(b2);
    }
}
