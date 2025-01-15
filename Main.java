import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);

            System.out.println("Digite uma das opções a seguir:");
            System.out.println("""
                    1) Real para Dólar;
                    2) Real para Euro;
                    3) Real para peso argentino;
                    4) Dólar para Real;
                    5) Dólar para Euro;
                    6) Dólar para peso argentino.
                           
                    """);
            var opcao = leitura.nextInt();
            System.out.println("Insira a quantia para verificar a cotação:");
            var valor = leitura.nextDouble();

            String moeda1 = "";
            String moeda2 = "";

            if (opcao < 4 && opcao > 0) {
                moeda1 = "BRL";
            } else if (opcao < 6) {
                moeda1 = "USD";
            } else {
                System.out.println("Seleção incorreta");
            }

            if(opcao == 2 || opcao == 5){
                moeda2 = "EUR";
            }
            if(opcao == 3 || opcao == 6){
                moeda2 = "ARS";
            }
            if(opcao == 1){
                moeda2 = "USD";
            }
            if(opcao == 4){
                moeda2 = "BRL";
            }

                Moeda novaMoeda = Conversor.buscaMoeda(moeda1, moeda2, valor);


                System.out.println(moeda1 +" "+ valor + " equivalem á: "+ moeda2 +" " + novaMoeda.conversion_rates().get(moeda2) * valor);
        }}

