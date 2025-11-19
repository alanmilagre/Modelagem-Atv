import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\n╔════════════════════════════════════════════════════╗");
            System.out.println("║                  Clinica.IO                   ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print(" 1 - Fazer login\n 2 - Fazer cadastro\n 3 - Gerar usuários(Teste)- \n 4 - Sair\nDigite a opção desejada: ");
            Local opcao = sc.nextInt();
            sc.nextLine();    

            switch (opcao) {
                case 1:
                    // Chamar método de login
                    break;
                case 2:
                    // Chamar método de cadastro
                     break;
                case 3:
                    // Chamar método de gerar usuários de teste
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }        
    
        } while (opcao != 4);
        
        sc.close();
    }
}