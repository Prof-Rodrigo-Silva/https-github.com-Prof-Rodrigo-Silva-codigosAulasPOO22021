package classe.modelo;

public class ContaCorrente {
	
	private double saldo;
	private double limite;
	
	public ContaCorrente() {}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	boolean saca(double quantidade) {
	    // posso sacar até saldo+limite
	    if (quantidade > this.saldo + this.limite) { 
	            System.out.println("Não posso sacar fora do limite!");
	            return false;
	        } else {
	            this.saldo = this.saldo - quantidade;
	            return true;
	        }
	    }
	public void deposita (int valor) {
		this.saldo = this.saldo + valor;	
	}

}
