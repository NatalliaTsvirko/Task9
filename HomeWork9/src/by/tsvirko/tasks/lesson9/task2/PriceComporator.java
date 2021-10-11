package by.tsvirko.tasks.lesson9.task2;

import java.util.Comparator;


public class PriceComporator implements Comparator <Item>{

    @Override
    public int compare(Item item1, Item item2) {

       return item1.getPrice() - item2.getPrice();
    }
}
