package Lambda1b;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lambda1b {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Genowefaa");
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");

        List<String> modifiedNames = new ArrayList<>();
        Random random = new Random();
        for (String name : names) {
            String modifyName = name + " " + random.nextInt(11);
            modifiedNames.add(modifyName);

        }
        System.out.println(modifiedNames);
    }
}
 // 9:00