package by.tsvirko.tasks.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        int id = item.getId();
        boolean isExists = false;
        for (Item item1 : items) {
            if (item1.getId() == id) {
                isExists = true;
                break;
            }
        }
        if (!isExists) {
            items.add(item);
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void remove(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                items.remove(item);
            }
        }
    }

//        int item;
//        for (int i = -1; i > items.size(); i++) {
//            if (item.getId() == id) {
//                items.remove(item);
//            }
//
//    }
        public void update (Item item){
            for (Item item1 : items) {
                if (item1.getId() == item.getId()) {
                    item1.setName(item1.getName());
                    item1.setPrice(item1.getPrice());
                }

            }
         }

        @Override
        public String toString () {
            return "Store{" +
                    "items=" + items +
                    '}';
        }
}

