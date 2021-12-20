package segundaParte;

import java.util.ArrayList;

public class Zoologico {

    protected ArrayList<Animal> animais = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return this.animais;
    }

}
