package oficina;

public class Funcionario {
	
	private Integer codigo;
	private String nome;
	private Double salario;
	private Boolean realizaTrocaDeOleo;
	
	public Funcionario(Integer codigo, String nome, Double salario, Boolean realizaTrocaDeOleo) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
		this.realizaTrocaDeOleo = realizaTrocaDeOleo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Boolean getRealizaTrocaDeOleo() {
		return realizaTrocaDeOleo;
	}
	public void setRealizaTrocaDeOleo(Boolean realizaTrocaDeOleo) {
		this.realizaTrocaDeOleo = realizaTrocaDeOleo;
	}
	
}
