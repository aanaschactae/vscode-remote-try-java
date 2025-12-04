import java.io.IOException;
import java.util.Scanner;
public class Main {

    // Local reservado para declaração de funções
    
    public static void clearConsoleByJumpingLines() { // Função para "limpar" o console pulando linhas
        for (int i = 0; i < 50; i++) { // Laço de repetição, que pula linhas 50 vezes
            System.out.println(); // Imprime as linhas em branco no terminal
        }
    }
    public static void msgInicial(){ // Função que mostra a mensagem inicial
        System.out.println("Você quer utilizar o conversor de moedas (dolar -> real) ou (real->dolar)?"); // Imprime a mensagem de início
    }
    public static void msgCarregamento() throws InterruptedException { // Função que mostra a mensagem de carregamento
    System.out.println("Carregando..."); // Imprime a mensagem
    Thread.sleep(3000); // Espera 3 segundos para executar a linha de código seguinte
}
    public static void msgCalculo()throws InterruptedException{ // Função que mostra a mensagem de cálculo
        System.out.println("Calculando..."); // Imprime a mensagem
        Thread.sleep(3000); // Espera 3 segundos para executar a linha de código seguinte
    }
    public static void inputSolicitada(){ // Função que mostra as opções de entradas
        System.out.print("Para dólar->real, digite U$, para real->dólar, digite R$: "); // Imprime a mensagem
    }
    public static void msgValor(){
        System.out.print("Digite o valor desejado: "); // Mostra a mensagem que acompanha a entrada
    }
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);

        // Local reservado para declaração de variáveis

        String tipo = "n"; // Define a variável (local que armazena um valor específico) "tipo" como String (caracteres)
        float valor; // Define a variável que armazena o valor que será convertido como float (número de casas decimais)
        double conversao; // Define a variável que armazena o valor convertido como double (valor de dupla precisão)
        double cotacao1 = 5.31; // Define a variável que armazena a cotação do dólar como double
        double cotacao2 = 0.19; // Define a variável que armazena a cotação do real como double
        clearConsoleByJumpingLines(); // Chama a função que "limpa" o console
        msgInicial(); // Chama a função que mostra a mensagem inicial
        
        while (!tipo.equals("U$") && !tipo.equals("R$")){ // Laço de repetição que solicita novamente a entrada até que o valor corresponda a U$ ou R$
        inputSolicitada(); // Imprime os tipos de entrada solicitados; 
        tipo = input.next(); // Lê o tipo de conversor solicitado
        }
        if (tipo.equals("U$")){ // Estrutura condicional que realiza o código apenas se a condição (tipo == U$) foi verdadeira
            msgCarregamento(); //Chama a função que mostra o carregamento
            System.out.println("Bem vindo ao conversor Dólar->Real!"); // Mostra a mensagem de início do conversor Dólar->Real
            msgValor(); // Chama a função que mostra a mensagem que acompanha a entrada abaixo
            valor = input.nextFloat(); // Recebe o valor solicitado
            System.out.println("Cotação do Dólar: 1 Dólar americano igual a 5,31 Real brasileiro"); // Mostra a cotação do dólar
            msgCalculo(); // Chama a função que mostra a mensagem de cálculo seguida de uma espera
            conversao = valor*cotacao1; // Operador armazenado em "conversao" que calcula o valor solicitado em reais;
            System.out.println(String.format("Seu valor em Reais = %.2f", conversao)); // Mostra o valor em reais 
        }
        else if (tipo.equals("R$")){ // Laço de repetição que realiza o código se a primeira condição não for verdadeira ou se tipo==R$
            msgCarregamento(); // Chama a função que mostra a mensagem de carregamento 
            System.out.println("Bem vindo ao conversor Real->Dólar!"); // Mostra a mensagem de início do conversor Real->Dólar
            msgValor(); // Chama a função que mostra a mensagem que acompanha a entrada abaixo
            valor = input.nextFloat(); // Recebe o valor solicitado
            System.out.println("Cotação do Real: 1 Real brasileiro igual a 0,19 Dólar americano"); // Mostra a cotação do real
            msgCalculo(); // Chama a função que mostra a mensagem de cálculo seguida de uma espera
            conversao = valor/cotacao2; // Operador armazenado em "conversao" que calcula o valor solicitado em dólares
            System.out.println(String.format("Seu valor em Dólares = %.2f", conversao)); // Mostra o valor em dólares
        }
    }
}
