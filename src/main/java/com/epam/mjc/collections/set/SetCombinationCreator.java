package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for(String firstString : firstSet){
            for(String secondString : secondSet){
                if(firstString.equals(secondString)){
                    if(!thirdSet.contains(secondString)){
                        result.add(secondString);
                    }
                }
            }
        }
        for(String thirdString : thirdSet){
            if(!firstSet.contains(thirdString) && !secondSet.contains(thirdString)){
                result.add(thirdString);
            }
        }
        return result;
    }
}