public class Guerreiros extends Personagem implements AcoesPersonagem {
    private int habilidadeCombate;
    private int escudo;

    //Construtor
    public Guerreiros (String nome, int forca, int pontosDeVida, int habilidadeCombate, int escudo){
        super(nome, forca, pontosDeVida);
        this.habilidadeCombate = habilidadeCombate;
        this.escudo = escudo;        
    }

    //Métodos de ação
    @Override
    public int atacar(){
        return getForca()*this.habilidadeCombate;
    }
    @Override
    public void receberDano(int dano){
        if (getEscudo() > 0){
            this.escudo -= dano;
            if (this.escudo < 0){
                setPontosDeVida(getPontosDeVida() - this.escudo); 
                this.escudo = 0;
            }
        } else {
            setPontosDeVida(getPontosDeVida() - dano);
        }
    }
    @Override
    public void mostrarDetalhes(){
        System.out.println("Guerreiro: " + getNome() + ", Nível: " + getNivel() + ", Força: " + getForca() +
        ", HP: " + getPontosDeVida() + ", Habilidade de Combate: " + this.habilidadeCombate +
        ", Escudo: " + this.escudo);
    }

    //Geters e Seters
    public void setHabilidadeCombate(int habilidadeCombate){
        this.habilidadeCombate = habilidadeCombate;
    }
    public int getHabilidadeCombate(){
        return habilidadeCombate;
    }

    public void setEscudo(int escudo){
        this.escudo = escudo;
    }
    public int getEscudo(){
        return escudo;
    }
}
