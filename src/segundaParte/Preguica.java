package segundaParte;

public class Preguica extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Preguiça emitindo som");
    }

    public void subirEmArvore() {
        System.out.println("Preguiça subindo árvore");
    }

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
}
