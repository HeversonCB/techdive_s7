package primeiraParte;

import java.util.ArrayList;

public class Administrador extends Empregado {

    protected ArrayList<Double> ajudaDeCusto = new ArrayList<>();

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    public ArrayList<Double> getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto.add(ajudaDeCusto);
    }

    @Override
    public double calcularSalario() {
        double salario = (this.salarioBase - (this.salarioBase * this.imposto));
        for (double custo : ajudaDeCusto) {
            salario += custo;
        }
        return salario;
    }
}
