import java.util.Scanner;

import Controller.PersonaController;
import Model.Persona;
import View.PersonaView;

public class MVCDemo {
	
	public static void main(String[] args) {
		
		Persona model = retrievePersona();
		
		PersonaView view = new PersonaView();
		
		PersonaController controller = new PersonaController(model, view);
		
		System.out.println("Bienvenido a mi ejemplo de la implementacion de MVC en java, es un ejemplo muy simple"
				+ " en el cual \nse imprime la informacion de una persona ya creada y usted tiene la posibilidad de cambiar "
				+ "\nlos atributos de esa persona según la opción que escoja. Acontinuacion se imprimira la informacion de la persona"
				+ " por default:");
		
		controller.updateView();
		
		boolean termino = false;
		
		while(!termino) {
			Scanner in = new Scanner(System.in);
			int opcion;
			System.out.println("--------------------------------------------------------------");
			System.out.println("Oprima 1 para cambiar el nombre"
					+ "\nOprima 2 para cambiar el apellido"
					+"\nOprima 3 para cambiar la cedula \n"
					+"Oprima 4 para cambiar toda la informacion de la persona \n"
					+"Oprima 0 para terminar el programa");
			System.out.println("--------------------------------------------------------------");
			opcion = Integer.parseInt(in.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre porfavor: ");
				String nombre = in.nextLine();
				controller.setPersonaNombre(nombre);
				System.out.println("*************************************************************");
				controller.updateView();
				System.out.println("*************************************************************");	
				break;
			case 2:
				System.out.println("Introduzca el apellido porfavor: ");
				String apellido = in.nextLine();
				controller.setPersonaApellido(apellido);
				System.out.println("*************************************************************");
				controller.updateView();
				System.out.println("*************************************************************");
				break;
			case 3:
				System.out.println("Introduzca la cedula porfavor: ");
				int cedula = Integer.parseInt(in.nextLine());
				controller.setPersonaCedula(cedula);
				System.out.println("*************************************************************");
				controller.updateView();
				System.out.println("*************************************************************");
				break;
			case 4:
				System.out.println("Introduzca el nombre porfavor: ");
				String nombre2 = in.nextLine();
				System.out.println("Introduzca el apellido porfavor: ");
				String apellido2 = in.nextLine();
				System.out.println("Introduzca la cedula porfavor: ");
				int cedula2 = Integer.parseInt(in.nextLine());
				controller.setPersonaNombre(nombre2);
				controller.setPersonaApellido(apellido2);
				controller.setPersonaCedula(cedula2);
				System.out.println("*************************************************************");
				controller.updateView();
				System.out.println("*************************************************************");
				break;
			case 0:
				System.out.println("El programa ha TERMINADO");
				termino = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		
		}
		
	}
	
	public static Persona retrievePersona() {
		String nombre = "Andres";
		String apellido = "Rojas";
		int cedula = 1065654255;
		Persona persona = new Persona(nombre, apellido, cedula);
		return persona;
	}

}
