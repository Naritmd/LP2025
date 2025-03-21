/*
Criar e coletar um vetor [100] inteiro e exibir:
a. O maior e o menor valor;
b. A média dos valores.

 */

import javax.swing.JOptionPane;
import java.util.Random;

public class Ex2LT3 {
    public static void main (String args[])
    {
       int vt[] = new int[100];     
       int menor, maior, media = 0, soma = 0;
        
       for (int i = 0; i < 100; i++)
       {
            vt[i] = (int)(Math.random()*501)+1;
            soma += vt[i];
       }
       media = (soma/vt.length);
    
       int i, j, aux;
        
       for (i = 0; i < vt.length-1; i++)
       {
           for (j = i + 1; j < vt.length; j++)
           {
               aux = vt[i];
               vt[i] = vt[j];
               vt[j] = aux;
           }
       }
       
       menor = vt[0];
       maior = vt[99];   
       
        System.out.println("O menor número no vetor é: " +menor+ "\n O maior é: " +maior+ "\n A média é: " +media);
    }
}
