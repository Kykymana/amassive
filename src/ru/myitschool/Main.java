package ru.myitschool;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

class Basket extends TreeMap<String, Integer>{
    String name;
    int count;

}

public class Main {

    public static void main(String[] args) {
        TreeMap<String, Basket> shopping = new TreeMap<>();
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String buyerName = in.next();
            String item = in.next();
            int itemCount = in.nextInt();
            if (!shopping.containsKey(buyerName)){
                shopping.put(buyerName, new Basket());
            }
            Basket basket = shopping.get(buyerName);
            if (!basket.containsKey(item)){
                basket.put(item, itemCount);
            }
            else {
                basket.put(item, basket.get(item) + itemCount);
            }
        }
        //System.out.println(shopping);
        for (String buyerName: shopping.keySet()){
            System.out.println(buyerName + ":");
            Basket basket = shopping.get(buyerName);
            for (String item: basket.keySet()){
                System.out.println(item + " " + basket.get(item));
            }
        }
    }
}
