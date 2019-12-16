import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class AddSolution {

    public static void main(String[] args) {
        //add persons to list
        List<Person> personList = new ArrayList<>();
        Person personFirstOne = new Person(1, "Ali", 20);
        Person personSecondOne = new Person(2, "Reza", 16);
        personList.add(personFirstOne);
        personList.add(personSecondOne);


        List<String> listName = new ArrayList<>();
        List<Integer> listScore = new ArrayList<>();


        // instead of removing the element from the list -> add other elements that you need
        for (Person person : personList) {
            if (!person.getName().equals("Ali")) {
                listName.add(person.getName());
            }
        }
        for (Person person : personList) {
            if (person.getScore() > 17) {
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
