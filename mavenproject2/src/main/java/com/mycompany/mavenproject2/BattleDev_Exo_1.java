/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author ferra
 */
public class BattleDev_Exo_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Yo tout le monde");
         try{
            BufferedReader reader = new BufferedReader(new FileReader("../exercices/BattleDev S11 - Mars 2018/Exercice 1 - Le meilleur restaurant/input2.txt"));
            String line;
            double max = 0;
            while((line = reader.readLine()) != null){
                 String [] Notes = line.split(" "); 
                if(Notes.length >1){
                float avg = (Float.parseFloat(Notes[0]) + Float.parseFloat(Notes[1]) + Float.parseFloat(Notes[2])) /3;
                double AutreTruc = Math.ceil(avg);
                if (AutreTruc >= max){
                    max = AutreTruc;
                }

                }
            }
              System.out.println(max);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
        // TODO code application logic here
    }
 
