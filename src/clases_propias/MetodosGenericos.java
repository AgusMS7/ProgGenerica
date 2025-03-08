package clases_propias;

import java.util.GregorianCalendar;

public class MetodosGenericos {
    public static void main(String[] args) {
        
        String nombres[]={"Jose","Maria","Pepe","Agus"};
        
        System.out.println(MisMatrices.getMenor(nombres));
        
//        Empleado paco = new Empleado("Paco", 45, 2500);                     ///Empleado no implementa Comparable
//        
//        Empleado ana = new Empleado("Ana", 45, 2500);
//        
//        Empleado maria = new Empleado("Maria", 45, 2500);
//        
//        Empleado misEmpleados[]={paco,ana,maria};
//        
//        System.out.println(MisMatrices.getMenor(MisEmpleados());

        GregorianCalendar fechas[]={new GregorianCalendar(2025, 3, 7),
                                    new GregorianCalendar(2025, 3, 7),
                                    new GregorianCalendar(2025, 3, 7)
                                    };
        
        System.out.println(MisMatrices.getMenor(fechas));
    }
}

class MisMatrices{
    
    public static <T extends Comparable> T getMenor(T[]a){
        
        if(a==null || a.length==0){
            return null;
        }
        
        T elementoMenor=a[0];
        
        for(int i=1; i<a.length;i++){
            
            if(elementoMenor.compareTo(a[i])>0){
                elementoMenor=a[i];
            }
            
        }
        
        return elementoMenor;
    }
    
}