import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm= scan.nextInt();
        System.out.println("Digete o segundo parâmetro: ");
        int parametroDois= scan.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch(){

        }


    }

    static void contar(int parametroUm, int parametroDois)throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            
        }

    }
}
