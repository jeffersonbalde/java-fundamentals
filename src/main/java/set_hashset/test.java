package set_hashset;

import java.util.*;

public class test {
    public static void main(String[] args) {

//        you can use TreeSet if you want to order things
//        you can use LinkedHashSet if you want to maintain the order they add
//        you can use for hashset for faster

        Set<String> names = new HashSet<>();

        names.add("Jeff");
        names.add("Mark");
        names.add("John");
        names.add("Shane");

//        another way to print string in set
//        names.forEach(System.out::println);

//        second way using iterrator
//        Iterator<String> namesIterate = names.iterator();
//
//        while(namesIterate.hasNext()){
//            System.out.println(namesIterate.next());
//        }

        List<Character> charList = new ArrayList<>();

        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('a');
        charList.add('b');
        charList.add('c');
        charList.add('b');
        charList.add('b');

        System.out.println(charList);

        Set<Character> charSet = new HashSet<>(charList);

        System.out.println(charSet);
    }
}
