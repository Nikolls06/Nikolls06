public class moto{

boolean ligado;
int buzina;
int pararFarol;
boolean velocidadeAtual;
double velociadeMaxima;
double velocidadeMinima;
int acelerar;
double velocidadeMaxima;
double combustivel;
double cilindradas;
double valor;







void ligar(){
    ligado = true;
}

void desligar(){
    ligado = false;
}

void buzinar(){
System.out.println("bibi buzinando");
}

void acelerar(){
System.out.println("vrum vrum");
}

void pararFarol(){
    System.out.println(" a moto parou no farol");
}

int acelerar(double quantidade) {

    double novaVelocidade = velocidadeAtual + quantidade;

    velocidadeAtual = novaVelocidade;


    if (novaVelocidade >= velocidadeMaxima) {

        return -1;

    } else {

        return 0;

    }
}



}