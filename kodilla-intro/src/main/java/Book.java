public class Book {
    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static Book of(String author, String title) {
        System.out.println("The book \"" + title + "\" by " + author + ".");
        return new Book(author, title);
    }
}
