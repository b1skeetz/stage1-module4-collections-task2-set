package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer integer : sourceList) {
            int buffer = 0;
            if (integer % 2 == 0) {
                buffer = integer;
                result.add(buffer);
                while (buffer % 2 == 0) {
                    buffer /= 2;
                    result.add(buffer);
                }
            } else {
                result.add(integer);
                result.add(integer * 2);
            }
        }
        return result;
    }
}