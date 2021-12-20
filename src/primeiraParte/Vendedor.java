package primeiraParte;

import java.util.ArrayList;

public class Vendedor extends Empregado {

    protected ArrayList<Double> valorVendas = new ArrayList<>();
    protected double comissao = 0.05;

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    public ArrayList<Double> getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas.add(valorVendas);
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double salario = (this.salarioBase - (this.salarioBase * this.imposto));
        for (double valor : valorVendas) {
            salario += valor*comissao;
        }
        return salario;
    }

}
