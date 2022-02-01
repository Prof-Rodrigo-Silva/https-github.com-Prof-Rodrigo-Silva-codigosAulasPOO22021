package classe.modelo;

public class ContaCorrente extends Conta{
	
	private int indentificador;
	private int limite;
	
	public ContaCorrente() {
		
	}
	
	public int getIndentificador() {
		return indentificador;
	}
	public void setIndentificador(int indentificador) {
		this.indentificador = indentificador;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	@Override
	public String verIdade(int idade) {
		if(idade >= 18) {
			return "Maior";
			}else {
				return "Menor";
			}
	}
	
	

}
