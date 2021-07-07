import javax.swing.JOptionPane;

public class Ex5App {

	public static void main(String[] args) {
		
		//Declaro y lleno la variable
		String num_usuario = JOptionPane.showInputDialog("Introduce un numero");
		
		//Paso el valor inroducido a double
		double num = Double.parseDouble(num_usuario);
		
		//Compruebo que sea o no divisible i muestro el mensaje
		if(num%2==0) {
			JOptionPane.showMessageDialog(null,num+" es divisible entre 2");
		}else {
			JOptionPane.showMessageDialog(null,num+" no es divisible entre 2");
		}
		
	}
	
}
