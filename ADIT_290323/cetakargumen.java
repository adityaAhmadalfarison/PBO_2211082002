/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC6
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class cetakargumen{
    public static void main (String[] args ){
      BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
      String argumen = "";
    System.out.println("Enter your Arguments");
    try
    {
        argumen = dataIn.readLine();
    }
    catch(IOException e)
    {
        System.out.println("Error!");
    }
    System.out.println("arguments="+argumen);
            }
}