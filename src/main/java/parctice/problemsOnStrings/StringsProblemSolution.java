package parctice.problemsOnStrings;

import java.util.*;
import java.util.stream.Collectors;

public class StringsProblemSolution {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("1258", "p", "jaddu", "6", "surena", "rohith", "malinga", "k");
        // System.out.println(names);

        /* print names reverse order ,, by default it is considering alphabatical order */
        //names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        /* based on names length sort ascending order */
        // names.stream().sorted(Comparator.comparing(s -> s.length())).forEach(System.out::println);

        /* based on names length sort descending order */
        // names.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
        /* or */
        //names.stream().sorted((o1, o2) -> Integer.compare(o2.length(), o1.length())).forEach(System.out::println);

        /* find loongest string ,,reduce is used to reduce multiple into one based on condtion */
        // String longestStringInNames = names.stream().reduce((i1, i2) -> i1.length() > i2.length() ? i1 : i2).get();
        //or
        // String longestStringInNames = names.stream().max(Comparator.comparing(String:length)).get();
        //System.out.println("bigNames : " + longestStringInNames);

        /* make every first letter in names capital and remaining in lowercase and print whole name */
        // names.stream().map(i->i.substring(0,1).toUpperCase()+i.substring(1).toLowerCase()).forEach(System.out::println);

        /* make every last letter in names capital and remaining in lower and print whole name */
        //names.stream().map(i->i.substring(0,i.length()-1).toLowerCase()+i.substring(i.length()-1).toUpperCase()).forEach(System.out::println);

        /* get the string which has vowels */
        //names.stream().filter(i -> i.matches(".*[aeiou].*")).forEach(System.out::println);
        //or
        // names.stream().filter(i -> i.contains("a") || i.contains("i") || i.contains("o") || i.contains("u")).forEach(System.out::println);


        /* join list of strings to one string */
        //String collect = names.stream().reduce((i1, i2) -> i1 + " , " + i2).get();
        //or
        //String collect = names.stream().collect(Collectors.joining(","));
        //  System.out.println(collect);

        /* reverse each string in given list(names) and create new list of reversed. */
        /*
        List<StringBuilder> newList = names.stream().map(str -> new StringBuilder(str).reverse()).collect(Collectors.toList());
        System.out.println(newList);
        */

        /* remove null's and empty in list of strings */
        //names.stream().filter(i->i!=null && (!i.isEmpty())).forEach(System.out::println);

        //group the names which names are same starting letter
        /*
        Map<Character, List<String>> groupNamesWhoHasSameLetterInFirstLetter = names.stream().collect(Collectors.groupingBy(str -> str.charAt(0)));
        groupNamesWhoHasSameLetterInFirstLetter.entrySet().stream().forEach(System.out::println);
        */

        //group same lenth names
        /*
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(str -> str.length()));
        collect.entrySet().stream().forEach(System.out::println);
        */


        //separate the names into two lists one is no-vowel name and another is vowel names
        /*
        Map<Boolean, List<String>> getTwoListsVowelsNonVowels = names.stream().collect(Collectors.partitioningBy(str -> str.matches(".*[aeiou].*")));
        System.out.println("Non Vowels names list : "+getTwoListsVowelsNonVowels.get(false));
        System.out.println("Vowels names list : "+getTwoListsVowelsNonVowels.get(true));
        */

        //print only string names not digits in names list
        // "hi","258","la" => o/p is:- "hi","la"
        /*
        List<String> onlyStringEleNamesNotDigitNames = names.stream().filter(str -> !str.matches(".*[0-9].*")).collect(Collectors.toList());
        System.out.println(onlyStringEleNamesNotDigitNames);
        */

        /* find any name which has length  10 or more otherwise handle exception */
        //names.stream().filter(str->str.length()>10).findAny().orElseThrow(()-> new NoSuchElementException("no one has 10 letter's name !! "));

        //find count how many times each letter in string ,, find hihest reapted letter
        String str ="kajhddhsdudhfdfuhjdh";
        Map<String, Long> letterCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy((i -> i), Collectors.counting()));
        letterCount.entrySet().stream().forEach(System.out::println);
        Map.Entry<String, Long> hisheshReapetedLetter = letterCount.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("highest times reapted letter : "+hisheshReapetedLetter);

    }
}
