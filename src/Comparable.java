import java.util.ArrayList;
import java.util.List;

import models.Estudiante;

public class Comparable {
    private List<Estudiante> estList;
    private Estudiante[] estArray;

    public Comparable(){
        Estudiante e1 = new Estudiante("Juan", 10);

        estArray = new Estudiante[] {e1,
                new Estudiante("Maria", 7),
                new Estudiante("Diego", 3.5),
                new Estudiante("Pedro", 7),
                new Estudiante("Pedro", 6.8),
        };
        estList = new ArrayList<>(List.of(estArray));

        ejemplo2();
        ejemplo3();
}
    //Orden natural pero descendente 
    private void ejemplo3() {
        System.out.println("Ejemplo 3");
        List<Estudiante> listDes = new ArrayList<>();
        listDes.sort(null);
        print(listDes.reversed());
    }

    private void ejemplo2(){
     System.out.println("EJemplo 2");
     List<Estudiante> list = new ArrayList<>(estList);
     list.sort(null);
     print(list);
    }

    private void print(List<Estudiante> list) {
        for(Estudiante e : list){
            System.out.println(e);
        }
    }

}

