import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.Estudiante;

public class App {
    public static void main(String[] args) {
        //runEjemplosObjetos();
        //runComparators();
        runComparatorsObj();
        
    }

    private static void runComparators() {
        Integer[] original = {5, 6, 4, 1, 2, 3};
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
        }
        System.out.println("---------");
        Arrays.sort(original, Comparator.reverseOrder());
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i]);
        }
    }

    private static void runEjemplosObjetos() {

        Estudiante e1 = new Estudiante("Juan", 19);

        Estudiante[] estudiantes = {e1,
            new Estudiante("Maria", 7),
            new Estudiante("Diego", 3.5),
            new Estudiante("Pedro", 8.6),

        };
        Bubble b = new Bubble();
        b.sortEstudiantes(estudiantes);
        printArregloEstudiantes(estudiantes);
    }

    private static void printArregloEstudiantes(Estudiante[] estudiantes) {

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println(estudiantes[i]);
        }
    }

    public static void runEjemplosPrimitivos() {
        int[] original = {5, 6, 4, 1, 2, 3};
        int[] b = original.clone();
        int[] c = original.clone();
        int[] d = original.clone();

        Bubble bubble = new Bubble();

        printArreglo(b);
        bubble.bubbleSort(b);
        printArreglo(b);
        
        System.out.println("\n");
        System.out.println("---Selection---");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        System.out.println("\n");
        System.out.println("---Insertion---");
        //Insertion insertion = new Insertion();
        printArreglo(d);
        //insertion.sort(d);
        printArreglo(d);
    }

    public static void printArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
    private static void runComparatorsObj() {
        List <Integer> numeros = new ArrayList<>(List.of(5,6,4,1,2,3));
        // Orden de menor a mayor 
        numeros.sort(Comparator.naturalOrder());
        numeros.sort(null);
        System.out.println(numeros);
        // Ordenar de mayor a menor 
        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

        
    }
}