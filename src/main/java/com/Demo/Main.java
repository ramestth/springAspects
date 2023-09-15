package com.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext con = new AnnotationConfigApplicationContext(BeansConfig.class);
        ShoppingCart cart = con.getBean(ShoppingCart.class);
        cart.checkOut("confirmed");
        cart.quantity();
    }
}