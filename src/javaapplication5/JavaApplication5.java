/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese cantidad de usuarios");
        int largo=read.nextInt();
        String datos[]=new String[largo];
        
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese el dato para "
                    + "el usuario: "+(i+1));
            datos[i]=read.nextLine();
            
        }
        
        
        
        


    }
    
}
