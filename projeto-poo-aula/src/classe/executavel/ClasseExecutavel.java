
package classe.executavel;

import classe.modelo.Conta;
import classe.modelo.ContaEspecial;
import classe.modelo.Pessoa;

public class ClasseExecutavel {

	public static void main(String[] args) {
		
		/*Pessoa correntista = new Pessoa("Ciclano",33,999887766,"ciclano@gmail.com");
		
		ContaEspecial especial = new ContaEspecial(3322, correntista, 1500, 500);
		
		System.out.println("Nome...................: "+especial.getCorrentista().getNome());
		System.out.println("Saldo..................: "+especial.getSaldo());
		System.out.println(especial.sacar(1000));
		
		
		System.out.println(especial.movimentar(500, especial.DEPOSITAR));*/
		
		ContaEspecial conta1, conta2, conta3;
		
		conta1 = new ContaEspecial();
		System.out.println(Conta.getNumeroContas());
		
		conta2 = new ContaEspecial();
		System.out.println(conta2.getNumeroContas());
		
		conta3 = new ContaEspecial();
		System.out.println(conta3.getNumeroContas());
        
        
    }
		
}

