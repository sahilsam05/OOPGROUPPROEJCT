package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 *  Name: Sahil Samuel
 *  Class Group: SD2A
 */
public class Question3  {   //Nested HTML (Stack)

    /*
filename: name of the file to test.
*/
    public static boolean validate(String filename) throws FileNotFoundException
    {
        Stack<String> stack = new Stack<>();
        Scanner keyboard = new Scanner(new File(filename));


        while (keyboard.hasNext())
        {
            String tag = keyboard.next();

            if (tag != null && tag.matches("<(p|ul|li)>"));
            {
                stack.push(tag);
            }
            if (tag != null && tag.matches("</(p|ul|li)>"))
            {
                if (stack.isEmpty()) ||
            }
        }
        return false;
    }

    /*
        This function tests the files in the files array to see if
         they are valid.
         tags_valid.txt should return true;
         tags_invalid.txt should output as invalid;


     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] files = {"tags_valid.txt", "tags_invalid.txt"};
        for(String fName: files) {
            System.out.print(fName +": ");
            if (validate(fName)) {
                System.out.println("This file is valid");
            } else {
                System.out.println("This file is invalid");
            }
        }
    }



}


