/*
Sai Avula
7.27.2024
ThreeRecursions.java
Create a program with recursion.
*/

import java.util.Scanner;
public class ThreeRecursions
{
    public static void main(String[] args)
    {
        ThreeRecursions tr = new ThreeRecursions();
        tr.runner();
    }

    public void runner()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n\n");
        System.out.print("Would you like to add(1), factors(2), vowels(3)? ");
        int choice = scan.nextInt();

        int add = 0;
        String factors = "";
        String vowels = "";
        if (choice == 1) {
            System.out.print("Please enter 2 numbers. The largest number first: ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int lower = Math.min(num1, num2);
            int higher = Math.max(num1, num2);
            add = addMethod(lower, higher);
            System.out.println("The sum of numbers between " + higher + " to " + lower + " is " + (add - 1));
            System.out.println("\n\n");
        }
        else if (choice == 2) {
            System.out.print("Please enter an integer: ");
            int integer = scan.nextInt();
            System.out.println("The factors of " + integer + " are " + factMethod(integer, integer) );
            System.out.println("\n\n");
        }
        else if (choice == 3) {
            System.out.print("Please enter a word:");
            String word = scan.next();
            int num = 0;
            vowels = vowMethod(word, num);
            System.out.println("Here is your word with only vowels: " + vowels);
            System.out.println("\n\n");
        }
    }

    public int addMethod(int lower, int higher)
    {
        if (lower > higher)
        {
            return 1;
        } else
        {
            return higher + addMethod(lower, higher - 1);
        }
    }

    public String factMethod(int integer, int integer2)
    {
        if (integer2 == 0)
        {
            return " ";
        }
            else if(integer % integer2 == 0)
            {
                return integer2 + " , " + factMethod(integer, integer2 -1);
            }

            else
            {
                return factMethod(integer, integer2-1);
            }
    }

    public String vowMethod(String word, int num)
    {

        int lol = word.length();
        if (lol<=num) return "";
        char let = word.charAt(num);


        if(let == 'a' || let =='e' || let == 'i' || let == 'o' || let == 'u' ) return let + vowMethod(word,num+1);
                else return "" + vowMethod(word,num+1);

    }
}