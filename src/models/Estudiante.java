package models;

import java.util.Comparator;

public class Estudiante implements Comparable<Estudiante>{
    private String name;
    private double nota;

    // Constructor lleno
    public Estudiante(String nombre, double nota){
        this.name = nombre;
        this.nota = nota;
    }

    // Constructor vacio
    public Estudiante(){
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name= nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante [" + name + " , " + nota + "]";
    }
    /**    (non-Javadoc)
     * 1. Nota Ascendente
     * 2. Nombre Ascendente en el caso de que las notas sean iguales
     * @param o objeto tipo estudiantecon el cual voy a comparar
     * @return Indice de Comparacion (+ , -,0)
     */
    /*@Override
    public int compareTo(Estudiante e2) {
        int compN = Double.compare(this.getNota(), e2.getNota());
        if(compN !=0){
        return compN;
        }
    
    return this.getName().compareTo(e2.getName);
    */
   @Override 
   public int compareTo (Estudiante e2){
    return Comparator.comparingDouble(Estudiante:: getNota).thenComparing(Estudiante::getName).compare(this, e2);
   }
}

