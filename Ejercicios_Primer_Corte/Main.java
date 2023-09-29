import Clase_29_Agosto.*;
import Clase_30_Agosto.*;
import Clase_19_Septiembre.*;
import Teclado.Teclado;

public class Main {
	
	public static void main (String [] args) {
		ConexionesLogicas cl = new ConexionesLogicas();
		ProposicionesCompuestas pc = new ProposicionesCompuestas();
		InterpretacionValidez iv = new InterpretacionValidez();
		int opcion;
		Teclado t = new Teclado();
		
		do{
			System.out.println("\n\nIngrese el número correspondiente para acceder a los ejercicios\n1. 29 de Agosto\n2. 30 de Agosto\n3. 19 de Septiembre" + 
		"\n0. Si desea finalizar el programa\n");
			opcion = t.LeerEntero("Ingrese el número: ");
			switch(opcion) {
				case 1:
					System.out.println("\n\nDIAPOSITIVA 29 DE AGOSTO \nLos ejercicios se encuentran enumerados de 1 al 12 como se encuentran en la diapositiva" + 
					"\n0. Volver al menú principal");
					cl.ConexionesMenu();
				break;
				case 2:
					System.out.println("\n\nDIAPOSITIVA 30 DE AGOSTO \nLos ejercicios se encuentran enumerados de 1 al 6 como se encuentran en la diapositiva" + 
					"\n0. Volver al menú principal");
					pc.ProposicionesCompuestasMenu();
				break;
				case 3:
					System.out.println("\n\nDIAPOSITIVA 19 DE SEPTIEMBRE \nLos ejercicios se encuentran enumerados de 1 al 27 como se encuentran en la diapositiva" + 
					"\n0. Volver al menú principal");
					iv.InterpretacionValidezMenu();
				break;
			}
		} while (opcion != 0);
		

}
}