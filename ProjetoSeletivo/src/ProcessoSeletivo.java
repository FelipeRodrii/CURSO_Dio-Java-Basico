import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase= 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }


static void selecionarCandidato(){
    String[] candidatos= {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO", "MONICA", "MIRELA", "DANIELA", "JORGE", "GIOVANA", "CAIO", "VITORIA", "GABRIELA", "GUSTAVO SKAT"};

    int candidatosSelecionados= 0;
    int candidatoAtual= 0;
    double salarioBase= 2000.0;
    while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
        String candidato= candidatos[candidatoAtual];
        double salarioPretendido= valorPretendido();

        System.out.println("O candidato " + candidato + "Solicitou este valor de salário "+ salarioPretendido);
        if(salarioBase >= salarioPretendido){
            System.out.println("O candidato " +candidato+ " foi aselecionado para a vaga");

        }
        candidatosSelecionados++;
    }
}

static double valorPretendido(){
    return ThreadLocalRandom.current().nextDouble(1800,2200);
}

static void imprimirSelecionados(){
    String[] candidatos= {"FELIPE", "MARCIA", "JULIA","PAULO", "AUGUSTO"};

    System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

    for(int indice=0; indice<candidatos.length; indice++){
        System.out.println("O candidato n°" +indice+ " é o " +candidatos[indice]);
    }

    System.out.println("Forma abreviada com ou FOR EACH");

    for (String candidato : candidatos) {
        System.out.println("O candidato selecionado foi " +candidato);
        
    }
}

static boolean atender(){
    return new Random().nextInt(3)==1;
}


}

