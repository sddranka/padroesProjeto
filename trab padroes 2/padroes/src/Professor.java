public class Professor {
    private String nome;
    private String disciplina;
    private Cargo cargo;

    public Professor nome (String nome) {
        this.nome = nome;
        return this;
    }
    public Professor disciplina(String disciplina) {
        this.disciplina = disciplina;
        return this;
    }
    public Professor is(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }
    public String getNome() {
        return nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public Cargo getCargo() {
        return cargo;
    }
}
