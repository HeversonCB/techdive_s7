package segundaParte;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Cachorro latindo");
    }

    public void correr() {
        System.out.println("Cachorro correndo");
    }

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }
}
