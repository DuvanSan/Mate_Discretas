package Clase_30_Agosto;

import Teclado.Teclado;

public class Ejercicios {
	Teclado t = new Teclado();
	String opcion = "TRUE";
	boolean p = false, q = false, r = false;

	public void ejercicio1 () {	
		p = opcion.equals(t.LeerTexto("El dragón es amigable; true : false: ").toUpperCase());
		q = opcion.equals(t.LeerTexto("Se puede hablar con el dragón; true : false: ").toUpperCase());
		r = opcion.equals(t.LeerTexto("El dragón revelo el camino; true : false: ").toUpperCase());
		if (p == true && q == true && r == true) {
			System.out.println("El jugador puede avanzar \n");
		} else if (p == false) {
			System.out.println("El dragón no es amigable \n");
		} else if (q == false) {
			System.out.println("No se puede hablar con el dragón \n");
		} else {
			System.out.println("El dragón no revelo el camino \n");
		}
		System.out.println();
	}

	public void Ejercicio2 () {
		p = opcion.equals(t.LeerTexto("Se contrato a un buen orador; true : false: ").toUpperCase());
		q = opcion.equals(t.LeerTexto("El evento es interesante; true : false: ").toUpperCase());
		r = opcion.equals(t.LeerTexto("Hay una alta asistencia; true : false: ").toUpperCase());
		if (p == true && q == true && r == true) {
			System.out.println("Se obtendrán patrocinadores \n");
		} else if (p == false) {
			System.out.println("No se contrato un buen orador \n");
		} else if (q == false) {
			System.out.println("El evento no es interesante \n");
		} else {
			System.out.println("No hay una alta asistencia \n");
		}
		System.out.println();
	}

	public void Ejercicio3 () {
		p = opcion.equals(t.LeerTexto("El usuario tiene acceso a los servidores internos; true : false: ").toUpperCase());
		q = opcion.equals(t.LeerTexto("El usuario tiene autenticación de dos factores; true : false: ").toUpperCase());
		r = opcion.equals(t.LeerTexto("El susuario tiene acceso a ciertos recursos confidenciales; true : false: ").toUpperCase());
		if (p == true && q == true && r == true) {
			System.out.println("Se registra su actividad \n");
		} else if (p == false) {
			System.out.println("El usuario no tiene acceso a los servidores internos \n");
		} else if (q == false) {
			System.out.println("El usuario no tiene autenticación de dos factores \n");
		} else {
			System.out.println("El susuario no tiene acceso a ciertos recursos confidenciales \n");
		}
		System.out.println();
	}

	public void Ejercicio4 () {
		p = opcion.equals(t.LeerTexto("El usuario posee credenciales de administrador; true : false: ").toUpperCase());
		q = opcion.equals(t.LeerTexto("Dirección IP permitida; true : false: ").toUpperCase());
		r = opcion.equals(t.LeerTexto("El susuario es empleado temporal o administrador; true : false: ").toUpperCase());
		if (p == true && r == true) {
			System.out.println("Acceso concedido \n");
		} else if (p == true && q == true) {
			System.out.println("Acceso concedido \n");
		} else {
			System.out.println("Acceso denegado \n");
		}
		System.out.println();
	}

	public String Ejercicio5 (int edad, String correo, int multas) {
		p = edad >= 18;
		q = correo.contains("@");
		r = multas == 0;
		if (p == true && q == true && r == true) {
			return "Registro exitoso";
		} else {
			return "Registro no aceptado";
		}
	}

	public void Ejercicio6 () {
		boolean s = false;
		p = opcion.equals(t.LeerTexto("El cliente tiene una cuenta activa; true : false: ").toUpperCase());
		q = opcion.equals(t.LeerTexto("El producto esta en stock; true : false: ").toUpperCase());
		r = opcion.equals(t.LeerTexto("El cliente tiene un método de pago válido registrado; true : false: ").toUpperCase());
		s = opcion.equals(t.LeerTexto("El cliente debe haber iniciado sesión; true : false: ").toUpperCase());
		if (p == true && q == true && r == true && s == true) {
			System.out.println("Compre realizada \n");
		} else {
			System.out.println("Compra denegada \n");
		}
		System.out.println();
	}

	//Enunciados
	public String Enunciados (int num) {
		String [] enunciados = new String [6];
		enunciados[0] = "Lógica en la programación de videojuegos \n\nEn un videojuego de aventuras, el jugador debe enfrentarse a un dragón y resolver un acertijo para avanzar. El acertijo consiste en tres proposiciones: \n\nP: Si el dragón es amigable, entonces es posible hablar con él. \nQ: Si se puede hablar con el dragón, entonces revelará el camino secreto. \nR: Si se revela el camino secreto, entonces el jugador podrá avanzar. \nElige valores de verdad para P, Q y R (verdadero o falso) que permitan al jugador avanzar o quedar atrapado. Explica la secuencia de razonamiento que lleva al jugador a avanzar o quedarse en su lugar basándose en las proposiciones compuestas.";
		enunciados[1] = "Planificación de eventos en una organización \n\nEn una organización, se está planificando un evento importante. Para que el evento sea un éxito, se han establecido las siguientes condiciones: \n\nP: Si se contrata a un buen orador, entonces el evento será interesante. \nQ: Si el evento es interesante, entonces habrá una alta asistencia.\nR: Si hay una alta asistencia, entonces se obtendrán patrocinadores. \nElige valores de verdad para P, Q y R que permitan que el evento sea un éxito o no. Explora diferentes combinaciones y razona sobre cómo estas condiciones se relacionan para determinar el éxito del evento.";
		enunciados[2] = "Diseño de seguridad en una red de computadoras \n\nEn una red de computadoras, se están implementando medidas de seguridad. Se han establecido las siguientes condiciones: \n\nP: Si un usuario tiene acceso a los servidores internos, entonces debe tener autenticación de dos factores. \nQ: Si un usuario tiene autenticación de dos factores, entonces tiene acceso a ciertos recursos confidenciales. \nR: Si un usuario tiene acceso a ciertos recursos confidenciales, entonces se registra su actividad. \nElige valores de verdad para P, Q y R que permitan un sistema seguro o no. Investiga cómo estas condiciones interactúan para garantizar la seguridad en la red de computadoras.";
		enunciados[3] = "Sistema de Control de Acceso \n\nDiseña un sistema de control de acceso que determine si un usuario puede acceder a un sistema en función de múltiples condiciones. Debes usar proposiciones compuestas y Java para implementar este sistema. Por ejemplo: \n\nUn usuario puede acceder si tiene credenciales de administrador (credencialesAdmin) Y si su dirección IP está en la lista de IP permitidas (ipPermitida). \nAdemás, si el usuario es un empleado temporal (esTemporal) o es un administrador, puede acceder sin importar su dirección IP.";
		enunciados[4] = "Razonamiento lógico en la programación \n\nSupongamos que estás desarrollando un programa de registro para una biblioteca. Para registrarse, un usuario debe cumplir con las siguientes condiciones: \n\nDebe ser mayor de 18 años (P). \nDebe tener una dirección de correo electrónico válida (Q). \nNo debe tener multas pendientes en su cuenta de la biblioteca (R). \nEscribe una proposición compuesta que represente las condiciones necesarias para que un usuario pueda registrarse en la biblioteca. Luego, usa esta proposición para determinar si un usuario con las siguientes características puede registrarse: \n\n Edad: 20 años \nDirección de correo electrónico: (usuario@example.com) \nMultas pendientes: 0";
		enunciados[5] = "Reglas de negocio en una aplicación de comercio electrónico \n\nSupongamos que estás desarrollando una aplicación de comercio electrónico y necesitas establecer reglas de negocio para determinar si un cliente puede realizar una compra. Las reglas son las siguientes: \n\nEl cliente debe tener una cuenta activa (P). \nEl producto debe estar en stock (Q). \nEl cliente debe tener un método de pago válido registrado (R). \nEl cliente debe haber iniciado sesión (S). \nEscribe una proposición compuesta que represente las condiciones necesarias para que un cliente pueda realizar una compra en la aplicación. Luego, determina si un cliente en particular puede realizar una compra con la siguiente información: \n\nTiene una cuenta activa. \nEl producto está en stock. \nTiene un método de pago válido registrado. \nNo ha iniciado sesión.";
		return enunciados[num];
	}
}
