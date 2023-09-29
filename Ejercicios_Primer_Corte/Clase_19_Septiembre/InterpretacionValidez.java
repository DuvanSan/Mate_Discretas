package Clase_19_Septiembre;

import Teclado.Teclado;

public class InterpretacionValidez {

    public void InterpretacionValidezMenu () {
        Ejercicios e = new Ejercicios();
        Teclado t = new Teclado();
        int opcion, aux; 
        do {
            opcion = t.LeerEntero("\nIngrese el número del ejercicio: ");
            aux = opcion;
            switch (opcion) {
                case 0: 
                break;
                case 1:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n");
                    e.Ejercicio1();
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
                    e.Ejercicio5();
                break; 
                case 6:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio6();
                break; 
                case 7:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio7();  
                break; 
                case 8:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio8();
                break;
                case 9:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio9();
                break;
                case 10:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio10();
                break;
                case 11:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio11();
                break;
                case 12:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio12();
                break;
                case 13: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio13();
                break;
                case 14:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio14();
                break;
                case 15:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio15();
                break; 
                case 16:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio16();
                break;
                case 17: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio17();
                break;
                case 18: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio18();
                break;  
                case 19: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio19();
                break;
                case 20:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio20();
                break;
                case 21:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio21();
                break;
                case 22:
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio22();
                break;
                case 23: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio23();
                break;
                case 24: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio24();
                break; 
                case 25: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio25();
                break; 
                case 26: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio26();
                break;
                case 27: 
                    System.out.println("\nEnunciado\n" + e.Enunciados(aux-1) + "\n"); 
                    e.Ejercicio27();
                break;
                default:
                    System.out.println("Selección invalida"); 
                break; 

            }
        } while (opcion != 0);
    }
}