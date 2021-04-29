package com.virginatech;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alphabetizer {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Enter number of sentences you want to pass in Alphabetizer: ");
        int n = x.nextInt();
        System.out.println("Enter " + n + " sentence. Press enter after each sentence completion");
        x.nextLine();

        List<String> list = new ArrayList<>();

        while(n > 0) {
            String s = x.nextLine();
            list.add(s);
            n--;
        }

        list.forEach(s -> {
            System.out.println("\nYou entered: " + s);
            Alphabetizer d = new Alphabetizer();
            System.out.println("Answer: " + d.alphabetizer(s));
        });

        System.out.println("\nRun again, if you want to enter more sentences");
    }

    public String alphabetizer(String s) {

        if(s == null || s.isEmpty()) {
            return null;
        }

        s = s.trim();
        List<String> list = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if((c > 64 && c < 91) || (c > 96 && c < 123)) {
                list.add(Character.toString(c));
            }
        }

        list.sort(String.CASE_INSENSITIVE_ORDER);

        if(list.isEmpty()) {
            return "Error!!! No alphabetic letters in the given sentence";
        }

        StringBuilder sb = new StringBuilder();

        for(String letter : list) {
            sb.append(letter);
        }

        return sb.toString();
    }
}
