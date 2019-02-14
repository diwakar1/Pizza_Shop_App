package com.example.java;

import java.util.Scanner;

public class Italian extends Pizza
{


    public Italian()
    {
        this.type = "Italian";

    }


    public Italian(int size)
    {
        super(size);
        this.type = "Italian";
    }


    public  double getCost()

    {
        return this.cost;
    }


    @Override
    public void getToppings()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("how many topings would want?");
        int numToppings = in.nextInt();
        while (numToppings >2)
        {
            System.out.println("sorry, you are limited to  only two toppings. ");
            System.out.println("how many toppings would you like ?");
            numToppings=in.nextInt();
        }
        in.nextLine();
        for(int i = 0;i<numToppings;i++)
        {
            System.out.println("Enter topping: ");
            String topping = in.nextLine();
            toppings.add(topping);
            this.cost += 2.50;
        }

    }
}
