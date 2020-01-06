package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Genowefaa");
        names.add("Dorota");
        names.add("Jacek");
        names.add("Kasia");
        names.add("Wacek");
        names.add("Robert");
        names.add("Damian");
        names.add("Jarosław");

     /*   names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {  // klasa anonimowa z jedna instancja
                return 0;
            }
        });

        names.

*/


        ///  names.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));   -shorter but then we cant use things ike sout in it

        //  names.sort(Comparator.comparingInt(String::length)); even shorter but using reference

        names.sort((o1, o2) -> {
            System.out.println(o1 + " " +  o2 +  " compare them");  // or we can use other operations
                return Integer.compare(o1.length(), o2.length());
        });

        System.out.println(names);
    }
}

