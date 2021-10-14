import  java.util.Scanner ;

 clase  pública Nota {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int calificacion;
        Sistema . fuera . print ( " Ingresa el valor de calificacion: " );
        calificacion = en . nextInt ();
        en . línea siguiente();
        si (calificacion == 10 )
            Sistema . fuera . println ( " A " );
        si (calificacion == 9 )
            Sistema . fuera . println ( " B " );
        si (calificacion == 8 )
            Sistema . fuera . println ( " C " );
        si (calificacion == 7 )
            Sistema . fuera . println ( " D " );
        si (calificacion == 6 )
            Sistema . fuera . println ( " D " );
        if (calificacion <= 5  && calificacion > 0 )
            Sistema . fuera . println ( " F " );
    }

}
