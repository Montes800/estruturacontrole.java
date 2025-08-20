import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário.

public class Main { // A classe principal do programa. Todo código Java reside em uma classe.

    public static void main(String[] args){ // O método 'main' é o ponto de partida para a execução do programa.
        var scanner = new Scanner(System.in); // Cria um objeto 'Scanner' para ler a entrada do console (System.in).
        System.out.println("Informe um numero de 1 até 7"); // Imprime uma mensagem na tela para o usuário.
        var option = scanner.nextInt(); // Lê o próximo número inteiro que o usuário digita e o armazena na variável 'option'.
        
        // A estrutura 'switch' é usada para testar o valor de 'option' e executar o código correspondente ao caso.
        switch (option){ 
            case 1 -> System.out.println("Sábado"); // Se 'option' for 1, a string "Sábado" é impressa.
            case 2 -> System.out.println("Domingo"); // Se 'option' for 2, a string "Domingo" é impressa.
            case 3 -> System.out.println("Segunda-feira"); // Se 'option' for 3, a string "Segunda-feira" é impressa.
            case 4 -> System.out.println("Terça-feira"); // Se 'option' for 4, a string "Terça-feira" é impressa.
            case 5 -> System.out.println("Quarta-feira"); // Se 'option' for 5, a string "Quarta-feira" é impressa.
            case 6 -> System.out.println("Quinta-feira"); // Se 'option' for 6, a string "Quinta-feira" é impressa.
            case 7 -> System.out.println("Sexta-feira"); // Se 'option' for 7, a string "Sexta-feira" é impressa.
            default -> System.out.println("Opção inválida"); // Se 'option' não for nenhum dos casos anteriores, a string "Opção inválida" é impressa.
            
            /*
             * Este bloco de código é uma forma alternativa e mais antiga de escrever a mesma estrutura 'switch'.
             * Ele é funcional, mas a forma com '->' é considerada mais moderna e evita a necessidade de 'break;' em cada caso.
            case 1:
                System.out.println("Sábado");
                break;
            case 2:
                System.out.println("Domingo");
                break;
            case 3:
                System.out.println("Segunda-feira");
                break;
            case 4:
                System.out.println("Terça-feira");
                break;
            case 5:
                System.out.println("Quarta-feira");
                break;
            case 6:
                System.out.println("Quinta-feira");
                break;
            case 7:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Opção inválida");
                */
        }
    }
}