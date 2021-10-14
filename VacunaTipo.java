import  java.util.Scanner ;

public  class  VacunaTipo {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int edad, sexo;
        Sistema . fuera . print ( " Ingresa el valor de edad: " );
        Edad = en . nextInt ();
        en . línea siguiente();
        Sistema . fuera . println ( " Selecciona el valor de sexo. " );
        Sistema . fuera . println ( " \ t 1.- mujer " );
        Sistema . fuera . println ( " \ t 2.- hombre " );
        Sistema . fuera . imprimir ( " \ t : " );
        hacer {
          sexo = en . nextInt ();
          en . línea siguiente();
          si (sexo < 1 || sexo > 2 )
       Sistema . fuera . print ( " Valor incorrecto. Ingr \ u 00E9salo nuevamente .: " );
      } while (sexo < 1 || sexo > 2 );
      si ((sexo == 2 && edad > = 16 && edad < 70 ) || edad < 16 )
      Sistema . fuera . println ( " EL TIPO DE VACUNA A " );
      si (sexo == 1 && edad > = 16 && edad < 70 )
      Sistema . fuera . println ( " EL TIPO DE VACUNA B " );
      si (edad > 70 )
      Sistema . fuera . println ( " EL TIPO DE VACUNA C " );
      en . cerrar();
    }  

}
