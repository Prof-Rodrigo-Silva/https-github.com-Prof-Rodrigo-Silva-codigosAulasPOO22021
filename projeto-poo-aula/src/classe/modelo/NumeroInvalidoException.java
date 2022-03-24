package classe.modelo;

public class NumeroInvalidoException extends Exception{
	
	private int numero;
	
	public NumeroInvalidoException(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "O número ("+ this.numero + ") informado é inválido";		
	}
}

