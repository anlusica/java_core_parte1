package oficina;

import java.util.ArrayList;
import java.util.List;

public class Oficina {
	
	private Integer codigo;
	private String nome;
	private String descricao;
	private List<Funcionario> funcionarios = new ArrayList<>();
	private List<Servico> servicos = new ArrayList<>();
	
	public Oficina(Integer codigo, String nome, String descricao) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServico(Servico servico) {
		this.servicos.add(servico);
	}
	
	public void abreOficina() {
		System.out.println(this.nome);
		System.out.println(this.descricao);
		System.out.println("----------------------------------------");
		System.out.println("SERVIÇOS:");
		for(Servico servico : servicos) {
			System.out.println(servico.toString().substring(servico.toString().indexOf(".") + 1, servico.toString().indexOf("@")) + " - Valor: " + servico.getValor() + " - Duração: " + servico.getDuracaoEmHoras() + "hr");
		}
		System.out.println("----------------------------------------");
		System.out.println("FUNCIONÁRIOS:");
		for(Funcionario funcionario: funcionarios) {
			System.out.println(funcionario.getNome() + " - Salário: " + funcionario.getSalario() + " - Realiza Troca de Óleo: " + funcionario.getRealizaTrocaDeOleo());
		}
	}

}
