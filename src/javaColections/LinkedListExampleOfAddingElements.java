package javaColections;

import java.util.*;

public class LinkedListExampleOfAddingElements {
    /* https://beginnersbook.com/2013/12/linkedlist-in-java-with-example/
    In the following example we are using add(), addFirst() and addLast() methods to add the elements
     at the desired locations in the LinkedList, there are several such useful methods in the LinkedList
     class which I have mentioned at the end of this article.
     */
    public static void main(String[] args) {

        LinkedList<String> listExemple = new LinkedList<String>();

        listExemple.add("karim");
        listExemple.add("ibrahim");
        listExemple.add("hakim");
        listExemple.add("jafar");
        listExemple.add("akheli");
        listExemple.add("mouloud");

        System.out.println(listExemple);

        //     Add first  element
        listExemple.addFirst("lamarra");
        System.out.println(listExemple);
        //     Add last  element
        listExemple.addLast("salah");
        System.out.println(listExemple);
        //     using Itirator to read the element of the linkedList

        Iterator <String>listExempleIterator = listExemple.iterator();
        while(listExempleIterator.hasNext())
              {
            System.out.println(listExempleIterator.next());
        }
         //     Java example of removing elements from the LinkedList
            listExemple.remove("lamarra");
        System.out.println(listExemple);
         //     Java – Convert a LinkedList to ArrayList
//        https://beginnersbook.com/2014/07/java-convert-a-linkedlist-to-arraylist/
        List<String> arraylist = new ArrayList(listExemple);
        System.out.println("This is arrayList "+arraylist);
        //      How to convert LinkedList to array using toArray() in Java
//        https://beginnersbook.com/2014/07/how-to-convert-linkedlist-to-array-using-toarray-in-java/
        String[] array = listExemple.toArray(new String[listExemple.size()]);
        System.out.println(Arrays.toString(array));
    }
}
