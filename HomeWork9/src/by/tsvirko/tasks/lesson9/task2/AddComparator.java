package by.tsvirko.tasks.lesson9.task2;

import java.util.Comparator;

public class AddComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return item1.getId() - item2.getId();
    }
}
