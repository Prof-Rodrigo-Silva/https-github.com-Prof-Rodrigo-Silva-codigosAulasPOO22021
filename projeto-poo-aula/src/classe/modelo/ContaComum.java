

package classe.modelo;

import interfaces.Taxas;

public final class ContaComum extends Conta implements Taxas{

	
	@Override
	public boolean sacar(float valor) {
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

	@Override
	public float getTaxaManutencao() {
		return 3.0f;
	}

	@Override
	public void descontarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
		
	}

	

}

