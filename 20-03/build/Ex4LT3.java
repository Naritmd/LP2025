/*
Criar e coletar em um vetor [30] real e calcular e exibir:
a. A média do grupo;
b. A quantidade de notas acima do grupo;
c. As posições dos valores abaixo da média do grupo.
 */

import javax.swing.JOptionPane;
import java.util.Random;

public class Ex4LT3 
{
    public static void main (String[] args)
    {
        double vt[] = new double[30];
        int opc = 0;
        double media = 0.0;
        
        while(opc !=9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1-Carregar Vetor \n 2-Media do grupo \n 3-Quantidade de notas acima da media do grupo \n 4-As posições dos valores abaixo da média do grupo \n 9-FIM"));
        
        switch(opc)
        {
            case 1:
                vt = CarregaVetor(vt);
                break;
            case 2:
                MediaVetor(vt);
                break;
            case 3: 
                AcimaMedia(vt, media);
                break;
            case 4:
                AbaixoMedia(vt,media);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);
                break;
            default: JOptionPane.showMessageDialog(null, "Opção Inválida");    
            
        }
        }
                
    }
    
    public static double[] CarregaVetor(double vt[])
    {
        for (int i = 0; i < 30; i++)
        {
            vt[i] = Math.random()*10 + 1;
        }
        JOptionPane.showMessageDialog(null, "Vetor Carregado");
        return vt;
    }
    
    public static double MediaVetor (double vt[])
    {
       double soma = 0.0, media = 0.0;
       for (int i = 0; i < 30; i++)
       {
           soma += vt[i];
       }
       media = (soma / 30);
       JOptionPane.showMessageDialog(null, "A média do grupo é de "+media);
       return media;
    }
    
    public static void AcimaMedia (double vt[], double media)
    {
        int acima = 0;
        for(int i = 0; i < 30; i++)
        {
            if (vt[i] > media)
            {
                acima += 1;
            }
        }
        
        JOptionPane.showMessageDialog(null, "O numero de valores acima da média é de: "+acima);
    }
    
    public static void AbaixoMedia (double vt[], double media)
    {
        int abaixo = 0;
        for (int i = 0; i < 30; i++)
        {
            if (vt[i] < media)
            {
                JOptionPane.showMessageDialog(null, "O valor de " +vt[i]+ "está abaixo da media, na posição "+i);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Não há valores abaixo da média");
            }
        }
    }
}
