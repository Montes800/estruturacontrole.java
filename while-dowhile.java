import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado.

public class Main { // Declara a classe principal.
    public static void main(String[] args) { // O método principal, ponto de entrada do programa.
        
        var scanner = new Scanner(System.in); // Cria um objeto 'Scanner' para ler a entrada do usuário.
        var name = "exit"; // Declara e inicializa a variável 'name' com o valor "exit".
        
        // --- Processo 1: Loop 'while' (Comentado) ---
        /*
        // Este loop verifica a condição ANTES de executar. Como 'name' já é "exit",
        // a condição (!name.equals("Exit")) é falsa, então este loop nunca rodaria.
        while (!name.equals("Exit")) { 
            System.out.println("Digite um nome"); // Mensagem para o usuário.
            name = scanner.next(); // Lê a próxima palavra do console.
            System.out.println(name); // Imprime o nome lido.


            // Esta condição 'if' é redundante neste cenário.
            if (name.equalsIgnoreCase("exit")) break;
        */
        
        // --- Processo 2: Loop 'while(true)' (Comentado) ---
        /*
        // Este é um loop infinito que roda continuamente.
        // Ele só pode ser parado com um 'break'.
        while (true) {
            System.out.println("Digite um nome"); // Mensagem para o usuário.
            name = scanner.next(); // Lê o nome digitado.

            // A condição de saída é checada dentro do loop.
            if (name.equalsIgnoreCase("exit")) break; 

            System.out.println(name);
        */
        
        // --- Processo 3: Loop 'do-while' (Ativo) ---
        // Este é o único loop que está sendo executado no seu código.
        do {
            System.out.print("Digite um nome: "); // Imprime uma mensagem e o cursor permanece na mesma linha.
            name = scanner.next(); // Lê a entrada do usuário.
            System.out.println(name); // Imprime o nome lido.

        } while (!name.equalsIgnoreCase("exit")); // A condição é checada no FINAL do loop.
        // Isso garante que o código dentro do 'do' será executado pelo menos uma vez,
        // independentemente da condição. O loop continua enquanto 'name' não for "exit".

    }
}