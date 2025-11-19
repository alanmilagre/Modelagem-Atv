public class Medico extends Usuario {
    public int id;
    private int crm;
    private String especialidade;
    private String sexo;

 public Medico(int id, int crm, String especialidade, String sexo){
    super("", "Médico", "", "", "");   
    this.id = id;
    this.crm = crm;
    this.especialidade = especialidade;
    this.sexo = sexo;
}


@Override // pra garantir q estamos sobrescrevendo o toString() da classe Object e para exibir informações de usuario
   public String toString() {
    return "Id: " + id +
           ", CRM: " + crm +
           ", Especialidade: " + especialidade +
           ", Sexo: " + sexo; 
}

public static void visualizar_agenda() {
// logica do método

    }
}