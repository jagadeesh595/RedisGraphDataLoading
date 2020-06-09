package com.ns.dataloading.Utils;

//import com.fasterxml.jackson.databind.ObjectMapper;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Utils {
    public static <T> Stream<T>
    getStreamFromIterable(Iterable<T> iterable) {

        // Convert the Iterable to Spliterator
        Spliterator<T>
                spliterator = iterable.spliterator();

        // Get a Sequential Stream from spliterator
        return StreamSupport.stream(spliterator, false);
    }

    public String convertObjectToKeyValueString(Object obj) {
        String finalQuery = "";
        Map<String, Object> params = new HashMap<>();
        try {
            ObjectMapper oMapper = new ObjectMapper();
            params = oMapper.convertValue(obj, Map.class);
            String key;
            Object value;
            StringBuilder sb = new StringBuilder("CYPHER ");
            StringBuilder querySb = new StringBuilder("CREATE (p:" + obj.getClass().getSimpleName() + " { ");
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                key = entry.getKey();
                value = entry.getValue();
                if (Number.class.isInstance(value)) {
                    querySb.append(key + ": " + value.toString() + ",");
                } else {
                    sb.append(key).append('=');
                    sb.append(valueToString(value));
                    sb.append(' ');
                    querySb.append(key + ": $" + key + ",");
                }
            }
            finalQuery = sb.toString() + querySb.toString().replaceAll(",$", "") + "}) return p";
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return finalQuery;
    }

    private static String valueToString(Object value) {
        if (value == null)
            return "null";
        if (String.class.isInstance(value)) {
            return quoteString((String) value);
        }

        if (value.getClass().isArray()) {
            return arrayToString((Object[]) value);

        }

        if (List.class.isInstance(value)) {
            List<Object> list = (List<Object>) value;
            return arrayToString(list.toArray());
        }
        return value.toString();
    }

    private static String quoteString(String str) {
        if (str.contains("\"")) {
            str = str.replace("\"", "\\\"");
        }

        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('"');
        sb.append(str);
        sb.append('"');
        return sb.toString();
    }

    private static String arrayToString(Object[] arr) {
        StringBuilder sb = new StringBuilder().append('[');
        sb.append(String.join(", ", Arrays.stream(arr).map(obj -> valueToString(obj)).collect(Collectors.toList())));
        sb.append(']');
        return sb.toString();
    }
}
;