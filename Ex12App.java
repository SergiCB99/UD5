import javax.swing.JOptionPane;

public class Ex12App {

	public static void main(String[] args) {
		
		//Variable que contiene la contraseņa
		String contraseņa= "abcd";
		
		//Variable que guarda los intentos
		int intentos = 0;
		
		do {
			//Declaro y lleno la variable contraseņa_usuario
			String contraseņa_usuario = JOptionPane.showInputDialog("Introduce la contraseņa");
			
			//Compruebo la contraseņa introducida por el usuario
			if(contraseņa_usuario.equals(contraseņa)) {
				intentos = 3;
			}else {
				intentos++;
			}
		
		}while(intentos<3); 
		
	}
	
}
