/*
33. Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */

import javax.swing.JOptionPane;
public class EX33LT1 
{
    static double n; 
    static double serie = 0;
    
    public static void main (String args[])
    {
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
        
         ProcedureSerie();
         
        JOptionPane.showMessageDialog(null,"A soma da série é "+serie);
    }
    
    static void ProcedureSerie()
    {
        for(int i = 1; i <= n; i++)
        {
            serie += 1.0/i;            
        }
    }
}
