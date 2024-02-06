package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> tree = new TreeSet<>();
        for (Integer integer : sourceList) {
            tree.add((int) Math.pow(integer, 2));
        }
        return tree.subSet(lowerBound, true, upperBound, true);
    }
}