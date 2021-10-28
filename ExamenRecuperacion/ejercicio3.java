import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        
        int a,b;
        char caracter;
        
        
        Scanner entrada=new Scanner(System.in);
        
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