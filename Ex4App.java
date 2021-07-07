import javax.swing.JOptionPane;

public class Ex4App {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		//Declaro y lleno la variable nombre
		String radio_usuario = JOptionPane.showInputDialog("Introduce el radio");
		
		//Paso el valor inroducido a double
		double radio = Double.parseDouble(radio_usuario);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"Area = "+(PI*Math.pow(radio,2)));
		
	}
	
}
