package com.company;

import java.util.TreeSet;

class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

        // Using pollFirst()
        System.out.println("Kaldırılan İlk Öğe: " + numbers.pollFirst());

        // Using pollLast()
        System.out.println("Kaldırılan Son Öğe " + numbers.pollLast());

        System.out.println("Yeni Ağaç Seti: " + numbers);
    }
}