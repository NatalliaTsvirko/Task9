package by.tsvirko.tasks.lesson9.task2;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Item item1 = new Item(1, "dress", 15);
        Item item2 = new Item(2, "shoes", 20);
        Item item3 = new Item(3, "t-shirt", 5);
        Item item4 = new Item(4, "jacket", 55);
        Item item5 = new Item(5, "pants", 30);
        store.addItem(item1);
        store.addItem(item2);
        store.addItem(item3);
        store.addItem(item4);
        store.addItem(item5);

        PriceComporator priceComporator = new PriceComporator();
        List<Item> items = store.getItems();
        items.sort(priceComporator);

        for (Item itm : store.getItems()) {
            System.out.println(itm.getPrice());

        }
        System.out.println("---------------------");
        store.remove(2);
        for (Item s : store.getItems()) {
            System.out.println(s.getId());
        }

    }
}









