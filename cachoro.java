
public class cachoro {
    
    String nome;
    double tamanho;

    void latir(){
        if (tamanho>0 && tamanho<=14){
            System.out.println("Yip!, Yip");
        }

        if(tamanho>14 && tamanho<=60){
            System.out.println("Ruff!, Ruff!");
        }

        if(tamanho>60){
            System.out.println("Woof, Woof !!");
        }
    }
    
    
}
