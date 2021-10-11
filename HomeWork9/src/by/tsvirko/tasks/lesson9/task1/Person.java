package by.tsvirko.tasks.lesson9.task1;

public class Person <T,R> {
    private T age;
    private R name;

    public Person() {
    }

    public Person(T age, R name) {
        this.age = age;
        this.name = name;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public R getName() {
        return name;
    }

    public void setName(R name) {
        this.name = name;
    }

    public <C> void print(C[] peoples){
        for (C people: peoples) {
            System.out.println(people);
        }
    }
}
