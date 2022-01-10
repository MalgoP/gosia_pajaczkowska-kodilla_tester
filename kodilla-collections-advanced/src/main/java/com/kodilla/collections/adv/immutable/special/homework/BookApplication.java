package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book2 = BookManager.createBook("Forrest Gump", "Winston Groom");
        Book book3 = BookManager.createBook("Forrest Gump", "Winston Groom");
        Book book4 = BookManager.createBook("Harry Potter and the Sorcerer's Stone", "J.K. Rowling");
        Book book5 = BookManager.createBook("Promise Me", "Harlan Coben");

        System.out.println(book1==book2);
        System.out.println(book2==book3);
        System.out.println(book1==book4);
        System.out.println(book2==book5);
    }
}
