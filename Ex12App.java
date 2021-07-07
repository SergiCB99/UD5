import javax.swing.JOptionPane;

public class Ex12App {

	public static void main(String[] args) {
		
		//Variable que contiene la contraseña
		String contraseña= "abcd";
		
		//Variable que guarda los intentos
		int intentos = 0;
		
		do {
			//Declaro y lleno la variable contraseña_usuario
			String contraseña_usuario = JOptionPane.showInputDialog("Introduce la contraseña");
			
			//Compruebo la contraseña introducida por el usuario
			if(contraseña_usuario.equals(contraseña)) {
				intentos = 3;
			}else {
				intentos++;
			}
		
		}while(intentos<3); 
		
	}
	
}
