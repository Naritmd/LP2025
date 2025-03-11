/*
32. Receba um número inteiro. Calcule e mostre o seu fatorial.

 */

import javax.swing.JOptionPane;
public class EX32LT1 
{
    static int n, fat = 1;
    public static void main (String args[])
    {
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));
        
        ProcedureFatorial();
        
        System.out.println("o fatorial de "+n+" é igual a: \n" +fat);
    }
    
    static void ProcedureFatorial()
    {
        for (int i = n; i > 0; i--)
        {
            fat *= i;
        }
    }
}
