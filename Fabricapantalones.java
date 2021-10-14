import  java.util.Scanner ;

público  de clase  Fabricapantalones {

    public  static  void  main ( String [] args ) {
        Escáner en =  nuevo  escáner ( Sistema . En);
        int modelo, talla;
        doble  N_pantalones , cargo_por_talla, costo_de_la_tela, ganancia, ganancia_extra;
        doble mano_de_obra, metro_de_tela, metros_de_tela, precio_final;
        Sistema . fuera . print ( " Ingresa el valor de N pantalones: " );
        N_pantalones  = en . nextDouble ();
        en . línea siguiente();
        Sistema . fuera . print ( " Ingresa el valor de metro de tela: " );
        metro_de_tela = en . nextDouble ();
        en . línea siguiente();
        Sistema . fuera . println ( " Selecciona el valor de modelo. " );
        Sistema . fuera . println ( " \ t 1.- A " );
        Sistema . fuera . println ( " \ t 2.- B " );
        Sistema . fuera . imprimir ( " \ t : " );
        hacer {
            modelo = en . nextInt ();
            en . línea siguiente();
            si (modelo < 1 || modelo > 2 )
                Sistema . fuera . print ( " Valor incorrecto. Ingr \ u 00E9salo nuevamente .: " );
        } while (modelo < 1 || modelo > 2 );
        Sistema . fuera . println ( " Selecciona el valor de talla. " );
        Sistema . fuera . println ( " \ t 1.- 30 " );
        Sistema . fuera . println ( " \ t 2.- 32 " );
        Sistema . fuera . println ( " \ t 3.- 36 " );
        Sistema . fuera . imprimir ( " \ t : " );
        hacer {
            talla = en . nextInt ();
            en . línea siguiente();
            si (talla < 1 || talla > 3 )
                Sistema . fuera . print ( " Valor incorrecto. Ingr \ u 00E9salo nuevamente .: " );
        } while (talla < 1 || talla > 3 );
        si (modelo == 1 )
            metros_de_tela = 1.5 * N_pantalones ;
        demás
            metros_de_tela = 1.8 * N_pantalones ;
        costo_de_la_tela = metros_de_tela * metro_de_tela;
        si (modelo == 1 )
            mano_de_obra = costo_de_la_tela * 0.8 ;
        demás
            mano_de_obra = costo_de_la_tela * 0.95 ;
        si (talla == 2 || talla == 3 )
            cargo_por_talla = mano_de_obra * 0.04 ;
        demás
            cargo_por_talla = 0 ;
        ganancia_extra = (costo_de_la_tela + mano_de_obra + cargo_por_talla) * 0.3 ;
        precio_final = costo_de_la_tela + mano_de_obra + cargo_por_talla + ganancia_extra;
        ganancia = cargo_por_talla + ganancia_extra;
        Sistema . fuera . println ( " Valor de cargo por talla: "  + cargo_por_talla);
        Sistema . fuera . println ( " Valor de costo de la tela: "  + costo_de_la_tela);
        Sistema . fuera . println ( " Valor de ganancia: "  + ganancia);
        Sistema . fuera . println ( " Valor de ganancia extra: "  + ganancia_extra);
        Sistema . fuera . println ( " Valor de mano de obra: "  + mano_de_obra);
        Sistema . fuera . println ( " Valor de metros de tela: "  + metros_de_tela);
        Sistema . fuera . println ( " Valor de precio final: "  + precio_final);
        en . cerrar();
    }

}
