package segundaParte;

public class Cavalo extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cavalo relinchando");
    }

    public void correr() {
        System.out.println("Cavalo correndo");
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }
}
