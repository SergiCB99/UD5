import javax.swing.JOptionPane;

public class Ex11App {

	public static void main(String[] args) {
		
		//Declaro y lleno la variable dia
		String dia = JOptionPane.showInputDialog("Introduce el dia");
		
		//Switch para mostrar si es laborable o no dependiendo de lo introducido por el usuario
		switch(dia) {
			case "Lunes":
				System.out.println("Laborable");
			break;
			case "Martes":
				System.out.println("Laborable");
			break;
			case "Miercoles":
				System.out.println("Laborable");
			break;
			case "Jueves":
				System.out.println("Laborable");
			break;
			case "Viernes":
				System.out.println("Laborable");
			break;
			case "Sabado":
				System.out.println("No laborable");
			break;
			case "Domingo":
				System.out.println("No laborable");
			break;
			//Por si introduce algo que no cumpla con nada de lo anterior
			default:
				System.out.println("Introduce un valor valido");
		}
		
	}
	
}
