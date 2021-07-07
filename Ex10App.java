import javax.swing.JOptionPane;

public class Ex10App {

	public static void main(String[] args) {
		
		//Creo la variable que guardara la suma de todos los productos 
		double precio_final=0;
		
		//Declaro y lleno la variable ventas
		String ventas_usuario = JOptionPane.showInputDialog("Introduce las ventas");
		
		int ventas = Integer.parseInt(ventas_usuario);
		
		//Pido el precio de todas las ventas
		for(int i = 1;i<=ventas;i++) {
			String precio_ventas_usuario = JOptionPane.showInputDialog("Introduce el precio de las ventas");
			
			double precio_ventas = Double.parseDouble(precio_ventas_usuario);
			
			//Sumo el precio de cada producto
			precio_final=precio_final+precio_ventas;
			
		}
		
		//Muestro el resultado
		JOptionPane.showMessageDialog(null,"Precio final "+precio_final);
		
		
	}
	
}
