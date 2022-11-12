import java.util.Objects;

public class Book {
    String name;
    Author author;
    int publisherYear;

    public Book(String name, Author author, int publisherYear) {
        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publisherYear == book.publisherYear && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public String toString() {
        return "Название книги : " + name +
                ", Автор:" + getAuthor().toString() +
                ", год публикации: " + publisherYear +
                "г.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publisherYear);
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }
}
