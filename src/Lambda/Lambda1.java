package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        System.out.println(names);
    }
}
