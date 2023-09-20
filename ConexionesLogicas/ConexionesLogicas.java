public class ConexionesLogicas {

	public static void main (String[] args){
		Teclado t = new Teclado();
		Ejercicios e = new Ejercicios();
		
		//Variables 
		boolean condicion = true; 
		int opcion = 0, aux; 

		System.out.println("\nLos ejercicios se encuentran enumerados de 1 hasta 12" + 
		"\nSi desea finalizar el programa ingrese el número 0");
		do {
			opcion = t.LeerEntero("\nIngrese el número del ejercicio: ");
			aux = opcion;
			switch(opcion) {
				case 0:
				condicion = false; 
				break; 
				case 1: 
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio1(t.LeerEntero("Ingrese un número: ")) + "\n");
				break;
				case 2:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio2(t.LeerTexto("Ingrese el usuario: "), t.LeerTexto("Ingrese la contraseña: ")) + "\n");
				break;
				case 3:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio3(t.LeerEntero("Ingrese un número: ")) + "\n");
				break;
				case 4:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio4(t.LeerTexto("Es administrador; si, no: "), 
					t.LeerEntero("Ingrese el número de puntos que posee: ")) + "\n");
				break;
				case 5:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio5(t.LeerEntero("Ingrese un número: ")) + "\n");
				break; 
				case 6:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio6(t.LeerEntero("Ingrese la calificación: ")) + "\n");
				break;
				case 7:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio7(t.LeerEntero("Ingresos mensuales: "), t.LeerTexto("Posee deudas; si, no: ")) + "\n");
				break;
				case 8:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio8(t.LeerTexto("El jugador posee la llave; si, no: ")) + "\n");
				break;
				case 9:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio9(t.LeerEntero("Ingrese un número: ")) + "\n");
				break;
				case 10:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println(e.Ejercicio10(t.LeerTexto("Ingrese el usuario: "), t.LeerCorreo("Ingrese el correo: ")) + "\n");
				break;
				case 11:
					 System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					 System.out.println("Direción IP: 1234567890");
					 System.out.println(e.Ejercicio11(t.LeerTexto("Tiene credencial de administrador: "), t.LeerEntero("Ingrese la IP: ")) + "\n");
				break; 
				case 12:
					System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
					System.out.println(e.Ejercicio12(t.LeerTexto("Ingrese el mensaje a cifrar: "), t.LeerEntero("Ingrese la clave de cifrado: ")));
				break;
				default:
					System.out.println("Selección invalida");
				break;
			}

		} while(condicion);
		//Mientras escribia este código solo dios y yo sabiamos que hace, ahora solo dios lo sabe :)
	}
}
