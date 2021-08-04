package net.javaheap.books;

import java.util.Date;

public class Book {

    private Integer id;
    private String name;
    private String description;
    private Date publishDate;

    public Book(Integer id, String name, String description, Date publishDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.publishDate = publishDate;
    }

    public Book(int id, String name, String description) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
