import primeiraParte.*;
import segundaParte.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        System.out.println("----------TESTE CLASSE FORNECEDOR----------");
        Fornecedor fornecedor = new Fornecedor("Heverson fornecedor", "Av Emilia Ramos", "(48) 99999-9999", 5000, 2000);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: R$" + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: R$" + fornecedor.getValorDivida());
        System.out.println("Saldo: R$" + fornecedor.obterSaldo());

        System.out.println("\n\n----------TESTE CLASSE EMPREGADO----------");
        Empregado empregado = new Empregado("Heverson empregado", "Av Emilia Ramos", "(48) 99999-9999", 1, 2000);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário base: R$" + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto()*100 + "%");
        System.out.println("Salário final: R$" + empregado.calcularSalario());

        System.out.println("\n\n----------TESTE CLASSE ADMINISTRADOR----------");
        Administrador administrador = new Administrador("Heverson administrador", "Av Emilia Ramos", "(48) 99999-9999", 1, 2000);
        administrador.setAjudaDeCusto(50);
        administrador.setAjudaDeCusto(75);
        administrador.setAjudaDeCusto(150);
        administrador.setAjudaDeCusto(25);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário base: R$" + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto()*100 + "%");
        System.out.println("Salário final: R$" + administrador.calcularSalario());

        System.out.println("\n\n----------TESTE CLASSE OPERÁRIO----------");
        Operario operario = new Operario("Heverson operário", "Av Emilia Ramos", "(48) 99999-9999", 1, 2000);
        operario.setValorProducao(100);
        operario.setValorProducao(100);
        operario.setValorProducao(100);
        operario.setValorProducao(100);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Setor: " + operario.getCodigoSetor());
        System.out.println("Salário base: R$" + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto()*100 + "%");
        System.out.println("Porc. Comissão: " + operario.getComissao()*100 + "%");
        System.out.println("Salário final: R$" + operario.calcularSalario());

        System.out.println("\n\n----------TESTE CLASSE VENDEDOR----------");
        Vendedor vendedor = new Vendedor("Heverson vendedor", "Av Emilia Ramos", "(48) 99999-9999", 1, 2000);
        vendedor.setValorVendas(100);
        vendedor.setValorVendas(100);
        vendedor.setValorVendas(100);
        vendedor.setValorVendas(100);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário base: R$" + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto()*100 + "%");
        System.out.println("Porc. Comissão: " + vendedor.getComissao()*100 + "%");
        System.out.println("Salário final: R$" + vendedor.calcularSalario());

        System.out.println("\n\n----------TESTE ANIMAIS----------");
        ArrayList<Animal> animais = new ArrayList<>();
        Cachorro cachorro = new Cachorro("Cachorro", 10);
        Cavalo cavalo = new Cavalo("Cavalo", 15);
        Preguica preguica = new Preguica("Preguiça", 5);
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);
        for (Animal animal:
             animais) {
            animal.emitirSom();
        }

        Veterinario veterinario = new Veterinario();
        for (Animal animal:
             animais) {
            System.out.print("\nVeterinario examinando " + animal.getNome() + ": ");
            veterinario.examinar(animal);
        }

        Zoologico zoo = new Zoologico();
        zoo.addAnimal(cachorro);
        zoo.addAnimal(cavalo);
        zoo.addAnimal(preguica);
        zoo.addAnimal(cavalo);
        zoo.addAnimal(cachorro);
        zoo.addAnimal(preguica);
        zoo.addAnimal(cavalo);
        zoo.addAnimal(cachorro);
        zoo.addAnimal(preguica);
        zoo.addAnimal(cavalo);
        System.out.println("\n\n");
        for (Animal animal:
             zoo.getAnimais()) {
            animal.emitirSom();
            if (animal instanceof Cachorro) {
                ((Cachorro) animal).correr();
            } else if (animal instanceof Cavalo) {
                ((Cavalo) animal).correr();
            }
            System.out.println("\n");
        }

    }
}
