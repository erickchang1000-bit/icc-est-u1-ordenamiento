public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 3, 4, 1, 2};
        System.out.println("Arreglo Original");
        printArreglo(numeros);

        Bubble buuble = new Bubble();
        int[] ordenado = buuble.sort(numeros);

        System.out.println("Arreglo Ordenado");
        printArreglo(ordenado);
    }

    public static void printArreglo(int[] arr){
        for(int i = 0; i<arr.length  ; i++){
            System.out.print(arr[i] + " - ");
            System.out.println();
        }

    }
}