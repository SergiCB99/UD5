import javax.swing.JOptionPane;

public class Ex12App {

	public static void main(String[] args) {
		
		//Variable que contiene la contrase�a
		String contrase�a= "abcd";
		
		//Variable que guarda los intentos
		int intentos = 0;
		
		do {
			//Declaro y lleno la variable contrase�a_usuario
			String contrase�a_usuario = JOptionPane.showInputDialog("Introduce la contrase�a");
			
			//Compruebo la contrase�a introducida por el usuario
			if(contrase�a_usuario.equals(contrase�a)) {
				intentos = 3;
			}else {
				intentos++;
			}
		
		}while(intentos<3); 
		
	}
	
}
