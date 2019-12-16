import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        HashMap hashMapList = new HashMap();
        Person personFirstOne = new Person(1, "Ali", 20);
        Person personSecondOne = new Person(2, "Reza", 16);

        personList.add(personFirstOne);
        personList.add(personSecondOne);

        for (Person person : personList) {
            hashMapList.put(person.getId(), person.getName());
        }

/*
        hashMapList.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });*/
    }
}
