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
        String[] nombre=new String[largo];
        int [] nacimiento=new int[largo];
        byte[]edad=new byte[largo];
        
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Ingrese el nombre para "
                    + "el usuario: "+(i+1));
            nombre[i]=read.nextLine();
            System.out.println("Ingrese el año de nacimiento"
                    + " para el usuario: "+(i+1));
            nacimiento[i]=read.nextInt();
            edad[i]=(byte)(2016-nacimiento[i]);
        }
        
        
        
        


    }
    
}
