/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeexercícios1poo;
import javax.swing.JOptionPane;
/**
 *
 * @author murilorcm
 */
public class Questao6 {
    
    public static void main(String[] args){
        //int vetor[][] = new int[3][5];
        //vetor[0]= 6;
        //vetor[1]= 9;
        //vetor[2]= 13;
          int vetor[] = {6, 9, 13}, i;
          
          for(i=0;i < vetor.length ; i++){
              JOptionPane.showMessageDialog(null, vetor[i]);
          }
    }
    
    
}