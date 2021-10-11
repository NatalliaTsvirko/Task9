package by.tsvirko.tasks.lesson9.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Generics
        Person<Integer,String> personOne = new Person<>(30,"Вася");
        String personOneName = personOne.getName();
        System.out.println(personOneName);

        Person<String,String> personTwo = new Person<>("30","Лена");
        String personTwoAge = personTwo.getAge();
        System.out.println(personTwoAge);

//Обобщенные методы
        Person person = new Person();
        String[] people = {"Лиза","Алиса","Гена","Ричард"};
        Integer[] number = {33,54,369,999};
        person.<String>print(people);
        person.<Integer>print(number);
//Коллекции
//ArrayList
        List<String> peoples = new ArrayList<>();
        //добавление элементов
        peoples.add("Ksu");
        peoples.add("Alice");
        peoples.add("Josh");
        peoples.add("Mikhael");
        peoples.add("Den");
        System.out.println(peoples);
        //добавить элементы по индексу
        peoples.add(2,"Rio");
        peoples.add(3,"Lola");
        peoples.add(4,"Roma");
        System.out.println(peoples.get(2));
        System.out.println(peoples);
        peoples.set(2,"Masha"); //установить элемент на существующий индекс(замена)
        System.out.println(peoples.get(2));
        System.out.println(peoples);
        System.out.println(peoples.size());//получить размер списка
        //проверка на наличие элемента
        if (peoples.contains("Lola") && peoples.contains("Masha")){
            System.out.println("ArrayList contains : Lola and Masha.");
            for (String persons: peoples) {
                System.out.println(persons);//вывод списка, каждый элемент с новой строки
            }
        }
        //удаление элемента
        peoples.remove(1);//по индексу
        System.out.println(peoples);
        peoples.remove("Roma");//по объекту
        System.out.println(peoples);
        System.out.println(peoples.size());
        //слияние списков
        List<Integer> list1 = new ArrayList<>();//создание первого списка
        Collections.addAll(list1,1,3,5,4,6,8,9);//заполнение элементами
        List<Integer> list2 = new ArrayList<>();//создание второго списка
        Collections.addAll(list2,2,4,5,9,6,7,85);//заполнение элементами
        List<Integer> result = new ArrayList<>();//создание третьего списка для добавления list1 и list2
        result.addAll(list1);//добавление в третий список элементы первого списка
        result.addAll(list2);//и добавление элементов второго списка в третий
        System.out.println(result);
        for (int i = result.size()-1; i >=0; i--){//вывести числа списка result в обратном порядке
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
        result.removeAll(list1);
        System.out.println(result);/*почему из третьего списка удалились элементы 2,7,85
                                   которые находятся во втором списке?*/
        result.isEmpty();
        //System.out.println(result);
        result.clear();
        System.out.println(result);
        result.isEmpty();
    }
}
