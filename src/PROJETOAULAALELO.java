import java.util.Scanner;

public class PROJETOAULAALELO {


    public static double efetuarPagamento(double valorPagamento, double saldo){
        if(valorPagamento > saldo){
            System.out.println("Saldo insuficiente! ");
            return saldo;
        }
        else{
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("Seu saldo atual é: R$" +( saldo - valorPagamento));
            return ( saldo - valorPagamento);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double saldoAlimentacao = 100;
        double saldoRefeicao = 100;
        double saldoTransporte = 100;
        double pagamento = 0;

        int usuarioQuerExecutar = 1;
        do{
           //MENU 1:
            System.out.println("Digite 1 para ver seus saldos / 2 para realizar pagamento");
            int opcao = in.nextInt();

            if(opcao == 1){
                //Printar os saldos
                System.out.println(" Saldo Cartao Alimentação : R$ " +saldoAlimentacao );
                System.out.println(" Saldo Cartao Refeição : R$ " +saldoRefeicao );
                System.out.println(" Saldo Cartao Transporte : R$ " +saldoTransporte );
            }
            else if(opcao ==2){
                //MENU 2:
                System.out.println("Digite a Opção escolhida: 1 - Alimentação / 2 - Refeição / 3 - Transporte");
                int cartao = in.nextInt();
                switch(cartao){
                    case 1:
                        //Alimentacao
                        System.out.println("Alimentacao");
                        System.out.println("Digite o valor a ser pago");
                        pagamento = in.nextInt();
                        saldoAlimentacao = efetuarPagamento(pagamento, saldoAlimentacao);
                    break;
                    case 2:
                        //Refeição
                        System.out.println("refeicao");
                        System.out.println("Digite o valor a ser pago");
                        pagamento = in.nextInt();
                        saldoRefeicao = efetuarPagamento(pagamento, saldoRefeicao);

                        break;
                    case 3:
                        //Transporte
                        System.out.println( "Transporte");
                        System.out.println("Digite o valor a ser pago");
                        pagamento = in.nextInt();
                        saldoTransporte = efetuarPagamento(pagamento, saldoTransporte);
                        break;
                }
            }

            //MENU 3:
            //Perguntar se deseja rodar de novo
            System.out.println( "Deseja executar o programa novamente? 1 para sim e 0 para não" );
            usuarioQuerExecutar = in.nextInt();
        }while (usuarioQuerExecutar == 1);

        in.close();
    }
}


