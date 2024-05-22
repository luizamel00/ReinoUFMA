public abstract class Personagem implements AcoesPersonagem {
    //Atributos
    private String nome;
    private int nivel;
    private int forca;
    private int pontosDeVida;

    //Construtor
    public Personagem(String nome, int pontosDeVida, int forca){
        this.nome = nome;
        this.nivel = 1;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;

    }    

    //Método para subir o nível
    public void subirNivel(){
        this.nivel++;
    }

    //Getters e Seters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public int getNivel(){
        return nivel;
    }

    public void setForca(int forca){
        this.forca = forca;
    }
    public int getForca(){
        return forca;
    }

    public void setPontosDeVida(int pontosDeVida){
        this.pontosDeVida = pontosDeVida;
    }
    public int getPontosDeVida(){
        return pontosDeVida;
    }

}
