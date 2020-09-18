package javaColections;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {
    public static void main(String ar [] ) {
        Set<Object> karimset= new HashSet<>();
        karimset.add("karim");
        karimset.add("Ibrahim");
        karimset.add(null);
        System.out.println(karimset);
        System.out.println();
    }
}
