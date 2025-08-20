import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado.

public class ifelse { // Declara a classe principal.
    public static void main(String[] args){ // O método 'main' é o ponto de entrada do programa.
        
        // --- Processo de Entrada de Dados ---
        var scanner = new Scanner(System.in); // Cria um objeto 'Scanner' para ler a entrada do console.
        System.out.println("Informe seu nome: "); // Solicita o nome do usuário.
        var name = scanner.next(); // Lê o nome e armazena na variável 'name'.
        System.out.println("Informe sua idade:"); // Solicita a idade.
        var age = scanner.nextInt(); // Lê a idade e armazena na variável 'age'.
        System.out.println("Voce e emancipado? (s/n)"); // Pergunta se é emancipado.
        // Lê a resposta, ignora maiúsculas/minúsculas e verifica se é "s",
        // armazenando 'true' ou 'false' na variável 'isEmancipated'.
        var isEmancipated = scanner.next().equalsIgnoreCase("s"); 
        
        /*
        // --- Processo 1: Lógica 'if-else' (Comentado) ---
        // Este é um método tradicional de verificar múltiplas condições.
        if (age >= 18) { // A primeira condição: checa se a idade é 18 ou mais.
            // Se a condição acima for verdadeira, esta linha é executada.
            System.out.printf("%s tem %s anos, voce pode dirigir\n", name, age);
        } else if (age >= 16 && isEmancipated) { // A segunda condição: checa se a idade é 16 ou mais E se é emancipado.
            // Se a primeira condição for falsa e esta for verdadeira, esta linha é executada.
            System.out.printf("%s, apesar de voce ter %s anos, voce e emancipado e pode dirigir \n", name, age);
        } else { // Se nenhuma das condições anteriores for verdadeira...
            // ...esta linha é executada.
            System.out.printf("%s, voce nao pode dirigir \n", name);
            
        }
        System.out.println("Fim da execução"); // Mensagem impressa após o bloco 'if-else'.
        scanner.close(); // Fecha o objeto Scanner para liberar recursos.
        */

        // --- Processo 2: Lógica com Operador Ternário (Ativo) ---
        // Este é um método mais conciso para tomar decisões e atribuir valores.
        // As duas condições (>= 18 OU (>= 16 E emancipado)) são combinadas em uma única expressão booleana.
        var canDrive = (age >= 18) || (age >= 16 && isEmancipated); 
        // O operador ternário (? :) funciona como um 'if-else' em uma linha.
        // Se 'canDrive' for verdadeiro, a mensagem será a primeira string.
        // Se for falso, será a segunda string.
        var message = canDrive ?
            name + ", voce pode dirigir" : // Mensagem para quem pode dirigir.
            name + ", voce nao pode dirigir \n"; // Mensagem para quem não pode dirigir.
        System.out.println(message); // Imprime a mensagem final.
    
    } // Fim do método 'main'.
} // Fim da classe.