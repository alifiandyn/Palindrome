/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;

/**
 *
 * @author Alifiandy
 */
public class Palindrome {
    static boolean palindrome4 (String kata){
        int left = 0;
        int right = kata.length()-1;
        while (left<right){
            if (kata.charAt(left) != kata.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner scan = new Scanner (System.in);
        String balik = "";
        
        do{
        System.out.println("Masukan kata : ");
        String kata2 = input.nextLine();
        
        if (palindrome4(kata2))
            System.out.println(kata2 + " adalah palindrome");
        
        else
            System.out.println(kata2 + " bukannye palindrome");
        
        System.out.println("apakah anda ingin mengulang? (y/t)");
        balik = scan.nextLine();
                
        // TODO code application logic here
    }
    while (balik.equals("y")||balik.equals("Y"));
    System.out.println("Terima Kasih");
    

    }
    }
