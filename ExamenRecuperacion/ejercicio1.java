import java.util.Scanner;
class Main {
 
  public static void main(String[] args) {
    
    float exCono,entrevista,test,total;
        Scanner entrada=new Scanner(System.in);
        
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

  }
}