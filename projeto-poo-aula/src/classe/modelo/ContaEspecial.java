
package classe.modelo;

public class ContaEspecial extends Conta {
	
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
	

}


