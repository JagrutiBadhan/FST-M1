package Package_Activities;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
    public static <name> void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("name1");
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");

        System.out.println("All elements in the list:");
        // For loop for iterating over the List
        for (int i = 0; i < myList.size(); i++) {

            // Print all elements of List
            System.out.println(myList.get(i));
        }

        //get 3rd element of the list
        System.out.println("3rd name in the arraylist is: "+ myList.get(2));

        //check if name exists in arraylist
        String searchName="name6";
        if(myList.contains(searchName)){
            System.out.println("Element available in the list");
        }else {
            System.out.println("Element not available in the list");
        }

        //no of names in the list
        System.out.println("No of names in the list: "+myList.size());

        //remove name from list and print size again
        myList.remove(2);
        System.out.println("Updated size of the list: "+myList.size());

    }

}
