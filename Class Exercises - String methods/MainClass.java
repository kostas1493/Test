/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kosta
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //FOR EXERCISE 1
        chekcLenght("Jack", "Nikolas");
        chekcLenght("Constantine", "Nikolas");
        checkName("Constantine");
       
        //FOR EXERCISE 2
        String[] onomata = {"Jonathan", "Mary", "Kevin", "Jack"};
        printNamesStartingFrom(onomata, 'M');

        //FOR EXERCISE 3
        String[] cities = {"Athens", "Thessaloniki", "Thiva", "Thasos", "Xanthi", "Kallithea", "Rethymno"};
        printCitiesThatStartFromTh(cities);
        
        //FOR EXERCISE 4
        mergeOfTwoStrings("Kostas", "Alexander");
        
        //  FOR EXERCISE 5A
        convertToLowerCase("TO BE OR NOT TO BE");
        
        //    FOR EXERCISE 5B
        convertToUpperCase("to be or not to be");

        //  FOR EXERCISE 6
        String happyPhrase = " Konstantinos loves java    ";
        removeSpaces(happyPhrase.trim());

        //   FOR EXERCISE 7A
        String s1 = "Computer, Laptop, Tablet";
        String[] quote = s1.split(",");
        splitPhrase(quote);

        //   FOR EXERCISE 7B   
        String s2 = " Kostas is on his way to London";
        seeIfContains(s2);
        
        //  FOR EXERCISE 8
        String s3 = "Which is the best programming language python or C#";
        replaceSomething(s3);
        
        //  FOR EXERCISE 9
        String s4 = "August will be Java month for me!!!";
         partsOFASentence(s4);
    }

    //1A
    //METHOD FOR LENGHT()
    public static void chekcLenght(String a, String b) {

        if (a.length() > b.length()) {
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(a + " is smaller than " + b);
        }
    }

    //1B
    //SAME METHOD LENGHT() BUT WITH DIFFERENT GOAL
    public static void checkName(String name) {
        if (name.length() > 5) {
            System.out.println("You have a big name");
        } else {
            System.out.println("You have a small name");
        }
    }

    //METHOD FOR CHARAT()
    public static void printNamesStartingFrom(String[] names, char letter) {
        System.out.println("**********");
        for (int i = 0; i < names.length; i++) {
            if (names[i].charAt(0) == letter) {
                System.out.println(names[i]);
            }
        }
    }
    // METHOD FOR INDEXOF()
    public static void printCitiesThatStartFromTh(String[] cities) {
        System.out.println("******printCitiesThatStartFromTh*******");
        for (String city : cities) {
            int index = city.indexOf("Th");
            System.out.println("index of th for city " + city + " is " + index);

        }
    }

    //METHOD FOR CONCAT() FROM EXERCISE 4
    public static void mergeOfTwoStrings(String onoma, String eponymo) {
        String firstName = onoma;
        String lastName = eponymo;
        String fullName = onoma.concat(eponymo);
        System.out.println(fullName);
    }

    //5A
    //METHOD FOR TOLOWERCASE() FROM EXERCISE 5
    public static void convertToLowerCase(String frasi) {
        String phrase = frasi;
        System.out.println(phrase.toLowerCase());
    }

    //5B
    //METHOD FOR TOUPPERCASE() FROM EXERCISE 5
    public static void convertToUpperCase(String frasi) {
        String phrase1 = frasi;
        System.out.println(phrase1.toUpperCase());
    }

    //METHOD FOR TRIM() FROM EXERCISE 6 
    public static void removeSpaces(String protasi) {
        String sentense = protasi.trim();
        System.out.println(protasi);
    }

    //METHOD FOR SPLIT() FROM EXERCISE 7A
    public static void splitPhrase(String[] protasi) {
        for (String s1 : protasi) {
            System.out.println(s1);
        }
    }

    //METHOD FOR CONTAINS() FROM EXERCISE 7B
    public static void seeIfContains(String protasi) {
        String a = protasi;

        if (a.contains("kostas") || a.contains("Kostas")) {
            System.out.println("Kostas is here");
        } else {
            System.out.println("Kostas is somewhere else, look elsewhere");
        }
    }
    
    //METHOD FOR REPLACE() FROM EXERCISE 8
    public static void replaceSomething(String protasi){
         String a = protasi.replace("python", "Java");
         System.out.println(a);
    }
    
    //METHOD FOR SUBSTRING() FROM EXERCISE 9
    public static void partsOFASentence(String protasi){
        String sub = protasi.substring(0, 15);
        System.out.println(sub);
    }
}
