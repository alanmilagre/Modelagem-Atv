import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("\n╔════════════════════════════════════════════════════╗");
            System.out.println("║                  Clinica.IO                   ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.print(" 1 - Fazer login\n 2 - Fazer cadastro\n 3 - Gerar usuários(Teste)- \n 4 - Sair\nDigite a opção desejada: ");
             opcao = sc.nextInt();
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
                    System.out.println('\n' + "Saindo do sistema...");
                    break;
                default:
                    System.out.println('\n' + "Opção inválida. Tente novamente.");
            }        
    
        } while (opcao != 4);
        
        sc.close();

    }
}