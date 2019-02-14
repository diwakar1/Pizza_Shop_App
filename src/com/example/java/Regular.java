package com.example.java;

import java.util.Scanner;

public class Regular extends Pizza {

    public Regular()
    {

    }

    public Regular(int size)
    {
        super(size);
        this.type = "Regular";
    }

    public double getCost()
    {
        return this.cost;
    }

    @Override
    public void getToppings()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("how many topings would like?");
        int numToppings = in.nextInt();
        while(numToppings>4)
        {
            System.out.println("sorry ,you are required  to  enter only four.");
            System.out.println("how many topings would you like? ");
            numToppings = in.nextInt();
        }
        in.nextLine();
        for(int i = 0; i<numToppings; i++)
        {
            System.out.println("Enter topping");
            String topping = in.nextLine();
            toppings.add(topping);
            this.cost += 2.0;
        }

    }






}
