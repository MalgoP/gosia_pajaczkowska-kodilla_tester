package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
    private static Map<Book, Book> booksMap = new HashMap<>();

    public static Book createBook(String title, String author) {
        Book result = new Book(title, author);
        if (booksMap.get(result) != null) {
            return booksMap.get(result);
        } else {
            booksMap.put(result, result);
            return result;
        }
    }
}
