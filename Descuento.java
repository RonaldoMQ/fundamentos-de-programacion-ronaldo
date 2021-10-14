import  java.util.Scanner ;

 clase  pública DEScuento {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int i, n;
        doble costo, descuento, pago_por_todo, precio;
        pago_por_todo =  0 ;
        Sistema . fuera . print ( " Ingresa el valor de N: " );
        n = pulg . nextInt ();
        en . línea siguiente();
        para (i = 1 ; i <= n; i ++ ) {
            Sistema . fuera . imprimir ( " PROCESO "  + i);
            Sistema . fuera . print ( " \ n *************************** " );
            Sistema . fuera . print ( " \ n Ingrese el valor del precio: " );
            precio = in . nextDouble ();
            en . línea siguiente();
            descuento = precio * 0.1 ;
            si (precio > = 200 )
                descuento = precio * 0.15 ;
            si (precio > 100 && precio < 200 )
                descuento = precio * 0.12 ;
            costo = precio - descuento;
            pago_por_todo = pago_por_todo + costo;
            Sistema . fuera . println ( " Valor de costo: "  + costo);
            Sistema . fuera . println ( " Valor de descuento: "  + descuento);
            Sistema . fuera . println ();
        }
        Sistema . fuera . println ( " Valor de pago por todo: "  + pago_por_todo);
    }

}
