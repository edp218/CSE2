//Edgar Palaquibay
//02/17/2015
//hw04
//the purpose of this homework is to use comparison operators, boolean
//expressions and selection statements

import java.util.Scanner;
public class WhichNumber{
    public static void main(String[ ] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Think of a number between 1 and 10 inclusive");
        System.out.println("Is the number even?");
        
        String string= myScanner.next();
        string= string.toLowerCase();
        char input= string.charAt(0);
        if (input == 'y') {
            System.out.println("is it divisible by 3?");
            string = myScanner.next();
            string = string.toLowerCase();
            input = string.charAt(0);
            if (input == 'y') {
                System.out.println("your number is 6");
                return;
            }
            if (input == 'n') {
                System.out.println("is your number disible by 4");
                string = myScanner.next();
                string = string.toLowerCase();
                input = string.charAt(0);
                if (input == 'y') {
                    System.out.println("is your number divided by 4 greater than 1?");
                    string = myScanner.next();
                    string = string.toLowerCase();
                    input = string.charAt(0);
                    if (input == 'y') {
                        System.out.println("your number is 8");
                        return;
                    }
                    if (input == 'n') {
                        System.out.println("your number is 4");
                        return;
                    }
                }
                if (input == 'n') {
                    System.out.println("is it divisible by 5?");
                    string = myScanner.next();
                    string = string.toLowerCase();
                    input = string.charAt(0);
                    if (input == 'y') {
                        System.out.println("is it divisible by 10");
                        return;
                    }
                    if (input == 'n') {
                        System.out.println("your number is 2");
                        return;
                    }
                }
            }
        }
        if (input == 'n') {
            System.out.println("is it divisible by 3?");
            string = myScanner.next();
            string = string.toLowerCase();
            input = string.charAt(0);
            if(input == 'y') {
                System.out.println("When divided by 3 is the result greater than 1?");
                string = myScanner.next();
                string = string.toLowerCase();
                input = string.charAt(0);
                if (input == 'y') {
                    System.out.println("your number is 9");
                }
                if (input == 'n') {
                    System.out.println("your number is 3");
                }
                }
                if (input == 'n'); {
                    System.out.println("is it greater than 6");
                    string = myScanner.next();
                    string = string.toLowerCase();
                    input = string.charAt(0);
                    if (input == 'y') {
                        System.out.println("your number is 7");
                    }
                    if (input == 'n') {
                        System.out.println("is it less than 3?");
                        string = myScanner.next();
                        string = string.toLowerCase();
                        input = string.charAt(0);
                        if (input == 'y') {
                            System.out.println("your number is 1");
                        }
                        if (input == 'n') {
                            System.out.println("your number is 5");
                        }
                        }
                    
                    }
                }
                
                }
            }