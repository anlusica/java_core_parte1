package oficina;

public class Principal {

	public static void main(String[] args) {

		Oficina oficina = new Oficina(1, "OFICINA MENOR PREÇO", "DE SEGUNDA A SEXTA DAS 8H ÀS 17H");
		
		Servico alinhamento = new Alinhamento(1, 100.0, 1);
		Servico balanceamento = new Balanceamento(1, 80.0, 1);
		Servico trocaDeOleo = new TrocaOleo(1, 180.0, 1);
		
		oficina.setServico(alinhamento);
		oficina.setServico(balanceamento);
		oficina.setServico(trocaDeOleo);

		Funcionario funcionario1 = new Funcionario(1, "João", 1.300, true);
		Funcionario funcionario2 = new Funcionario(2, "José", 1.300, true);
		Funcionario funcionario3 = new Funcionario(3, "Carlos", 1.300, false);
		Funcionario funcionario4 = new Funcionario(4, "Rodrigo", 1.300, false);
		Funcionario funcionario5 = new Funcionario(5, "Mateus", 1.300, false);
		
		oficina.setFuncionario(funcionario1);
		oficina.setFuncionario(funcionario2);
		oficina.setFuncionario(funcionario3);
		oficina.setFuncionario(funcionario4);
		oficina.setFuncionario(funcionario5);
		
		oficina.abreOficina();
		
	}

}
