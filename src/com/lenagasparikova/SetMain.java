package com.lenagasparikova;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

    public static void main(String[] args) {
//        Set<Integer> squares = new HashSet<>();
//        Set<Integer> cubes = new HashSet<>();
//
//        for (int i = 1; i <= 100; i++) {
//            squares.add(i * i);
//            cubes.add(i * i * i);
//        }
//
//        System.out.println("There are " + squares.size() + " and " + cubes.size() + " cubes.");
//
//// bulk operations are destructive, they modify the set they are called upon
//        Set<Integer> union = new HashSet<>(squares);
//        union.addAll(cubes);
//        System.out.println("Union contains " + union.size() + " elements");
//
//        Set<Integer> intersection = new HashSet<>(squares);
//        intersection.retainAll(cubes);
//        System.out.println("Intersection contains " + intersection.size() + " elements");
//        for (Integer i : intersection) {
//            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
//        }
//
//        Set<String> words = new HashSet<>();
//        String sentence = "One day in the year of the fox";
//        String[] wordsArray = sentence.split(" ");
//        words.addAll(Arrays.asList(wordsArray));
//        for (String s : words) {
//            System.out.println(s);
//        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "thee", "to"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

//        System.out.println("nature - divine");
//        Set<String> diff1 = new HashSet<>(nature);
//        diff1.removeAll(divine);
//        printSet(diff1);
//        System.out.println();
//        System.out.println("============================");
//        System.out.println();
//        System.out.println("divine - nature");
//        Set<String> diff2 = new HashSet<>(divine);
//        diff2.removeAll(nature);
//        printSet(diff2);
//

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        printSet(unionTest);

        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        printSet(intersectionTest);

        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        if (nature.containsAll(divine)) {
            System.out.println("Divine is a subset of nature");
        }
        if (divine.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is a subset of divine");
        }

        if (nature.containsAll(intersectionTest)) {
            System.out.println("intersectionTest is a subset of nature");
        }


//        System.out.println("Symmetric difference");
//        unionTest.removeAll(intersectionTest);
//        printSet(unionTest);

    }

    private static void printSet(Set<String> set) {
        for (String s : set) {
            System.out.print("\t");
            System.out.print(s + " ");
        }
        System.out.println();
    }


}
