package oficina;

public class Servico {

	private Integer codigo;
	private Double valor;
	private Integer duracaoEmHoras;
	
	public Servico(Integer codigo, Double valor, Integer duracaoEmHoras) {
		this.codigo = codigo;
		this.valor = valor;
		this.duracaoEmHoras = duracaoEmHoras;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Integer getDuracaoEmHoras() {
		return duracaoEmHoras;
	}

	public void setDuracaoEmHoras(Integer duracaoEmHoras) {
		this.duracaoEmHoras = duracaoEmHoras;
	}
	
}
