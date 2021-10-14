import  java.util.Scanner ;

 regalos de clase  pública {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int presupuesto;
        Sistema . fuera . print ( " Ingresa el valor de presupuesto: " );
        presupuesto = en . nextInt ();
        en . línea siguiente();
        si (presupuesto <= 10 )
            Sistema . fuera . println ( " Tarjeta " );
        si (presupuesto > = 11 && presupuesto <= 100 )
            Sistema . fuera . println ( " Chocolates " );
        si (presupuesto > = 101 && presupuesto <= 250 )
            Sistema . fuera . println ( " Flores " );
        si (presupuesto > = 251 )
            Sistema . fuera . println ( " Anillo " );
    }

}
