/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizn2;

import java.util.Scanner;

/**
 *
 * @author neliloghmani
 */
public class QuizN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kbd = new Scanner (System.in);
        String correctUsername = "nl2027";
        String correctPassword = "hello";
        
        System.out.print("Please enter username ");
        String username = kbd.next();
        
        System.out.print("Please enter password " );
        String password = kbd.next();
        
        if (correctPassword.equals(password))
        {
            System.out.println("Welcome  " + username);
        } 
            else 
                    {
                    System.out.println("Wrong Password");
                    }
    }
    
}
