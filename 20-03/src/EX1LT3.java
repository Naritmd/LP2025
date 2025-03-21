/*
Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a. A média dos valores entre 10 e 200;
b. A soma dos números ímpares.
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class EX1LT3 
{
    public static void main (String args[])
    {
        int random;
        int vt[] = new int[50];
       
        for (int i =0; i < 50; i++)
        {
            vt[i] = (int)(Math.random()*501)+1;
        }
        
          int soma = 0;
          int cta = 0;
          int media = 0;
          
        for (int i = 0; i < 50; i++)
        {
          
            if (vt[i] >= 10 && vt[i] <= 200)
            { 
                soma += vt[i];
                cta += 1;
            }
            media = (soma/cta);
        }
        
            int impar = 0;
        for (int i = 0; i < 50; i++)
        {
            if (vt[i] % 2 == 1)
            {
                impar += vt[i];
            }
        }
        
        System.out.println("A média dos valores entre 10 e 200 é de: " + media);
        System.out.println("A soma dos valores ímpares é de: "+impar);
    }    

}
