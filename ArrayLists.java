package Modules.Module_1;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        int n = 5;

        //declaring ArrayList with initial size n

        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");

        /*Creation of ArrayList: I'm going to add String
                *elements so I made it of string type */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how elements should be added to the array list*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:"+obj);

        /*Add element at the given index*/
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        /*Remove elements from array list like this*/
        obj.remove("Chaitanya");
        obj.remove("Harry");

        System.out.println("Current array list is:"+obj);

        /*Remove element from the given index*/
        obj.remove(1);

        System.out.println("Current array list is:"+obj);
    }
}
