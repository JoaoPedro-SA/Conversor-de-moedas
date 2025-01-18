import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite uma moeda para verificar a cotação: ");
            System.out.println("Exemplos de moedas aceitas: BRL, USD, EUR ");

            var moeda1 = leitura.nextLine();
            moeda1 = moeda1.toUpperCase();
            if (moeda1.length() > 3){
                System.out.println("A moeda: "+ moeda1 +" é invalida" );
            } else{
                System.out.println("Digite moeda para a comparação: ");
                var moeda2 = leitura.nextLine();
                moeda2 = moeda2.toUpperCase();

                if (moeda2.length() > 3){
                    System.out.println("A moeda: "+ moeda2 +" é invalida" );
                } else{

                    System.out.println("Insira a quantia para verificar a cotação:");
                    var valor = leitura.nextDouble();

                    Moeda novaMoeda = Conversor.buscaMoeda(moeda1);

                    System.out.println(moeda1 +" "+ valor + " equivalem á: "+ moeda2 +" " + novaMoeda.conversion_rates().get(moeda2) * valor);
        }}}}

