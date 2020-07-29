package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        //Initialize new Map
        Map<String, String> languages = new HashMap<>();

        //If Map contains key
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a Compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        //Put new values to the Map
        languages.put("Python", "an Interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an Algorithmic language");
        //Printing Map value while adding it returns null
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println("********************");

        //Remove Map value
        //languages.remove("Lisp");
        if (languages.remove("Algol", "an Algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        //Replace Map value
        if (languages.replace("Lisp", "Therein lies madness", "a Functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }

        //System.out.println(languages.replace("Scala", "This will not be added"));

        //Loop through all the map values
        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }
    }
}
