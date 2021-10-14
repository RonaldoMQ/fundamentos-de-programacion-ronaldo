import  java.util.Scanner ;
public  class  LeandroPerson {
    
public  static  void  main ( String [] args ) {
Scanner sc = nuevo  escáner ( System . In);
    // declarar variables
    Cadena nomA, nomB, nomC, nomM = " " ;
    int edadA, edadB, edadC, edadM = 0 ;
    // Datos de Entrada
    Sistema . fuera . println ( " Ingrese nombre 1ra Persona: " );
    nomA = sc . Siguiente();
    Sistema . fuera . println ( " Ingrese edad 1ra Persona: " );
    edadA = sc . nextInt ();  
    Sistema . fuera . println ( " Ingrese nombre 2da Persona: " );
    nomB = sc . Siguiente();
    Sistema . fuera . println ( " Ingrese edad 2da Persona: " );
    edadB = sc . nextInt ();  
    Sistema . fuera . println ( " Ingrese nombre 3ra Persona: " );
    nomC = sc . Siguiente();
    Sistema . fuera . println ( " Ingrese edad 3ra Persona: " );
    edadC = sc . nextInt ();      
    // Proceso
    if (edadA < edadB && edadA < edadC) {
      edadM = edadA;
      nomM = nomA;
    }
  if (edadB < edadA && edadB < edadC) {
      edadM = edadB;
      nomM = nomB;
    }
  if (edadC < edadA && edadC < edadB) {
      edadM = edadC;
      nomM = nomC;
    }    
    // Datos de salida
    Sistema . fuera . println ( " La persona menor es: " + nomM + " y su edad es: " + edadM);
  }
}
