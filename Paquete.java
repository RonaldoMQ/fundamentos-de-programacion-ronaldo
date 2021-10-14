import  java.util.Scanner ;

 Paquete de clase  pública {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        doble dinero_recibido;
        Sistema . fuera . print ( " Ingresa el valor de dinero recibido: " );
        dinero_recibido = en . nextDouble ();
        en . línea siguiente();
        si (dinero_recibido > = 50000 )
            Sistema . fuera . println ( " Paquete A " );
            Sistema . fuera . println ( " Televisión, " +  " Un modular " , + " Tres pares de zapatos " , + " cinco camisas, " + " y cinco pantalones. " );
        si (dinero_recibido > = 20000 && dinero_recibido < 50000 )
            Sistema . fuera . println ( " Paquete B " );
            Sistema . fuera . println ( " una grabadora, " + " tres pares de zapatos, "  + " cinco camisas " +  " y cinco pantalones " );
        si (dinero_recibido > = 10000 && dinero_recibido < 20000 )
            Sistema . fuera . println ( " Paquete C " );
            Sistema . fuera . println ( " dos pares de zapatos, " +  " tres camisas " +  " y tres pantalones. " );
        si (dinero_recibido < 10000 )
            Sistema . fuera . println ( " Paquete D " );
            Sistema . fuera . println ( " un par de zapatos, " + " dos camisas "  + " y dos pantalones. " );
            en . cerrar();
    }

}
