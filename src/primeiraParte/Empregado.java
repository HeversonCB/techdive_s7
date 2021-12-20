package primeiraParte;

public class Empregado extends Pessoa{

    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto = 0.2;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return (this.salarioBase - (this.salarioBase * this.imposto));
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
