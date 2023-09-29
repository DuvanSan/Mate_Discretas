package Clase_19_Septiembre;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicios {
    public void Ejercicio1 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        System.out.println("Unión: " + union + "\n\n");
    }

    public void Ejercicio2 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);
        System.out.println("Intersección: " + interseccion + "\n\n"); 
    }

    public void Ejercicio3 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("Diferencia (A - B): " + diferencia + "\n\n");
    }

    public void Ejercicio4 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoUniversal = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Set<Integer> complemento = new HashSet<>(conjuntoUniversal);
        complemento.removeAll(conjuntoA);
        System.out.println("Complemento de A: " + complemento + "\n\n"); 
    }

    public void Ejercicio5 () {
        Set<String> conjunto1 = new HashSet<>(Arrays.asList("a","b","c"));
        String elemento = "a";
        boolean perteneceA = conjunto1.contains(elemento);
        System.out.println("¿" + elemento + " pertenece a 1? " + perteneceA + "\n\n"); 
    }

    public void Ejercicio6 () {
        Set<String> conjunto2 = new HashSet<>(Arrays.asList("x","y","z"));
        String elemento2 = "w";
        boolean noPerteneceA = conjunto2.contains(elemento2);
        System.out.println("¿" + elemento2 + " no pertenece a 2? " + noPerteneceA + "\n\n"); 
    }

    public void Ejercicio7 () {
        Set<Integer> conjuntoC = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> conjuntoD = new HashSet<>(Arrays.asList(1, 2, 3));
        boolean esSubconjuntoOIgual = conjuntoD.containsAll(conjuntoC);
        System.out.println("C es subconjunto o igual a D: " + esSubconjuntoOIgual + "\n\n");      
    }

    public void Ejercicio8 () {
        Set<Integer> conjuntoC = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> conjuntoD = new HashSet<>(Arrays.asList(1, 2, 3));
        boolean esSubconjuntoPropio = conjuntoD.containsAll(conjuntoC) && !conjuntoD.equals(conjuntoC);
        System.out.println("C es subconjunto propio de D: " + esSubconjuntoPropio + "\n\n");
    }

    public void Ejercicio9 () {
        Set<Integer> conjuntoU = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Conjunto Universal: " + conjuntoU + "\n\n");
    }

    public void Ejercicio10 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("b","c","d"));
        
        Set<Integer> union = new HashSet<>(conjuntoA);
        union.addAll(conjuntoB);
        System.out.println("Unión A∪B: " + union );
        
        Set<String> union1 = new HashSet<>(conjuntoX);
        union1.addAll(conjuntoY);
        System.out.println("Unión X∪Y: " + union1 );
        
        String aux = ConjuntoAString(conjuntoA); //Conversión de entero a string
        Set<String> union2 = new HashSet<>(Arrays.asList(aux));
        union2.addAll(conjuntoX);
        System.out.println("Unión A∪X: " + union2 + "\n\n");

    }

    public void Ejercicio11 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("b","c","d"));
        
        Set<Integer> interseccion = new HashSet<>(conjuntoA);
        interseccion.retainAll(conjuntoB);
        System.out.println("Intersección A∩B: " + interseccion);
        
        conjuntoX.retainAll(conjuntoY);
        System.out.println("Intersección X∩Y: " + conjuntoX);

        Set<Integer> interseccion2 = new HashSet<>(conjuntoA);
        interseccion2.retainAll(conjuntoX);
        System.out.println("Intersección A∩X: " + interseccion2 + "\n\n");

    }

    public void Ejercicio12 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c", "d"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("b", "c"));
        
        Set<Integer> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("Diferencia A-B: " + diferencia );
        
        conjuntoX.removeAll(conjuntoY);
        System.out.println("Diferencia X-Y: " + conjuntoX);

        Set<Integer> diferencia2 = new HashSet<>(conjuntoA);
        diferencia2.removeAll(conjuntoX);
        System.out.println("Diferencia entre: " + diferencia2 + "\n\n");

    }

    public void Ejercicio13 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("b", "c"));
        Set<Integer> complemento = new HashSet<>(conjuntoA);
        complemento.removeAll(conjuntoB);
        System.out.println("Complemento de A': " + complemento);
        
        conjuntoX.removeAll(conjuntoY);
        System.out.println("Complemento de X': " + conjuntoX);
        
        Set<Integer> complemento2 = new HashSet<>(conjuntoA);
        complemento.removeAll(conjuntoX);
        System.out.println("Complemento de X': " + complemento2 + "\n\n"); 
    }

    public void Ejercicio14 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
        boolean perteneceA = conjuntoA.contains(3);
        System.out.println("¿El número 3 está en el conjunto A?: " + perteneceA);
        
        boolean perteneceX = conjuntoX.contains("d");
        System.out.println("¿La letra 'd' pertenece al conjunto X?: " + perteneceX);

         Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));
        perteneceA = conjuntoB.contains(4);
        perteneceX = conjuntoY.contains("b");
        boolean aux = perteneceA == perteneceX;
        System.out.println("¿El número 4 está en A y la letra 'b' está en X?: " + aux + "\n\n");
    }

    public void Ejercicio15 () {
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(6, 7, 8));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("x", "y", "z"));
        boolean perteneceB = conjuntoB.contains(5);
        System.out.println("¿El número 5 no está en el conjunto B?: " + !perteneceB);
        
        boolean perteneceY = conjuntoY.contains("a");
        System.out.println("¿La letra 'a' no pertenece al conjunto Y?: " + !perteneceY);

         Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b", "c"));
        perteneceB = conjuntoA.contains(5);
        perteneceY = conjuntoX.contains("x");
        boolean aux = perteneceB == perteneceY;
        System.out.println("¿El número 5 no está en A y la letra 'x' no pertenece a X?: " + aux + "\n\n");
    }

    public void Ejercicio16 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));

        boolean subconjuntoIgual = conjuntoB.containsAll(conjuntoA);
        System.out.println("¿Es A un subconjunto de B?: " + subconjuntoIgual);
        
        boolean subconjuntoIgual1 = conjuntoY.containsAll(conjuntoX);
        System.out.println("¿Es X un subconjunto de Y?: " + subconjuntoIgual1);

        conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
        conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
        boolean esSubconjuntoOIgual = conjuntoX.containsAll(conjuntoA);
        System.out.println("¿Es A un subconjunto de X?: " + esSubconjuntoOIgual + "\n\n");      
        
        
    } 
    
    public void Ejercicio17 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("a", "b"));
        Set<String> conjuntoY = new HashSet<>(Arrays.asList("a", "b", "c"));

        boolean subconjuntoPropio = conjuntoB.containsAll(conjuntoA) && !conjuntoB.equals(conjuntoA);
        System.out.println("¿Es A un subconjunto propio de B?: " + subconjuntoPropio);

        subconjuntoPropio = conjuntoY.containsAll(conjuntoX) && !conjuntoB.equals(conjuntoX);
    
        System.out.println("¿Es X un subconjunto propio de Y?: " + subconjuntoPropio);

        subconjuntoPropio = conjuntoY.containsAll(conjuntoA) && !conjuntoB.equals(conjuntoX);
        System.out.println("¿Es A un subconjunto propio de X?: " + subconjuntoPropio + "\n\n");
    }

    public void Ejercicio18 () {
        Set<Integer> conjuntoU = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(2, 4));
        Set<String> conjuntoV = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
        Set<String> conjuntoX = new HashSet<>(Arrays.asList("b", "c", "d"));

        boolean contener = conjuntoU.containsAll(conjuntoA);
        System.out.println("conjunto A se encuentra dentro del conjunto universal: " + contener);

        contener = conjuntoV.containsAll(conjuntoX);
        System.out.println("conjunto X se encuentra dentro del conjunto universal: " + contener);

        String conjunto, aux;
        aux = ConjuntoAString(conjuntoU); //Conversión de entero a string
        conjunto = ConjuntoAString(conjuntoA);
        Set<String> union = new HashSet<>(Arrays.asList(aux));
        Set<String> conjunto1 = new HashSet<>(Arrays.asList(conjunto));
        union.addAll(conjuntoV);

        boolean aux1 = union.containsAll(conjunto1);
        boolean aux2 = union.containsAll(conjuntoX);
        contener = aux1 == aux2;
        System.out.println("Conjunto A y conjunto X se encuentran dentro de la combinación de los conjuntos universales: " + contener + "\n\n");
    }

    public void Ejercicio19 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> conjuntoC = new HashSet<>(Arrays.asList(2, 4, 6));
        Set<Integer> conjuntoD = new HashSet<>(Arrays.asList(5, 6, 7));
        
        conjuntoA.addAll(conjuntoB);
        System.out.println("Unión entre A y B: " + conjuntoA);

        conjuntoC.addAll(conjuntoD);
        System.out.println("Unión entre C y D: " + conjuntoC);

        conjuntoA.retainAll(conjuntoC);
        System.out.println("Intersección entre A∪B y C∪D: " + conjuntoA + "\n\n");
    }

    public void Ejercicio20 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));
        Set<Integer> diferencia = new HashSet<>(conjuntoA);
        diferencia.removeAll(conjuntoB);
        System.out.println("Diferencia simétrica A - B: " + diferencia + "\n\n");
    }

    public void Ejercicio21 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        
        Set<Integer> complemento = new HashSet<>(conjuntoA);
        complemento.removeAll(conjuntoB);;
        System.out.println("Complemento de A: " + complemento); 
        
        Set<Integer> complemento1 = new HashSet<>(conjuntoB);
        complemento1.removeAll(conjuntoA);
        System.out.println("Complemento de B: " + complemento1);
        
        complemento.retainAll(complemento1);
        System.out.println("Intersección entre A' y B': " + complemento);

        conjuntoA.addAll(conjuntoB);
        conjuntoA.removeAll(complemento);
        System.out.println("Complemento de la intersección entre A' y B' respecto a la unión de A con B: " + conjuntoA);
    }

    public void Ejercicio22 () {
        System.out.println("subconjuntos posibles de A: \n{} \n{1} \n{2} \n{3} \n{1, 2} \n{1, 3} \n{2, 3} \n{1, 2, 3} \n\n");
    }

    public void Ejercicio23 () {
        Set<Integer> conjuntoU = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(2, 3, 4, 5, 7, 8, 9));
        
        Set<Integer> conjuntoAC = new HashSet<>(conjuntoU);
        conjuntoAC.removeAll(conjuntoA);
        System.out.println("Complemento de A: " + conjuntoAC);

        Set<Integer> conjuntoACC = new HashSet<>(conjuntoU);
        conjuntoAC.removeAll(conjuntoAC);
        System.out.println("Complemento del complemento de A: " + conjuntoACC + "\n\n");
    }

    public void Ejercicio24 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        
        Set<Integer> complemento = new HashSet<>(conjuntoA);
        complemento.removeAll(conjuntoB);;
        System.out.println("Complemento de A: " + complemento); 
        
        Set<Integer> complemento1 = new HashSet<>(conjuntoB);
        complemento1.removeAll(conjuntoA);
        System.out.println("Complemento de B: " + complemento1);
        
        complemento.retainAll(complemento1);
        System.out.println("Intersección entre A' y B': " + complemento + "\n\n");
    }

    public void Ejercicio25 () {
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(3, 4, 5));
        
        conjuntoB.add(5);
        conjuntoB.add(6);
        System.out.println("Unión de 5 y 6 a B: " + conjuntoB);

        conjuntoA.retainAll(conjuntoB);
        System.out.println("Intersección entre A y B: " + conjuntoA + "\n\n");

    }

    public void Ejercicio26 () {
        Set<Integer> conjuntoU = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(2, 3, 4, 5, 7, 8, 9));
        
        Set<Integer> complementoA = new HashSet<>(conjuntoU);
        complementoA.remove(conjuntoA);
        System.out.println("Complemento de A: " + complementoA);

        conjuntoA.removeAll(complementoA);
        System.out.println("Diferencia entre A - A': " + complementoA + "\n\n");
    }

    public void Ejercicio27 () {
        Set<String> conjuntoU = new HashSet<>(Arrays.asList("a", "b", "c", "d", "e"));
        conjuntoU.removeAll(conjuntoU);
        System.out.println("complemento del conjuntoU: " + conjuntoU + "\n\n");
    }

    //Conversión int a String
        private String ConjuntoAString(Set<Integer> conjunto) {
        String resultado = conjunto.stream()
            .map(Object::toString) 
            .collect(Collectors.joining(", ")); 
        return resultado;
    }

    //Enunciados
    //Para poder concidir los enunciados con sus respectivos ejercicios, se debe sumarle 1 a todas las posiciones 
    public String Enunciados (int num) {
        String [] enunciados = new String[30];
        enunciados[0] = "Unión (∪): \nEjemplo: Sea A = {1, 2, 3} y B = {3, 4, 5}. La unión de A y B es A ∪ B = {1, 2, 3, 4, 5}.";
        enunciados[1] = "Intersección (∩): \nEjemplo: Con los mismos conjuntos A y B del ejemplo anterior, la intersección de A y B es A ∩ B = {3}.";
        enunciados[2] = "Diferencia (- o ): \nEjemplo: Usando los conjuntos A y B, A - B (o A \\ B) es el conjunto {1, 2} ya que contiene los elementos que están en A pero no en B.";
        enunciados[3] = "Complemento ('): \nEjemplo: Si tenemos un conjunto universal U = {1, 2, 3, 4, 5} y un conjunto A = {3, 4}, entonces el complemento de A (A') es el conjunto de elementos en U que no están en A, es decir, A' = {1, 2, 5}.";
        enunciados[4] = "Pertenencia (∈): \nEjemplo: Si tenemos el conjunto A = {a, b, c}, podemos decir que \"a ∈ A\" porque el elemento \"a\" pertenece al conjunto A.";
        enunciados[5] = "No pertenencia (∉): \nEjemplo: Si tenemos el conjunto B = {x, y, z}, podemos decir que \"w ∉ B\" porque el elemento \"w\" no pertenece al conjunto B."; 
        enunciados[6] = "Subconjunto (⊆): \nEjemplo: Si tenemos el conjunto C = {1, 2} y el conjunto D = {1, 2, 3}, entonces podemos decir que \"C ⊆ D\" porque C es un subconjunto de D.";
        enunciados[7] = "Subconjunto propio (⊂): \nEjemplo: Con los mismos conjuntos C y D, podemos decir que \"C ⊂ D\" porque C es un subconjunto propio de D, lo que significa que todos los elementos de C están en D, pero D tiene al menos un elemento adicional que C no tiene.";
        enunciados[8] = "Conjunto universal (𝑈 o 𝑉): \nEjemplo: En el contexto de números naturales, el conjunto universal U podría ser el conjunto de todos los números naturales, es decir, U = {1, 2, 3, 4, 5, ...}.";
        enunciados[9] = "Unión (∪): \n\nConjuntos numéricos: A = {1, 2, 3}, B = {3, 4, 5}. Encuentra A ∪ B. \nConjuntos alfabéticos: X = {'a', 'b', 'c'}, Y = {'b', 'c', 'd'}. Determina X ∪ Y. \nCombinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Calcula A ∪ X.";
        enunciados[10] = "Intersección (∩): \n\nConjuntos numéricos: A = {1, 2, 3, 4}, B = {3, 4, 5}. Encuentra A ∩ B. \nConjuntos alfabéticos: X = {'a', 'b', 'c'}, Y = {'b', 'c', 'd'}. Determina X ∩ Y. \nCombinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Calcula A ∩ X.";
        enunciados[11] = "Diferencia (- o ): \n\nConjuntos numéricos: A = {1, 2, 3, 4}, B = {3, 4, 5}. Encuentra A - B. \nConjuntos alfabéticos: X = {'a', 'b', 'c', 'd'}, Y = {'b', 'c'}. Calcula X \\ Y.\nCombinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. Determina A - X.";
        enunciados[12] = "Complemento (') - Utilizando un conjunto universal U:\n\nConjuntos numéricos: U = {1, 2, 3, 4, 5}, A = {3, 4}. Encuentra A'.\nConjuntos alfabéticos: U = {'a', 'b', 'c', 'd', 'e'}, X = {'b', 'c'}.\nDetermina X'.Combinado: U = {1, 2, 3, 4, 5}, X = {'a', 'b', 'c'}. Calcula X'.";
        enunciados[13] = "Pertenencia (∈) - Verificar si un elemento pertenece a un conjunto:\n\nConjuntos numéricos: A = {1, 2, 3, 4, 5}. ¿El número 3 está en el conjunto A?\nConjuntos alfabéticos: X = {'a', 'b', 'c', 'd'}. ¿La letra 'd' pertenece al conjunto X?\nCombinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 4 está en A y la letra 'b' está en X?";
        enunciados[14] = "No pertenencia (∉) - Verificar si un elemento no pertenece a un conjunto:\n\nConjuntos numéricos: B = {6, 7, 8}. ¿El número 5 no está en el conjunto B?\nConjuntos alfabéticos: Y = {'x', 'y', 'z'}. ¿La letra 'a' no pertenece al conjunto Y?\nCombinado: A = {1, 2, 3}, X = {'a', 'b', 'c'}. ¿El número 5 no está en A y la letra 'x' no pertenece a X?";
        enunciados[15] = "Subconjunto (⊆):\n\nConjuntos numéricos: A = {1, 2}, B = {1, 2, 3, 4}. ¿Es A un subconjunto de B?\nConjuntos alfabéticos: X = {'a', 'b'}, Y = {'a', 'b', 'c'}. ¿Es X un subconjunto de Y?\nCombinado: A = {1, 2, 3}, X = {'a', 'b'}. ¿Es A un subconjunto de X?"; 
        enunciados[16] = "Subconjunto propio (⊂):\n\nConjuntos numéricos: A = {1, 2}, B = {1, 2, 3, 4}. ¿Es A un subconjunto propio de B?\nConjuntos alfabéticos: X = {'a', 'b'}, Y = {'a', 'b', 'c'}. ¿Es X un subconjunto propio de Y?\nCombinado: A = {1, 2, 3}, X = {'a', 'b'}. ¿Es A un subconjunto propio de X?";
        enunciados[17] = "Conjunto universal (𝑈 o 𝑉):\n\nConjuntos numéricos: Utilizando el conjunto universal U = {1, 2, 3, 4, 5}, encuentra el conjunto A = {2, 4}.\nConjuntos alfabéticos: Utilizando el conjunto universal V = {'a', 'b', 'c', 'd', 'e'}, encuentra el conjunto X = {'b', 'c', 'd'}.\nCombinado: Utilizando el conjunto universal U = {1, 2, 3, 4, 5} y el conjunto V = {'a', 'b', 'c', 'd', 'e'}, encuentra los conjuntos A = {1, 2, 3} y X = {'a', 'b', 'c'}."; 
        enunciados[18] = "Dados los conjuntos A = {1, 2, 3, 4}, B = {3, 4, 5}, C = {2, 4, 6}, y D = {5, 6, 7}, encuentra el resultado de la siguiente expresión: (A ∪ B) ∩ (C ∪ D)";
        enunciados[19] = "Dados los conjuntos A = {1, 2, 3, 4, 5} y B = {4, 5, 6, 7, 8}, encuentra la diferencia simétrica entre A y B. A △ B";
        enunciados[20] = "Usando los conjuntos A = {1, 2, 3, 4} y B = {3, 4, 5, 6}, encuentra el complemento de la unión de los complementos de A y B. (A' ∩ B')'";
        enunciados[21] = "Dado el conjunto A = {1, 2, 3}, encuentra el conjunto potencia de A (todos los subconjuntos posibles de A)";
        enunciados[22] = "Si A es un subconjunto de un conjunto universal U, encuentra el complemento del complemento de A. (A')’";
        enunciados[23] = "Dados los conjuntos A = {1, 2, 3, 4} y B = {3, 4, 5, 6}, encuentra el complemento de la unión de A y B. (A ∪ B)'";
        enunciados[24] = "Dados los conjuntos A = {1, 2, 3} y B = {2, 3, 4}, encuentra el resultado de la siguiente expresión: A ∩ (B ∪ {5, 6})";
        enunciados[25] = "Si A es un subconjunto de un conjunto universal U, encuentra la diferencia entre A y el complemento de A. A – A’";
        enunciados[26] = "Si el conjunto universal es U = {a, b, c, d, e}, encuentra el complemento de U. U'";
        return enunciados [num];
    }
}