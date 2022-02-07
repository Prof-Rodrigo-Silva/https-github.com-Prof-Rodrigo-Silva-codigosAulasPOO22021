

package classe.modelo;

public abstract class Conta {
	
	protected int codigo;
	protected Pessoa correntista;
	protected float saldo;
	protected static int numeroContas;
	
		
	public Conta() {
		//implementaNroContas();
		numeroContas =1;
		
	}
	
	public Conta(int codigo, Pessoa correntista, float saldo) {
		this.codigo = codigo;
		this.correntista = correntista;
		this.saldo = saldo;
		//implementaNroContas();
		numeroContas =1;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Pessoa getCorrentista() {
		return correntista;
	}
	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public final void depositar (float valor) {
		this.saldo = this.saldo + valor;	
	}
	
		
	public boolean sacar(float valor) {	
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

	public static int getNumeroContas() {
		return numeroContas;
	}

	public static void implementaNroContas() {
		numeroContas++;
	}
	
	
	

}






