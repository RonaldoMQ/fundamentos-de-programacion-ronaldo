import  java.util.Scanner ;

 Estacionamiento de clase  pública {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int cobro, horas;
        Sistema . fuera . print ( " Ingresa el valor de horas: " );
        horas = en . nextInt ();
        en . línea siguiente();
        cobro = 0 ;
        si (horas <= 2 )
            cobro = horas * 5 ;
        si (horas > 2 && horas <= 5 )
            cobro = 2 * 5 + (horas - 2 ) * 4 ;
        si (horas > 5 && horas <= 10 )
            cobro = 2 * 5 + 3 * 4 + (horas - 5 ) * 3 ;
        si (horas > 10 )
            cobro = 2 * 5 + 3 * 4 + 3 * 5 + (horas - 10 ) * 2 ;
        Sistema . fuera . println ( " Valor de cobro: "  + cobro);
    }

}
