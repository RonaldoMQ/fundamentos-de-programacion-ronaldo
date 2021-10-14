import  java.util.Scanner ;

public  class  Calificacion {
    public  static  void  main ( String [] args ) {
        
 
        Scanner sc =  nuevo  escáner ( System . In);
        int calificacion;
        Sistema . fuera . print ( " Ingresa el valor de calificacion: " );
        calificacion = sc . nextInt ();
        sc . línea siguiente();
        si (calificacion == 10 )
            Sistema . fuera . println ( " A " );
        si (calificacion == 9 )
            Sistema . fuera . println ( " B " );
        si (calificacion == 8 )
            Sistema . fuera . println ( " C " );
        si (calificacion == 7 )
            Sistema . fuera . println ( " D " );
        si (calificacion == 6 )
            Sistema . fuera . println ( " E " );
        si (calificacion <= 5 )
            Sistema . fuera . println ( " F " );
            sc . cerrar();
    
    }

 }
