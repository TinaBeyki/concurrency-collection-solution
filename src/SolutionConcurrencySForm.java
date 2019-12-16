import java.util.ArrayList;
import java.util.List;

public class SolutionConcurrencySForm {

    public static void main(String[] args) {

        //add persons to list
        List<Person> personList = new ArrayList<>();
        Person personFirstOne = new Person(1, "Ali", 20);
        Person personSecondOne = new Person(2, "Reza", 16);
        personList.add(personFirstOne);
        personList.add(personSecondOne);


        List<String> listName = new ArrayList<>();
        List<Integer> listScore = new ArrayList<>();


        //use standard for instead of foreach
        for (int i = 0; i < personList.size(); i++) {
            if (!personList.get(i).getName().equals("Ali")) {
                listName.add(personList.get(i).getName());
            }
            if (personList.get(i).getScore() > 17) {
                listScore.add(personList.get(i).getScore());
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
