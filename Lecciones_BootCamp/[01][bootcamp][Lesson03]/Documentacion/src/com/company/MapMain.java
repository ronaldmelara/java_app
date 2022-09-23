package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        System.out.println("Map");
        Map<String, String> map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (String val : map.values()) {
            System.out.println(val);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey() + ">>>" + entry.getValue());

        }
    }
}
