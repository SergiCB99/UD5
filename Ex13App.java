import javax.swing.JOptionPane;

public class Ex13App {

	public static void main(String[] args) {
		
		//Declaro y lleno las variables
		String num1_usuario = JOptionPane.showInputDialog("Introduce el primer numero");
		
		String num2_usuario = JOptionPane.showInputDialog("Introduce el segundo numero");
		
		String signo = JOptionPane.showInputDialog("Introduce el signo");
		
		//Convierto los numeros a double
		double num1 = Double.parseDouble(num1_usuario);
		double num2 = Double.parseDouble(num2_usuario);
		
		//Switch que dependiendo del signo introducido hace una operacion o otra
		switch(signo) {
		case "+":
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		break;
		case "-":
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		break;
		case "*":
			System.out.println(num1+"*"+num2+"="+(num1*num2));
		break;
		case "/":
			System.out.println(num1+"/"+num2+"="+(num1/num2));
		break;
		case "^":
			System.out.println(num1+"^"+num2+"="+Math.pow(num1,num2));
		break;
		case "%":
			System.out.println(num1+"%"+num2+"="+(num1%num2));
		break;
		//Por si introduce algo que no cumpla con nada de lo anterior
		default:
			System.out.println("Introduce un valor valido");
	}
		
	}
	
}
