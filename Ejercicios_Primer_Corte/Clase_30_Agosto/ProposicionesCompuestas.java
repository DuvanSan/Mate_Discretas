package Clase_30_Agosto;

import Teclado.Teclado;

public class ProposicionesCompuestas {
	
	public void ProposicionesCompuestasMenu (){
		Teclado t = new Teclado();
		Ejercicios e = new Ejercicios();
		int opcion = 0, aux;

		do {
			opcion = t.LeerEntero("\nIngrese el número del ejercicio: ");
			aux = opcion;
			switch(opcion) {
				case 0:
				break;
				case 1: 
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					e.ejercicio1();
				break;
				case 2: 
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					e.Ejercicio2();
				break;
				case 3: 
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					e.Ejercicio3();
				break;
				case 4:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					e.Ejercicio4();
				break;
				case 5: 
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio5(t.LeerEntero("Ingrese la edad de la persona: "), t.LeerTexto("Ingrese un correo electrónico: "), 
					t.LeerEntero("Ingrese el número de multas: ")) + "\n\n");
				break;
				case 6:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					e.Ejercicio6();
				break;
				default:
					System.out.println("Selección invalida");
				break;
			}
		} while (opcion != 0);
	}
}
