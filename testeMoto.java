import java.util.Scanner;
public class testeMoto {
 
    public static void main(String[] args) {
        
        moto F800;
    
        F800 = new moto(); 
    
     
        F800.ligar();
        F800.desligar();
        F800.buzinar();
        F800.pararFarol();
    
        F800.combustivel = 40; 
        F800.cilindradas = 30;

        F800.velociadeMaxima = 200;

        moto cross;

        cross = new moto();

        cross.ligar();
        cross.desligar();
        cross.buzinar();
        cross.pararFarol();

        cross.combustivel = 19;
        cross.cilindradas = 70;

        cross.velociadeMaxima = 120;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("== Quanto quer acelerar ? ==");
        double valor =  sc.nextDouble();
        int teste = F800.acelerar(valor);
        int teste2 = cross.acelerar(valor);
            






if(teste == -1){

    System.out.println("A velocidade da F800 é  " + F800.velocidadeAtual + "km/h");

}

if(teste2 == -1){
 
    System.out.println("A velocidade da CROSS é  " + cross.velocidadeAtual + "km/h");

}


if(F800.velocidadeAtual >= 120){
    System.out.println("CARA, reduza a velocidade");

}
if(cross.velocidadeAtual >= 120){
    System.out.println("CARA, reduza a velocidade");

}


sc.close();


    }

}
