

package classe.modelo;

public final class ContaComum extends Conta {

	
	@Override
	public boolean sacar(float valor) {
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

}

