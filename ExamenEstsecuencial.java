import  java.util.Scanner ;
class  ExamenProgramacion {
 Escáner estático sc =  nuevo  escáner ( System . in);

 bono vacío  estático () {
    doble bono, puntos, S_minimo ;
    Sistema . fuera . print ( " Ingresa el valor de puntos: " );
    puntos = sc . nextDouble ();
    sc . línea siguiente();
    Sistema . fuera . print ( " Ingresa el valor de salario minimo: " );
    S_minimo  = sc . nextDouble ();
    sc . línea siguiente();
    bono = 0 ;
    si (puntos > = 100 && puntos > 200 )
        bono = S_minimo * 0.10 ;
    si (puntos > = 201 && puntos <= 300 )
        bono = S_minimo * 0.40 ;
    si (puntos > = 301 && puntos <= 400 )
        bono = S_minimo * 0,70 ;
    si (puntos > = 401 )
        bono = S_minimo * 0,80 ;
    Sistema . fuera . println ( " Valor de bono: "  + bono);
}
 vacío  estático OPbasicas () {
  int resultado = 0 ;
  Sistema . fuera . println ( " INGRESE EL PRIMER NUMERO " );
  int numero1 = sc . nextInt ();
  Sistema . fuera . println ( " INGRESE EL SEGUNDO NUMERO " );
  int numero2 = sc . nextInt ();
  Sistema . fuera . println ( " OPERACIONES BASICAS " );
  int operacion = sc . nextInt ();
  switch (operacion) {
     caso  1 : resultado = numero1 + numero2;
     Sistema . fuera . println ( " la suma es: " + resultado);
     romper ;
     caso  2 : resultado = numero1 - numero2;
     Sistema . fuera . println ( " la resta es: " + resultado);
     romper ;
     caso  3 : resultado = numero1 * numero2;
     Sistema . fuera . println ( " la multiplicacion es: " + resultado);
     romper ;
     caso  4 : resultado = numero1 / numero2;
     Sistema . fuera . println ( " la division es: " + resultado);
     romper ;
     por defecto :
      Sistema . fuera . println ( " LA OPERACION NO EXISTE " );
      romper ;

   }


}
 vacío  estático Vacuna () {
  
    int edad, sexo;
    Sistema . fuera . print ( " Ingresa el valor de edad: " );
    edad = sc . nextInt ();
    sc . línea siguiente();
    Sistema . fuera . println ( " Selecciona el valor de sexo. " );
    Sistema . fuera . println ( " \ t 1.- mujer " );
    Sistema . fuera . println ( " \ t 2.- hombre " );
    Sistema . fuera . imprimir ( " \ t : " );
    hacer {
        sexo = sc . nextInt ();
        sc . línea siguiente();
        si (sexo < 1 || sexo > 2 )
            Sistema . fuera . print ( " Valor incorrecto. Ingr \ u 00E9salo nuevamente .: " );
    } while (sexo < 1 || sexo > 2 );
    si ((sexo == 2 && edad > = 16 && edad < 70 ) || edad < 16 )
        Sistema . fuera . println ( " A " );
    si (sexo == 1 && edad > = 16 && edad < 70 )
        Sistema . fuera . println ( " B " );
    si (edad > 70 )
        Sistema . fuera . println ( " C " );
        Sistema . fuera . println ( " \ t Ingrese codigo nuevamente " );

        volver ;
 }

  




static  void  Nota () {
    
    doble nota1 = 0 , nota2 = 0 , nota3 = 0 ;
    doble promedio = 0 ;
    
Sistema . fuera . println ( " ingrese las notas del estudiante: " );
    
Sistema . fuera . print ( " ingrese la nota 1: " );
nota1 = sc . nextDouble ();
Sistema . fuera . print ( " ingrese la nota 2: " );
nota2 = sc . nextDouble ();
Sistema . fuera . print ( " ingrese la nota 3: " );
nota3 = sc . nextDouble ();
    
  promedio = (nota1 *  0.25  + nota2 *  0.25  + nota3 *  0.50 ) / 3 ;
    si (promedio > = 11 ) {
      Sistema . fuera . println ( " el alumno aprovo: "  + promedio);
    } más {
      Sistema . fuera . println ( " el alumno reprovo: "  + promedio);
    }
}
static  void  menuOpciones () {
    int opcionesA = 0 ;
    String msg = " \ n que desea realizar " ;
    Sistema . fuera . println (mensaje);
    String msg1 =  " Si desea saber su bono seleccione (1) " ;
    Sistema . fuera . println (msg1);
    String msg2 =  " Si desea saber su Promedio seleccione (2) " ;
    Sistema . fuera . println (msg2);
    String msg3 =  " Si desea saber que tipo de vacuna necesita seleccionar (3) " ;
    Sistema . fuera . println (msg3);
    String msg4 =  " Si desea calcular 1 = +, 2 = -, 3 = *, 4 = / seleccione (4) " ;
    Sistema . fuera . println (msg4);
      opcionesA = sc . nextInt ();  
      while (opcionesA ! = 0 ) {
          cambiar (opcionesA) {
          caso  1 : bono (); romper ;
          caso  2 : Nota (); romper ;
          caso  3 : Vacuna (); romper ;
          caso  4 : OPbasicas (); romper ;
        
          por defecto :
          Sistema . fuera . println ( " El Algoritmo no existe! " );
        }
      Sistema . fuera . println (mensaje);
      opcionesA = sc . nextInt ();        
    }
  }       


    public  static  void  main ( String [] args ) {
    menuOpciones ();
  }
