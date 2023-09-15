package com.Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public  void checkOut(String s)
    {
        System.out.println("this is checkout");
    }

    public  int quantity()
    {
       return 2;
    }
}
