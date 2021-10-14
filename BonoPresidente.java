import  java.util.Scanner ;

 clase  pública BonoPresidente {

     public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        beca doble , edad, promedio;
        Sistema . fuera . print ( " Ingresa el valor de edad: " );
        Edad = en . nextDouble ();
        en . línea siguiente();
        Sistema . fuera . print ( " Ingresa el valor de promedio: " );
        Promedio = en . nextDouble ();
        en . línea siguiente();
        beca = 0 ;
        
        si (edad > 18 && promedio > = 9 )
            beca = 2000 ;
        si (edad > 18 && promedio > = 7.5 && promedio < 9 )
            beca = 1000 ;
        si (edad > 18 && promedio > = 6 && promedio < 7.5 )
            beca = 500 ;
        si (edad <= 18 && promedio > = 9 )
            beca = 3000 ;
        si (edad <= 18 && promedio > = 8 && promedio < 9 )
            beca = 2000 ;
        si (edad > 18 && promedio > = 6 && promedio < 8 )
            beca = 100 ;
        si (promedio < 6 )
            Sistema . fuera . println ( " Se env \ u 00EDa carta de invitaci \ u 00F3n a estudiar m \ u 00E1s " );
            Sistema . fuera . println ( " Valor de beca: "  + beca);
    }
}
