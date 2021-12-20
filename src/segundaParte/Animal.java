package segundaParte;

import java.util.ArrayList;

public abstract class Animal {

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void emitirSom() {

    }
}
