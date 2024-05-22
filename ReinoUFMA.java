import java.util.Random;

public class ReinoUFMA {

    // Método Combate que recebe os personagens como parâmetro, declara os atacantes e os defensores e compara seus níveis e força
    public static void combate(Personagem p1, Personagem p2) {
        Personagem atacante, defensor;
        
        if (p1.getNivel() > p2.getNivel()) {
            atacante = p1;
            defensor = p2;
        } else if (p2.getNivel() > p1.getNivel()) {
            atacante = p2;
            defensor = p1;
        } else {
            Random random = new Random(); // Se tiverem níveis iguais, define aleatoriamente defensor e atacante
            if (random.nextBoolean()) {
                atacante = p1;
                defensor = p2;
            } else {
                atacante = p2;
                defensor = p1;
            }
        }
        //Depois de definir atacante e defensor, calcula o dano (que é de acordo com cada personagem)
        System.out.println("Combate entre " + atacante.getNome() + " e " + defensor.getNome());
        int dano = atacante.atacar();
        defensor.receberDano(dano);
        
        atacante.subirNivel(); 
        
        System.out.println("Após o combate:");
        atacante.mostrarDetalhes();
        defensor.mostrarDetalhes();
    }
    public static void main(String[] args) {
        //Instacia os personagens e realiza o combate
        Magos mago = new Magos("Sarinha", 10, 100, 5, 20);
        Guerreiros guerreiro = new Guerreiros("Luiza", 12, 150, 4, 50);
        Arqueiros arqueiro = new Arqueiros("Melo Prost", 8, 80, 6, 15);
        
        combate(mago, guerreiro);
        combate(guerreiro, arqueiro);
        combate(mago, arqueiro);
    }
}