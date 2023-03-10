package classes;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;

	public Funcionario() {
	}

	public Funcionario(int id, String nome, double salario) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return "\nId: " + id + "\nNome: " + nome + "\nSalario: " + salario;
	}

}
