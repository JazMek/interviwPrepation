package javaColections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    /*Sorting ArrayList in Java is not difficult, by using Collections.
     sort() method you can sort ArrayList in ascending and descending order in Java.
     Collections.sort() method optionally accept a Comparator and if provided
     it uses Comparator's compare method to compare Objects stored in Collection
     to compare with each other, in case of no explicit Comparator, Comparable interface's
     compareTo() method is used to compare objects from each other.
     If object's stored in ArrayList doesn't implements Comparable than they can not be sorted
     using Collections.sort() method in Java.
     Read more: https://www.java67.com/2012/08/how-to-sort-arraylist-in-java-list.html#ixzz6SxeMjtH5

     */


    public static void main(String[] args) {


        ArrayList <String> insortedArList = new ArrayList<String>();
        insortedArList.add("Karim");
        insortedArList.add("Ibrahim");
        insortedArList.add("Bakhlich");
        insortedArList.add("Massi");
        insortedArList.add("Mahmoudoul");
        System.out.println("unsorted ArrayList : "+insortedArList);

        //Sorting ArrayList in descending order in Java
        /*That's all on How to Sort ArrayList in Java on both ascending and descending order.
         Just remember that Collections.sort() will sort the ArrayList in ascending order
         and if you provide reverse comparator it will sort the ArrayList in descending order in Java.
         */
        Collections.sort(insortedArList);
        System.out.println("Sorting ArrayList in ascending order : "+insortedArList);
        Collections.sort(insortedArList,Collections.reverseOrder());
        System.out.println("Sorting ArrayList in descending order : "+insortedArList);


    }



}
