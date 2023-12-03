package com.teachmeskills.lesson10;

import com.teachmeskills.lesson10.client.Client;
import com.teachmeskills.lesson10.creatingCards.CreatingCards;

public class Runner {

    public static void main(String[] args) {

        int count = 0;

        Client client = CreatingCards.getClient();

        for (int i = 0; i < client.getBaseCards().length - 1; i++) {
            for (int j = i + 1; j < client.getBaseCards().length; j++) {
                if (client.getBaseCards()[i].equals(client.getBaseCards()[j])) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("You don't have the same cards");
        } else {
            System.out.println("You " + count + " identical cards");
        }

    }

}
