import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Paciente> pacientes = new ArrayList<>();
    static ArrayList<Medico> medicos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\n╔════════════════════════════════════════════════════╗");
            System.out.println("║                  Clinica.IO                   ║");
            System.out.println("╚════════════════════════════════════════════════════╝");
            System.out.println("1 - Fazer login");
            System.out.println("2 - Fazer cadastro");
            System.out.println("3 - Gerar usuários de teste");
            System.out.println("4 - Listar pacientes");
            System.out.println("5 - Listar médicos");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    login(sc);
                    break;

                case 2:
                    cadastrarPaciente(sc);
                    break;

                case 3:
                    gerarUsuariosTeste();
                    break;

                case 4:

                    listarPacientes();

                    break;

                case 5:
                    listarMedicos();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (op != 6);

        sc.close();

    }

    // MÉTODO DE LOGIN SIMPLES
    public static void login(Scanner sc) {
        System.out.print("Email: ");
        String email = sc.nextLine();

        for (Paciente p : pacientes) {
            if (p.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Login realizado como PACIENTE:");
                System.out.println(p);
                return;
            }
        }

        for (Medico m : medicos) {
            if (m.getEmail().equalsIgnoreCase(email)) {
                System.out.println("Login realizado como MÉDICO:");
                System.out.println(m);
                return;
            }
        }

        System.out.println("Usuário não encontrado.");
    }

    // CADASTRAR PACIENTE
    public static void cadastrarPaciente(Scanner sc) {
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        String tipo = "Paciente";

        System.out.print("Endereço: ");
        String end = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Telefone: ");
        String tel = sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Data nascimento (AAAA-MM-DD): ");
        LocalDate dn = LocalDate.parse(sc.nextLine());

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        Paciente p = new Paciente(nome, tipo, end, email, tel, id, dn, cpf, sexo);
        pacientes.add(p);

        System.out.println("Paciente cadastrado com sucesso!");
    }

    // GERAR TESTE
    public static void gerarUsuariosTeste() {
        pacientes.add(new Paciente(
            "João", "Paciente", "Rua A", "joao@gmail.com", "9999-9999",
            1, LocalDate.of(2010,5,12), "12345678900", "M"
        ));

        medicos.add(new Medico(1, 4321, "Cardiologia", "M"));

        System.out.println("Usuários de teste criados!");
    }

    // LISTAR PACIENTES
    public static void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

    // LISTAR MÉDICOS
    public static void listarMedicos() {
        if (medicos.isEmpty()) {
            System.out.println("Nenhum médico cadastrado.");
            return;
        }

        for (Medico m : medicos) {
            System.out.println(m);
        }
    }
}