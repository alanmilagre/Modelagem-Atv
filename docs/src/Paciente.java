import java.time.LocalDate;

public class Paciente extends Usuario{
    public int id;
    private LocalDate dataNascimento;
    private String cpf;
    private String sexo;

    public Paciente(String nome, String tipo, String endereco, String email, String telefone, int id, LocalDate dataNascimento, String cpf, String sexo) {
        super(nome, tipo, endereco, email, telefone);
        this.id = id;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
}
