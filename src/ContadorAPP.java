import javax.swing.JOptionPane;

public class ContadorAPP {

	public static void main(String[] args) {
		
		int numero = 0;
		String texto = JOptionPane.showInputDialog("Introduce un numero");
		numero = Integer.parseInt(texto);
		int cifras = contadorCifras(numero);
		
		if(cifras ==1) {
			JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + cifras + " cifra.");
		}else {
			JOptionPane.showMessageDialog(null, "El numero " + numero + " tiene " + cifras + " cifras.");
		}
	}

	public static int contadorCifras(int numero) {
		
		int contador = 0;
		
		for(int i = numero; i > 0; i /= 10) {
			contador++;
		}
		return contador;
	}
}
