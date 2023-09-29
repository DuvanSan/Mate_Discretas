package Clase_29_Agosto;

import Teclado.Teclado;

public class ConexionesLogicas {

	public void  ConexionesMenu (){
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
					System.out.println(e.Ejercicio1(t.LeerEntero("Ingrese un número: ")) + "\n\n");
				break;
				case 2:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio2(t.LeerTexto("Ingrese el usuario: "), t.LeerTexto("Ingrese la contraseña: ")) + "\n\n");
				break;
				case 3:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio3(t.LeerEntero("Ingrese un número: ")) + "\n\n");
				break;
				case 4:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio4(t.LeerTexto("Es administrador; si, no: "), 
					t.LeerEntero("Ingrese el número de puntos que posee: ")) + "\n\n");
				break;
				case 5:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio5(t.LeerEntero("Ingrese un número: ")) + "\n\n");
				break; 
				case 6:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio6(t.LeerEntero("Ingrese la calificación: ")) + "\n\n");
				break;
				case 7:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio7(t.LeerEntero("Ingresos mensuales: "), t.LeerTexto("Posee deudas; si, no: ")) + "\n\n");
				break;
				case 8:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio8(t.LeerTexto("El jugador posee la llave; si, no: ")) + "\n\n");
				break;
				case 9:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio9(t.LeerEntero("Ingrese un número: ")) + "\n\n");
				break;
				case 10:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio10(t.LeerTexto("Ingrese el usuario: "), t.LeerCorreo("Ingrese el correo: ")) + "\n\n");
				break;
				case 11:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println("Direción IP: 1234567890");
					 System.out.println(e.Ejercicio11(t.LeerTexto("Tiene credencial de administrador: "), t.LeerEntero("Ingrese la IP: ")) + "\n\n");
				break; 
				case 12:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio12(t.LeerTexto("Ingrese el mensaje a cifrar: "), t.LeerEntero("Ingrese la clave de cifrado: ")) + "\n\n");
				break;
				default:
					System.out.println("Selección invalida");
				break;
			}

		} while (opcion != 0);
	}
}
