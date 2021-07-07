import javax.swing.JOptionPane;

public class Ex3App {

	public static void main(String[] args) {
		
		//Declaro y lleno la variable nombre
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"Bienvenido "+nombre);
		
	}
	
}

