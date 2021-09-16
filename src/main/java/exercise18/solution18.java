package exercise18;

import java.util.Objects;

import java.util.Scanner;

class Conversion {
    double f;
    double c;
    String ch;

    Scanner sc = new Scanner(System.in);

    public void scn() {
        System.out.println("Choose which conversion you'd like to perform: \n C for Fahrenheit to Celsius  \n F for Celsius to Fahrenheit");
        this.ch = sc.next();
    }
    public void prt() {

        if(Objects.equals(ch, "C")) {
            System.out.print("Please enter the temperature in Fahrenheit:  ");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("The celsius temperature is "+ c);
        }
        if(Objects.equals(ch, "F")) {
            System.out.print("Please enter the temperature in Celsius:  ");
            c=sc.nextDouble();
            f=((9*c)/5)+32;
            System.out.println("The fahrenheit temperature is "+ f);
        }
        }
    }

    public class solution18 {

        public static void main(String[] args) {
            Conversion ca = new Conversion();
            ca.scn();
            ca.prt();

        }
    }
/*
first we import the scanner funciton and the objects function, then create the class called Conversion which
holds the initalization for the doubles f and c, and string ch. it also contains the public voids scn and prt.
scan once again reads in the users inputs for whether or not they want to convert from F to C or vice verse.
the prt void holds the two if statements for both the conversion from F to C and C to F depending on which letter
the user put into the program as well as the math of each conversion inside of two if statements. then it prints
the final answer accordingly. the main function then calls these two voids and runs the program.
 */