import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {

        List<String> groups = new ArrayList<>(allStudents());
        Random rand = new Random();
        String group = "";
        createGroups(rand, group, groups);

    }

    static public void createGroups(Random rand, String group, List<String> groups) {
        for (int i = 1; i <= 8; i++) {

            for (int j = 0; j < 3; j++) {
                int number = rand.nextInt(0, groups.size());
                String student = groups.get(number);
                group = group + " " + student;
                groups.remove(number);
            }
            printOutGroups(i, group);
        }
    }

    static public List<String> allStudents() {
        return Arrays.asList("Oskar", "Pernilla,", "Johan", "Max", "Abbe",
                "Elias", "Adil", "Ben", "Jan", "Sigge", "Leif", "Elma", "Willma", "Daniel", "Dino"
                , "Dimitri", "Niko", "Tatjana", "Emil", "Ivana", "Marcus", "Leila", "Dennis", "Julius");
    }

    static public void printOutGroups(int i, String group) {
        System.out.println("Group " + i + " " + group);
        group = "";
    }
}