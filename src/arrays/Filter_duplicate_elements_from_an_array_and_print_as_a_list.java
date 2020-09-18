package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Filter_duplicate_elements_from_an_array_and_print_as_a_list {
    /*Write code to filter duplicate elements from an array and print as a list?

     */
         public static void main (String [] args){
             ArrayList<String> list = new ArrayList<String>();
             // Form a list of numbers from 0-9.
             for (int i = 0; i < 10; i++) {
                 list.add(String.valueOf(i));
             }
             // Insert a new set of numbers from 0-5.
             for (int i = 0; i < 5; i++) {
                 list.add(String.valueOf(i));
             }
             System.out.println("   Input list (Before removing the duplicates) : " + list);
             System.out.println("\n After removing the duplicates : " + removeDuplicates(list));
             System.out.println("\n Filtered duplicates (List of the duplicated elements) : " + duplicatesList(list));
         }
            // removeDuplicates method will return a list of the non duplicates elements
       public static Set<String> removeDuplicates(List<String> listContainingDuplicates) {
             final Set<String> resultSet = new HashSet<String>();
             for (String yourInt : listContainingDuplicates) {
             if (!resultSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
             return resultSet;
    }
    //        duplicatesList method will return a list of the duplicates elements
        public static Set<String> duplicatesList(List<String> listContainingDuplicates) {
             final Set<String> resultSet = new HashSet<String>();
             final Set<String> tempSet = new HashSet<String>();
             for (String yourInt : listContainingDuplicates) {
             if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }
}
