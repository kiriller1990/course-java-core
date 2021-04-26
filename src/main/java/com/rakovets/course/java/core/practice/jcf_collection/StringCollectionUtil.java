package com.rakovets.course.java.core.practice.jcf_collection;

import java.util.List;
import java.util.ListIterator;

public class StringCollectionUtil {
    public static List<String> resetWordsByLength(List<String> words, int length) {
       ListIterator<String> iterator = words.listIterator();
       while(iterator.hasNext()) {
           if(iterator.next().length() == length) {
               iterator.set("*");
           }
       }
        return words;
    }

    public static List<String> removeWordsByLength(List<String> words, int length) {
        words.removeIf(s -> s.length() == length);
        return words;
    }
}
