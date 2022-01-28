package classe.executavel;

import classe.modelo.Conta;
import classe.modelo.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Ciclano");
		pessoa.setIdade(38);
		pessoa.setCelular(999887766);
		pessoa.setEmail("ciclano@gmail.com");
		Pessoa pessoa1 = new Pessoa("Zileide", 27, 22233344, "zileide@gmail.com");
		/*pessoa.nome = "Ciclano Asteróides";
		pessoa.idade = 38;
		pessoa.celular = 999999999;
		pessoa.email = "ciclano@gmail.com";
		
		System.out.println("Nome: "+pessoa.nome+" e a sua idade é "+pessoa.idade);
		System.out.println("--------------------------------------------");
		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Fulano de Tal";
		
		System.out.println("Nome............: "+pessoa1.nome);*/
		
		Conta conta1 = new Conta(555555, pessoa1, 50.00f);
		Conta conta2 = new Conta(123456, pessoa ,877.77f);
		Conta conta3 = new Conta(998877, 11237.04f);
		
		
		//conta1.setCodigo(112233);
		//conta1.setCorrentista("Ciclano Asteróides");
		//conta1.setSaldo(500.00f);
		
		//conta3.setCorrentista("Zezinho");

		
		System.out.println("Conta número.................: "+conta1.getCodigo());
		System.out.println("Correntista..................: "+conta1.getCorrentista().getNome());
		System.out.println("A idade é....................: "+conta1.getCorrentista().getIdade());
		System.out.println("Saldo......................R$: "+conta1.getSaldo());
		System.out.println("------------------------------------------------------------------");
		System.out.println("Conta número.................: "+conta2.getCodigo());
		System.out.println("Correntista..................: "+conta2.getCorrentista().getNome());
		System.out.println("Celular..................: "+conta2.getCorrentista().getCelular());
		System.out.println("Saldo......................R$: "+conta2.getSaldo());
		System.out.println("------------------------------------------------------------------");
		System.out.println("Conta número.................: "+conta3.getCodigo());
		System.out.println("Correntista..................: "+conta3.getCorrentista());
		System.out.println("Saldo......................R$: "+conta3.getSaldo());
		
		/*conta1.depositar(1000.00f);
		System.out.println("Saldo após depósito........R$: "+conta1.getSaldo());
		
		if(conta1.sacar(150.00f)) {
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insuficiente para saque!");
		}
		System.out.println("Saldo.......................R$: "+conta.getSaldo());*/
	}

}
