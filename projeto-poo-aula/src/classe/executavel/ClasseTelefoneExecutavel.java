package classe.executavel;

import classe.modelo.Telefone;

public class ClasseTelefoneExecutavel {
	
	public static void main(String[] args) {
		
	Telefone tel1 = new Telefone();
	tel1.setMarca("Motorola");
	tel1.setModelo("Razor");
	tel1.setImei(123456);
	
	Telefone tel2 = new Telefone();
	tel2.setMarca("Motorola");
	tel2.setModelo("Razor");
	tel2.setImei(12345);
	
	//System.out.println(tel1.toString());
	System.out.println(tel1.hashCode());
	
	//System.out.println(tel2.toString());
	System.out.println(tel2.hashCode());
	
	System.out.println(tel1.equals(tel2));
	}

	

}
