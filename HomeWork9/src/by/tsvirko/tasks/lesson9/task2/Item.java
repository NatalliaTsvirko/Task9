package by.tsvirko.tasks.lesson9.task2;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Item implements Comparable<Store> {
    private int id;
    private String name;
    private int price;

    public Item() {
    }

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && price == item.price && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }



    @Override
    public int compareTo(Store o) {
        return 0;
    }
}
