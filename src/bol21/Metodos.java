/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Metodos {
    
      String []palabras = new String[5];
    
    public void leerEscribir(String nombreF) {
        String resp = null;
        PrintWriter fich=null;
        try{
            fich = new PrintWriter(new File (resp));
           
            for(int i=0;i<palabras.length;i++){
                System.out.println(palabras[i]);
                fich.println(i+ " " + palabras[i]);
         }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error" + ex.toString());
        } finally{
            fich.close();
        }
            
        }
    public void cargarArray(){
        for(int i = 0;i<palabras.length;i++){
            palabras[i] = JOptionPane.showInputDialog("Palabra");
        }
        
    }
    public void ordenar(){
        Arrays.sort(palabras);
        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }
    }
     public void lerFich(String nomeFich) {

       Scanner sc = null;
       try {
           File f = new File(nomeFich);
           sc = new Scanner(f);
           //también: sc = new Scanner(new File(nomeFich));
           while(sc.hasNextLine()){
               String res = sc.nextLine();
               System.out.println(res);
               //tambien: sout(sc.nextLine());
           }
       } catch (FileNotFoundException ex) {
           System.out.println("Erro no ficheiro " + ex.toString());
       } finally {
           sc.close();
       }
   }
  
   
}

