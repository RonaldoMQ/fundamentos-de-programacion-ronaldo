import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        
        int opcion;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite que Ejercicio desea probar: [1-2-3]");
        opcion=entrada.nextInt();
        
        
        if(opcion==1){
               float exCono,entrevista,test,total;


               System.out.print("Digite el examen de conocimiento: ");
               exCono=entrada.nextFloat();

               System.out.print("Digite el examen Entrevista persona: ");
               entrevista=entrada.nextFloat();

               System.out.print("Digite nota de test Psicologico: ");
               test=entrada.nextFloat();

               total=(float)(0.5*exCono+0.3*entrevista+test*0.2);

               if(total>=1 && total<11){
                   System.out.println("Nivel 1");
               }else if(total<14){
                   System.out.println("Nivel 2");
               }else if(total<17){
                   System.out.println("Nivel 3");
               }else{
                   System.out.println("Nivel 4");
               }
        }else if(opcion==2){
                 double descuento,monto,total;
                 descuento=0;


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
        else if(opcion==3){
                     int a,b;
                    char caracter;

                    System.out.println("Digite el primer numero: ");
                    a=entrada.nextInt();

                    System.out.println("Digite el segundo numero: ");
                    b=entrada.nextInt();

                    System.out.println("Digite un signo[+,-,/,*,^,R]");
                    caracter=entrada.next().charAt(0);
                    switch(caracter){
                        case '+':System.out.println("La suma es: "+(a+b));break;
                        case '-':System.out.println("La resta es: "+(a-b));break;
                        case '/':System.out.println("La division es: "+(a/b));break;
                        case '*':System.out.println("La multiplicacion es: "+(a*b));break;
                        case '^':System.out.println("La potencia es: "+Math.pow(a, b));
                        case 'R':
                                System.out.println("El modulo del primero numero: "+(a%2));
                                System.out.println("El modulo del segundo numero: "+(b%2));
                                break;
                             default:System.out.println("Valor incorrecto");
                    }
        }
  }
}