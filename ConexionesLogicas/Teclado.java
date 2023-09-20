import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {
	
	public int LeerEntero (String x) {
		Scanner sc = new Scanner (System.in);
		int num;
		System.out.print(x);
		try{
			num = sc.nextInt();
			return num;
		} catch (InputMismatchException e) {
			System.out.println("Valor numérico invalido");
			return LeerEntero(x);
		}

	}

	public String LeerTexto (String x) {
		Scanner sc = new Scanner(System.in);
		String texto; 
		System.out.print(x);
		texto = sc.nextLine();
		return texto;
	}

	public String LeerCorreo (String x) {
		String correo = LeerTexto(x);
		if (correo.contains("@")) {
			return correo;
		} else {
			System.out.println("El correo proporcionado no cumple con los requesitos");
			return LeerCorreo(x);
		}

	}

}

