package com.test;

import java.util.ArrayList;
import java.util.List;

public class EvenList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(4);
        list.add(15);
        list.add(3);
        list.add(21);
        list.add(3);
        list.add(2);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }

    }


}
