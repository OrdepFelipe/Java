package classes;

public class VariacaoSalario {
	private Double varSalario;

	public VariacaoSalario(Double varSalario) {
		this.varSalario = varSalario;
	}

	public VariacaoSalario() {

	}

	public Double getVarSalario() {
		return varSalario;
	}

	public void setVarSalario(Double varSalario) {
		this.varSalario = varSalario;
	}

	public double incrementoSalario(Double salario) {
		double converPorcentagem = varSalario / 100;
		return salario + (salario * converPorcentagem);

	}

	public double decrementoSalario(Double salario) {
		double converPorcentagem = varSalario / 100;
		return salario - (salario * converPorcentagem);

	}
}
