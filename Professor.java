public class Professor {
    private String nome;
    private String especialidade;
    private String registro;

    public Professor(String nome, String especialidae, String registro) {
        this.nome =nome;
        this.especialidade = especialidae;
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getRegistor() {
        return registro;
    }

    @Override 

    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", registro='" + registro + '\'' +
                '}';
    }
}