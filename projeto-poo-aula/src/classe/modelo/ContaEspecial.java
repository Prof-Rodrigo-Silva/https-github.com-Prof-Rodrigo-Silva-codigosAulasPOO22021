
package classe.modelo;

import interfaces.Taxas;

public class ContaEspecial extends Conta implements Taxas{
	
	private float limite;
	
	
	public ContaEspecial() {
		super();
		
	}
	
	public ContaEspecial(int numero, Pessoa correntista, float saldo, float limite) {
		super(numero,correntista,saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public boolean sacar(float valor) {	
		if(this.getSaldo() - valor >= this.limite) {
			this.setSaldo(this.getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public float getTaxaManutencao() {
		return 15.0f;
	}

	@Override
	public void descontarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
		
	}
	

}


