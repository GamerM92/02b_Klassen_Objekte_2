package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());

        // Werte zuweisen
        cat.firstName = "Grizabella";
        cat.furColor = "white";
        cat.age = 29;
        
        // Werte ausgeben
        output(cat.firstName);
        output(cat.furColor);
        output(Integer.toString(cat.age)); // Typkonvertierung

        output("-----------------------");

        Cat cat2 = new Cat();
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());

        cat2.firstName = "Alonzo";
        cat2.furColor = "grey";
        cat2.age = 35;

        output(cat2.firstName);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));

    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

