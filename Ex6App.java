import javax.swing.JOptionPane;

public class Ex6App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		//Declaro y lleno la variable
		String precio_usuario = JOptionPane.showInputDialog("Introduce el precio");
		
		//Paso el valor inroducido a double
		double precio = Double.parseDouble(precio_usuario);
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"Precio = "+(precio+(precio*IVA)));
		
	}
	
}
