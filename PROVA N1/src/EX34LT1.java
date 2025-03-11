/*
34. Receba um número. Calcule e mostre os resultados da tabuada desse número
 */

import javax.swing.JOptionPane;
public class EX34LT1 
{
    static int n, tabuada;
    
    public static void main (String args[])
    {
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));
        
        ProcedureTabuada();
    }
    static void ProcedureTabuada()
    {
        for (int i = 0; i <=10; i++)
        {
            tabuada = n * i;
            System.out.println(n+"x"+i+" = " +tabuada);
        }
    }
}
