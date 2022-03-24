package classe.executavel;

import javax.swing.JOptionPane;

public class ClasseExcecoes {

	public static void main(String[] args){

		int v1[] = {5,8,9,6,5,1,4};
		int v2[] = {2,3,4,0,8};
		for(int i = 0; i < v1.length; i++) {
			
			/*try {
				System.out.println(v1[i]+" / "+v2[i]+"="+v1[i]/v2[i]);
				
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Erro encontrado: "+e);
			} catch (ArrayIndexOutOfBoundsException e) {
				//e.printStackTrace();
				System.out.println("Erro encontrado: "+e);
			} finally {
				JOptionPane.showMessageDialog(null, "OK, passou pelo finally!!");
			}*/
			
			try {
				System.out.println(v1[i]+" / "+v2[i]+"="+v1[i]/v2[i]);
			}catch (Exception e) {
				StringBuilder saida = new StringBuilder();
				//e.printStackTrace();
				System.out.println("Mensagem: "+e.getMessage());

				for(int j = 0; j < e.getStackTrace().length; j++) {
					saida.append("\nClasse de erro: "+e.getStackTrace()[j].getClassName());
					saida.append("\nMétodo de erro: "+e.getStackTrace()[j].getMethodName());
					saida.append("\nMensagem de erro: "+e.getMessage());
					saida.append("\nLinha de erro: " +e.getStackTrace()[j].getLineNumber());
				}
				JOptionPane.showMessageDialog(null, saida);
			}
		}
	}
}



