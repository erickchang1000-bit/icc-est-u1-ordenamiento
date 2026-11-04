import models.Estudiante;

public class Bubble {

    public int[] sort(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 1; j < arreglo.length; j++) {
                if (arreglo[j - 1] > arreglo[j]) {
                    //INTERCAMBIO
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        return null;
    }

    public void sortEstudiantesNOTA(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - 1 - i; j++) {
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
    }
}