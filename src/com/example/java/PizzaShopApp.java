
/*create an online ordering pizza application
* it requires comparable interface
* it  should offer two kinds of pizza regular/Italian
* it needs to use inheritance and polymorphism
* it should allow multiple toppings. it puts certain limits in multiple topings.
* it should ask the user to enter name, the type pizza they order, number of topings
 * it should allow user to order multiple pizza at one time
 * it needs to display total cost with topings for each orderd pizza */

package com.example.java;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaShopApp {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = in.nextLine();
        ArrayList<Pizza> pizzas = new ArrayList<>();
        String response = "y";

        while (response.equals("y"))
        {
            System.out.println("What type of pizza would you like," +
                    "regular or Italian? ");
            String type = in.nextLine();

            if (type.equalsIgnoreCase("regular"))
            {
                System.out.println("what size ? S ,M , L , X?");
                String size = in.nextLine();
                Regular pizza1 = new Regular();
                if (size.equalsIgnoreCase("S"))
                {
                    pizza1 = new Regular(12);
                } else if (size.equalsIgnoreCase("M"))
                {
                    pizza1 = new Regular(14);
                } else if (size.equalsIgnoreCase("L"))
                {
                    pizza1 = new Regular(16);
                } else if (size.equalsIgnoreCase("X"))
                {
                    pizza1 = new Regular(18);
                }
                pizza1.getToppings();
                pizzas.add(pizza1);

                //pizza1.printString();

            } else
                {
                System.out.println("What size? S, M , L ?");
                String size = in.nextLine();
                Italian pizza1 = new Italian();
                if (size.equalsIgnoreCase("S"))
                {
                    pizza1 = new Italian(12);
                } else if (size.equalsIgnoreCase("M"))
                {
                    pizza1 = new Italian(14);
                } else if (size.equalsIgnoreCase("L"))
                {
                    pizza1 = new Italian(16);
                }
                pizza1.getToppings();
                pizzas.add(pizza1);

               // pizza1.printString();
            }


        System.out.println("Do you want to order another pizza? Y or N");
         response = in.nextLine();
    }
        for (Pizza p:pizzas)
        {
           p.printString();

        }


        }
}
