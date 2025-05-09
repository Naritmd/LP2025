
package transito;

class Transito 
{
    int codigoCidade;
    String nomeCidade;
    int qtAcidentes;
    
    Transito()
    {
        this(0, "", 0);
    }
    
    Transito(int cidade, String nome, int acidentes)
    {
        codigoCidade = cidade;
        nomeCidade = nome;
        qtAcidentes = acidentes;
    }
}
