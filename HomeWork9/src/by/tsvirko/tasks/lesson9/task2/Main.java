package by.tsvirko.tasks.lesson9.task2;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();
        Item itemFirst = new Item(1, "dress", 15);
        Item itemSecond = new Item(2, "shoes", 20);
        Item itemThird = new Item(3, "t-shirt", 5);
        Item itemFour = new Item(4, "jacket", 55);
        Item itemFive = new Item(5, "pants", 30);
        store.addItem(itemFirst);
        store.addItem(itemSecond);
        store.addItem(itemThird);
        store.addItem(itemFour);
        store.addItem(itemFive);

        PriceComporator priceComporator = new PriceComporator();
        List<Item> items = store.getItems();
        items.sort(priceComporator);

        for (Item itm : store.getItems()) {
            System.out.println(itm.getPrice());

        }
        System.out.println("---------------------");
        store.remove(4);
        AddComparator addComparator = new AddComparator();
        List<Item> items1 = store.getItems();
        items1.sort(addComparator);
        for (Item s : store.getItems()) {
            System.out.println(s.getId());
        }
        System.out.println("-----------------");
        itemFirst.setPrice(10);
        itemFive.setName("cap");
        for (Item a : store.getItems()) {
            System.out.println(a.getPrice() + "$" + " - one " + a.getName());
        }
    }
}









