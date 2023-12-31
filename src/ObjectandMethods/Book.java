package ObjectandMethods;

import java.util.Objects;

public class Book {
    private final String titleBook;
    private final Authors authors;
    private int yearPublisher;

    public Book(String titleBook, Authors authors, int yearPublisher) {
        this.titleBook = titleBook;
        this.authors = authors;
        this.yearPublisher = yearPublisher;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Authors getAuthors() {
        return authors;
    }

    public int getYearPublisher() {
        return yearPublisher;
    }

    public void setYearPublisher(int yearPublisher) {
        this.yearPublisher = yearPublisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublisher == book.yearPublisher && Objects.equals(titleBook, book.titleBook) && Objects.equals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleBook, authors, yearPublisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleBook='" + titleBook + '\'' +
                ", authors=" + authors +
                ", yearPublisher=" + yearPublisher +
                '}';
    }
}
