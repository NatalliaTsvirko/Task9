package by.tsvirko.tasks.lesson9.task2;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        store.addItem(new Item(1,"dress",15));
        store.addItem(new Item(2,"shoes",20));
        store.addItem(new Item(3,"t-shirt",5));
        store.addItem(new Item(4,"jacket",55));
        store.addItem(new Item(5,"pants",30));

        PriceComporator priceComporator = new PriceComporator();
        List<Item> items = store.getItems();
        items.sort(priceComporator);

        for (Item itm : store.getItems()) {
            System.out.println(itm.getPrice());

        }
        System.out.println("---------------------");
        store.remove(3);
        for (Item s : store.getItems()){
            System.out.println(s.getId());
        }

    }
}









