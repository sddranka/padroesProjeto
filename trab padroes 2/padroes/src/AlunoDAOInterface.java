public interface AlunoDAOInterface{
    public void addAluno(String nome) throws Exception;

    public Aluno getAluno(String nome)throws Exception;
}