package com.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter text: ");
            List<String> text = new ArrayList<>();
            String sentences = scanner.nextLine();
            while (!sentences.isEmpty()) {
                text.add(sentences);
                sentences = scanner.nextLine();
            }

            List<String> sent = reverseStrings(text);
            for (String word : sent) {
                System.out.print(word+" ");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static List<String> reverseStrings(List<String> text) {
        List<String> sentences = new ArrayList<>();
        for (String line : text) {
            String[] words = line.split("[ .,]+");
            for (String word : words) {
                sentences.add(new StringBuilder(word).reverse().toString());
            }
        }
        return sentences;
    }
}


