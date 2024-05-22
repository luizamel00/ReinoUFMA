public class Magos extends Personagem implements AcoesPersonagem {
    //Atributos
    private int habilidadeMagica;
    private int esquiva;

    //Construtor
    
    public Magos(String nome, int forca, int pontosDeVida, int habilidadeMagica, int esquiva){
        super(nome, forca, pontosDeVida);
        this.habilidadeMagica = habilidadeMagica;
        this.esquiva = esquiva;
    }

    //Métodos de Ação
    @Override
    public int atacar() {
        return getForca() * this.habilidadeMagica;
    }

    @Override
    public void receberDano(int dano){
        if (Math.random()*100>= this.esquiva){
            setPontosDeVida(getPontosDeVida() - dano);
        }
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Mago: " + getNome() + ", Nível: " + getNivel() + ", Força: " + getForca() +
                           ", HP: " + getPontosDeVida() + ", Habilidade Mágica: " + this.habilidadeMagica +
                           ", Esquiva: " + this.esquiva);
    }


    //Getters e Seters
    public void setHabilidadeMagica(int habilidadeMagica){
        this.habilidadeMagica = habilidadeMagica;
    }
    public int getHabilidadeMagica(){
        return habilidadeMagica;
    }

    public void setEsquiva(int esquiva){
        this.esquiva = esquiva;
    }
    public int getEsquiva(){
        return esquiva;
    }

}
