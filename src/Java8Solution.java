import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Solution {


    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person personFirstOne = new Person(1, "Ali", 20);
        Person personSecondOne = new Person(2, "Reza", 16);
        personList.add(personFirstOne);
        personList.add(personSecondOne);


        List<String> listName = personList.stream().map(person -> person.getName()).filter(x -> !x.equals("Ali")).collect(Collectors.toList());
        List<Integer> listScore = personList.stream().map(Person::getScore).filter(x -> x > 17).collect(Collectors.toList());

        //Long countScores = personList.stream().count();


        for (String s : listName) {
            System.out.println(s);
        }
        for (Integer i : listScore) {
            System.out.println(i);
        }


    }


}
