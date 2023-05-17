package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

//        this is an array
//        array is a fixed size
        String[] names = new String[4];
        String[] name2 = {"Jeff", "Mark", "John"};

//        accessing array
        System.out.println(name2[0]);

//        this is an arraylist
//        array is not fixed size
        ArrayList<String> name3 = new ArrayList<>();
        ArrayList<String> name4 = new ArrayList<>(Arrays.asList("Jefferson","Balde"));

//        adding elements in arraylist
        name3.add("Jeff");
        name3.add("Mark");

        System.out.println(name3.get(1));
        System.out.println(name4.get(1));

//        setting an elements in arraylist
        name4.set(0,"Jr");
        System.out.println(name4.get(0));

    }
}
