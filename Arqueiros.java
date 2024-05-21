public class Arqueiros extends Personagem {
    private int habilidadeArco;
    private int destreza;


    //Construtor
    public Arqueiros(String nome, int forca, int pontosDeVida, int habilidadeArco, int destreza){
        super(nome, forca,  pontosDeVida);
        this.habilidadeArco = habilidadeArco;
        this.destreza = destreza;
    }

    //Métodos de Ação
    @Override
    public int atacar(){
        return getForca() * this.habilidadeArco * this.destreza;
    }
    @Override
    public void receberDano(int dano){
        setPontosDeVida(getPontosDeVida() - dano);
    }
    public void mostrarDetalhes(){
        System.out.println("Arqueiro: " + getNome() + ", Nível: " + getNivel() + ", Força: " + getForca() +
                           ", HP: " + getPontosDeVida() + ", Habilidade com Arco: " + this.habilidadeArco +
                           ", Destreza: " + this.destreza);
    }

    //Geters e Seters
    public void setHabilidadeArco(int habilidadeArco){
        this.habilidadeArco = habilidadeArco;
    }
    public int getHabilidadeArco(){
        return habilidadeArco;
    }

    public void setDestreza(int destreza){
        this.destreza = destreza;
    }
    public int getDestreza(){
        return destreza;
    }


    
}
