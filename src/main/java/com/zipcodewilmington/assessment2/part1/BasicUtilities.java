package com.zipcodewilmington.assessment2.part1;

import com.j256.ormlite.stmt.query.In;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        if (value >= 5) {
            return true;
        }
        return false;
    }

    public Boolean isLessThan7(Integer value) {
        if (value <= 7) {

            return true;
        }
        return false;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        if (valueToEvaluate >= 5 && valueToEvaluate <= 7) {
            return true;
        }
        return false;
    }

    public Boolean startsWith(String string, Character character) {

        if (string.toLowerCase().startsWith(character.toString())) {

            return true;

        } else if (string.toUpperCase().startsWith(character.toString())) {

            return true;

        } else {

            return false;
        }

    }
}