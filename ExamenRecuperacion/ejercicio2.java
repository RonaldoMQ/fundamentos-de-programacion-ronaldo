import java.util.Scanner;
class Main {
  public static void main(String[] args) {
             double descuento,monto,total;
         descuento=0;
        Scanner entrada=new Scanner(System.in);
    
        System.out.println("Digite el monto");
        monto=entrada.nextDouble();
    
        if(monto>2000){
            descuento=0.1*monto;
        }else if(monto>1000){
            descuento=0.05*monto;
        }else if(monto>500){
            descuento=0.02*monto;
        }
        total=monto-descuento;
        System.out.println("el descuento es: "+descuento);
        System.out.println("El pago total es: "+total);
  }
}