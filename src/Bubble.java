public class Bubble {
    public int[] sort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arreglo[j - 1] > arreglo[j]) {
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return arreglo;
    }
}
