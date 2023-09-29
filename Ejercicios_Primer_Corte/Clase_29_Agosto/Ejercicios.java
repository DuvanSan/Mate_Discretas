package Clase_29_Agosto;

import Teclado.Teclado;

public class Ejercicios {
	
	public String Ejercicio1 (int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "Es divisible por 3 y 5"; 
		} else {
			return "No es divisible por 3 y 5";
		}
	}

	public String Ejercicio2 (String nombre, String contraseña) {
		String name = "usuario123";
		String password = "contraseña456";
		if (nombre.equals(name) && contraseña.equals(password)){
			return "Acceso concedido";
		} else {
			return "Acceso denegado"; 
		}
	}

	public String Ejercicio3 (int num) {
		if (num % 2 == 0 || num % 3 == 0) {
			return "Es par o múltiplo de 3";
		} else {
			return "No es par ni múltiplo de 3";
		}
	}

	public String Ejercicio4 (String admin, int puntos) {
		if (admin.toUpperCase().equals("SI") || puntos >= 1000){
			return "Acceso concedido";
		} else {
			return "Acceso denegado";
		}
	}

	public String Ejercicio5 (int num) {
		if (num >= 0) {
			return "Número válido";
		} else {
			return "Número inválido";
		}
	}

	public String Ejercicio6 (int num) {
		if (num < 60) {
			return "Estudiante no aprobado";
		} else {
			return "Estudiante aprobado";
		}
	}

	public String Ejercicio7 (int ingresos, String deudas) {
		if (ingresos > 2000 && deudas.toUpperCase().equals("NO")) {
			return "Puede solicitar una tarjeta de crédito";
		} else {
			return "No puede solicitar una tarjeta de crédito";
		}
	}

	public String Ejercicio8 (String llave) {
		if (llave.toUpperCase().equals("SI")) {
			return "Puede abrir la puerta";
		} else {
			return "No puede abrir la puerta";
		}
	}

	public String Ejercicio9 (int num) {
		if (num % 2 == 0) {
			return "Es par";
		} else {
			return "No es par";
		}
	}

	public String Ejercicio10 (String usuario, String correo) {
		Teclado t = new Teclado();
		int codigo = Aleatorios(), verificación;
		String aux;
		System.out.print("Se a enviado el código de verifiación a: " + correo +"\nSu código de verificación es: " + codigo 
		+ "\n\nPor favor rellenar los siguiente campos\n"); 
		aux = t.LeerTexto("Ingrese nuevamente el usuario: ");
		verificación = t.LeerEntero("Ingrese el código de verificación: ");
		if (aux.equals(usuario) && verificación == codigo) {
			return "Acceso concedido";
		} else {
			return "Acceso denegado";
		}

	}

	public String Ejercicio11 (String admin, int ip) {
		int direccion = 1234567890;
		boolean a = admin.toUpperCase().equals("SI");
		boolean b = ip == direccion;
		if (a != b) {
			return "Acceso concedido";
		} else {
			return "Acceso denegado";
		}

	}

	public String Ejercicio12 (String mensaje , int clave) {
	 	StringBuilder mensajeCifrado = new StringBuilder();
        	for (int i = 0; i < mensaje.length(); i++) {
            		char caracter = mensaje.charAt(i);
            		char caracterCifrado = (char) (caracter ^ clave);
            		mensajeCifrado.append(caracterCifrado);
        	}
        return mensajeCifrado.toString();
    }

	//Generación de números aleatorios 
	private int Aleatorios () {
		int num;
		num = (int) (Math.random()*7999) + 1000;
		return num;
	}
	
	//Enunciados 
	public String Enunciados (int x) {
		String [] enunciados = new String [12];
		enunciados [0] = "Escribe un programa que determine si un número entero es divisible por 3 y 5 al mismo tiempo. El usuario debe ingresar un número y el programa debe imprimir (Es divisible por 3 y 5) si la condición se cumple, de lo contrario, imprimir (No es divisible por 3 y 5)."; 
		
		enunciados [1] = "Supongamos que estás implementando un sistema de autenticación. El usuario debe proporcionar un nombre de usuario y una contraseña. Escribe un programa que valide si el nombre de usuario es (usuario123) y la contraseña es (contraseña456). El programa debe imprimir (Acceso concedido) si ambas condiciones son verdaderas, de lo contrario, imprimir (Acceso denegado).";
		
		enunciados [2] = "Diseña un programa que determine si un número entero es par o múltiplo de 3. El usuario ingresa un número y el programa debe imprimir (Es par o múltiplo de 3) si alguna de las dos condiciones se cumple, de lo contrario, imprimir (No es par ni múltiplo de 3).";
		
		enunciados [3] = "Supongamos que estás construyendo un sistema de permisos en una aplicación. Un usuario tiene permisos para acceder si es un administrador o tiene más de 1000 puntos de experiencia. Escribe un programa que determine si un usuario tiene acceso basándose en estas condiciones. El programa debe imprimir (Acceso concedido) si alguna de las dos condiciones es verdadera, de lo contrario, imprimir (Acceso denegado).";
		
		enunciados [4] = "Diseña un programa que valide si un número entero ingresado por el usuario no es negativo. Si el número es no negativo, el programa debe imprimir (Número válido), de lo contrario, imprimir (Número inválido).";
		
		enunciados [5] = "Supongamos que tienes una lista de estudiantes y quieres identificar a aquellos que no han aprobado un examen (calificación menor a 60). Escribe un programa que, dado un puntaje, determine si un estudiante no ha aprobado el examen. El programa debe imprimir (Estudiante no aprobado) si la calificación es menor a 60, de lo contrario, imprimir (Estudiante aprobado).";
		
		enunciados [6] = "Diseña un programa que determine si una persona puede solicitar una tarjeta de crédito. Para ello, debe cumplir con dos condiciones: tener ingresos mensuales superiores a $2000 y no tener deudas pendientes. Si ambas condiciones se cumplen, el programa debe imprimir (Puede solicitar una tarjeta de crédito), de lo contrario, imprimir (No puede solicitar una tarjeta de crédito).";
		
		enunciados [7] = "Supongamos que estás creando un juego en el que un jugador debe obtener una llave antes de abrir una puerta. Escribe un programa que determine si un jugador puede abrir la puerta. Si el jugador tiene la llave, el programa debe imprimir (Puede abrir la puerta), de lo contrario, imprimir (No puede abrir la puerta).";
		
		enunciados [8] = "Diseña un programa que determine si un número entero es par si y solo si es divisible por 2. El usuario ingresa un número y el programa debe imprimir (Es par) si el número es divisible por 2, o (No es par) si no lo es.";
		
		enunciados [9] = "Supongamos que estás desarrollando un sistema de autenticación de dos factores. Un usuario puede acceder si y solo si proporciona un nombre de usuario correcto y un código de verificación enviado a su correo electrónico. Escribe un programa que valide si un usuario tiene acceso basándose en estas condiciones. El programa debe imprimir (Acceso concedido) si ambas condiciones son verdaderas, o (Acceso denegado) en cualquier otro caso.";
		
		enunciados [10] = "Supongamos que estás diseñando un sistema de seguridad para una red de computadoras. Los usuarios deben tener acceso si y solo si cumplen con una de estas dos condiciones: tienen credenciales de administrador XOR tienen una dirección IP permitida. Escribe un programa que tome como entrada si un usuario tiene credenciales de administrador (credencialesAdministrador) y si su dirección IP está en la lista de direcciones permitidas (ipPermitida). El programa debe imprimir (Acceso concedido) si alguna de las dos condiciones es verdadera, pero no ambas al mismo tiempo.";
		
		enunciados [11] = "Diseña un programa que realice un cifrado XOR simple en un mensaje. El usuario debe ingresar un mensaje en forma de cadena de caracteres (mensaje) y una clave de cifrado en forma de número entero (clave). El programa debe aplicar el cifrado XOR entre cada carácter del mensaje y el valor numérico de la clave, alternando entre los caracteres del mensaje y los dígitos de la clave. Luego, debe imprimir el mensaje cifrado resultante."; 
	
		return enunciados[x];
	}
}
