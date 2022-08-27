public class Book {
    String name;
    Author author;
    int publisherYear;

    public Book(String name, Author author, int publisherYear) {
        this.name = name;
        this.author = author;
        this.publisherYear = publisherYear;
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
