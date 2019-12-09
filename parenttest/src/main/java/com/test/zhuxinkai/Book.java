package com.test.zhuxinkai;

        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.boot.context.properties.ConfigurationProperties;
        import org.springframework.stereotype.Component;

        import java.security.PrivateKey;

@Component
@ConfigurationProperties(prefix = "book")

public class Book {
    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
    @Value("${book.price}")
    private float price;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
