/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adit300323;

/**
 *
 * @author LABP1KOMP
 */
public class EqualsTest {
    public static void main(String[] args){
        String str1, str2;
        str1 = "Free the bound periodicals.";
        str2 = str1;
        
        System.out.println("String 1:"+str1);
        System.out.println("String 2:"+str2);
        System.out.println("same object?"+(str1 == str2));
        
        str2 = new String(str1);
        
        System.out.println("String 1:"+str1);
        System.out.println("String2 :"+str2);
        System.out.println("same object?"+(str1 == str2));
        System.out.println("same value?"+str1.equals(str2));
    }
    
}