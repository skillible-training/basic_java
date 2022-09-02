package org.example;

import java.util.*;

public class CollectionExample {
    public static void listType() {
        List dataList = new ArrayList();
        dataList.add(1);
        dataList.add("one");
        System.out.println(dataList);
        System.out.println("second data: " + dataList.get(1));
        System.out.println("length: " + dataList.size());
        System.out.println("contain: " + dataList.contains("one"));

        List<String> strList = new ArrayList<>();
        strList.add(0, "zero");
        strList.add(1, "one");
        strList.add("four");
        strList.add(2, "three");
        strList.set(3, "five");

        System.out.println(strList);
        System.out.println("position of one is " + strList.indexOf("one"));
    }

    public static void setType() {
        List<String> strList = new ArrayList<>();
        strList.add("diwali");
        strList.add("republic day");
        strList.add("holi");
        strList.add("diwali");
        System.out.println(strList);

        Set<String> set = new HashSet<>(strList);
        System.out.println(set);
        set.add("holi");
        System.out.println(set);
    }

    public static void mapType() {
        Map<String, String> strMap = new HashMap<>();
        strMap.put("name", "Some Name");
        strMap.put("name", "Some Name1");
        strMap.put("dob", "22/03/1985");
        strMap.put("email", "somename@example.com");
        System.out.println(strMap);

        // Get the name from the map
        System.out.println("name is " + strMap.get("name"));
        System.out.println(strMap.keySet());
    }

    public static void main(String[] args) {
        mapType();
    }
}
