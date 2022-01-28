package classe.modelo;

public class Conta {
	
	private int codigo;
	private Pessoa correntista;
	private float saldo;
	
	public Conta() {
			
	}
	
	public Conta(int codigo, Pessoa correntista, float saldo){
		this.codigo = codigo;
		this.correntista = correntista;
		this.saldo = saldo;
	}
	
	public Conta(int codigo, float saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
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
	
	public void depositar (float valor) {
		this.saldo = this.saldo + valor;	
	}
	public boolean sacar(float valor) {	
		if(this.saldo - valor >= 0) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;
	}

}
