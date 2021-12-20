package primeiraParte;

import java.util.ArrayList;

public class Operario extends Empregado {

    protected ArrayList<Double> valorProducao = new ArrayList<>();
    protected double comissao = 0.05;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone, codigoSetor, salarioBase);
    }

    public ArrayList<Double> getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao.add(valorProducao);
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double salario = (this.salarioBase - (this.salarioBase * this.imposto));
        for (double valor : valorProducao) {
            salario += valor*comissao;
        }
        return salario;
    }

}
