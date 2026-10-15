public class Bubble {
    public int[] sort (int[] arreglo){
        for (int i = 0; i < arreglo.length; i++){
            for (int j = i+1; j < arreglo.length ; j++){
                if (arreglo[j] > arreglo[j + 1]){
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }
}
