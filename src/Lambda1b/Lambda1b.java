package Lambda1b;


import java.lang.reflect.Modifier;
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

            // name + " " + random.nextInt(11);
         //   String modifyName = modyfi(name, new Modifier() );
            modifiedNames.add(modifyName);

        }
        System.out.println(modifiedNames);
    }

     //   private static String modyfi(String string, Modifier modifier); {
         //  return modifier.modyfi(string);


    }


}
 // 11:30 to check if it is wort to continue with this course