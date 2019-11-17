/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometester;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author mtsguest
 */
public class PalindromeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        File myFile;
        Scanner inFile = null;
        String word;
        LinkedList<String> possiblePal;
        HelperPal myPalHelp = new HelperPal();
        
        try
        {
            myFile = new File("candidates.txt");
            inFile = new Scanner(myFile);
            while (inFile.hasNext())
            {
                word = inFile.next();
                possiblePal = makeLinkedList(word);
                
                if (myPalHelp.isPalindrome(possiblePal))
                {
                    System.out.println(word + " is a Palindrome.");
                    
                }
                else
                {
                    System.out.println(word + " is NOT a Palindrome.");
                }
        
            }
      
        }
        catch (IOException e)
        {
            System.out.println("Sorry, wrong file.  Come back later.");
        }
        finally
        {
            if (inFile != null)
                inFile.close();
        }
        
    }
    
    public static LinkedList<String> makeLinkedList(String word)
    {
        
        return new LinkedList<String>();
    }
    
    
}
