
package transito;

import javax.swing.*;

public class classeMetodos 
{
    public Transito[] CadastraEstatistica(Transito[]transito)
    {
        for (int i =0; i < 5; i++)
        {
            transito[i].codigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Informe o codigo da cidade"));
            transito[i].nomeCidade = JOptionPane.showInputDialog("Informe o nome da cidaed");
            transito[i].qtAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de acidentes"));       
        }
        
        return transito;
    }
    
    public void qtAcidentes(Transito[]transito)
    {
        for (int i =0; i < 5; i++)
        {
            if (transito[i].qtAcidentes > 100 && transito[i].qtAcidentes < 500)
            {
                System.out.println("A quantidade de acidentes da cidade "+transito[i].nomeCidade+ " é de " +transito[i].qtAcidentes);
            }
        }
    }
    
    public void pMaiorMenor(Transito[]transito)
    {
        Transito maior = transito [0];
        Transito menor = transito [0];
        
        for(int i = 0; i < 5; i++)
        {
             if(transito[i].qtAcidentes > maior.qtAcidentes)
             {
                 maior = transito[i]; 
             }
             if(transito[i].qtAcidentes < menor.qtAcidentes)
             {
                 menor = transito[i];
             }
        }
        
        JOptionPane.showMessageDialog(null, maior.nomeCidade + " com " +maior.qtAcidentes + " acidentesan" + menor.nomeCidade + " com " +menor.qtAcidentes + " acidentes");
    }
    
    public void pAcima(Transito[]transito)
    {
        int soma = 0;
        for (int i = 0; i < 5; i++)
        {
            soma += transito[i].qtAcidentes;            
        }
        int media = soma / 5;
        
        for (int i = 0; i < 5; i++)
        {
            if(transito[i].qtAcidentes > media);
            {
                System.out.println(transito[i].nomeCidade + "está acima da média");
            }
        }
    }
}
