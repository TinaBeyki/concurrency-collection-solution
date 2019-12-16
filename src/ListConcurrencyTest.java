import java.util.ArrayList;
import java.util.List;

public class ListConcurrencyTest {

    public static void main(String[] args) {
        //add persons to list
        List<Person> personList = new ArrayList<>();
        Person personFirstOne = new Person(1, "Ali", 20);
        Person personSecondOne = new Person(2, "Reza", 16);
        personList.add(personFirstOne);
        personList.add(personSecondOne);


        List<String> listName = new ArrayList<>();
        List<Integer> listScore = new ArrayList<>();

        //concurrent exception
        for (Person person : personList) {

            if (person.getName().equals("Ali")) {
                personList.remove(person);
            } else {
                listName.add(person.getName());
            }
        }


        for (Person person : personList) {

            if (person.getScore() < 17) {
                personList.remove(person);
            } else {
                listScore.add(person.getScore());
            }
        }


        for (String s : listName) {
            System.out.println(s);
        }
        for (Integer i : listScore) {
            System.out.println(i);
        }


    }
}


