import  java.util.Scanner ;
 clase  pública DiazSemana {
    public  static  void  main ( String [] args ) {
        int num;
        Scanner sc =  nuevo  escáner ( System . In);
        Sistema . fuera . print ( " Ingrese Número del 1 - 7: " );
        num =  Entero . parseInt (sc . siguiente ());
        switch (num) {
            caso  1 :  System . fuera . println ( " El día de la semana es: DOMINGO " ); romper ;
            caso  2 :  System . fuera . println ( " El día de la semana es: LUNES " ); romper ;
            caso  3 :  System . fuera . println ( " El día de la semana es: MARTES " ); romper ;
            caso  4 :  System . fuera . println ( " El día de la semana es: MIERCOLES " ); romper ;
            caso  5 :  System . fuera . println ( " El día de la semana es: JUEVES " ); romper ;
            caso  6 :  System . fuera . println ( " El día de la semana es: VIERNES " ); romper ;
            caso  7 :  System . fuera . println ( " El día de la semana es: SABADO " ); romper ;
            predeterminado  :  System . fuera . println ( " EL NÚMERO DE LA SEMANA ES INCORRECTO " );
            sc . cerrar();
        }
    }
