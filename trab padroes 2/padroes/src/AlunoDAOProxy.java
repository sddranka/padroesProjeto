import java.util.HashMap;
import java.util.Map;

public class AlunoDAOProxy implements AlunoDAOInterface {
    private Map<String, Aluno> alunos;
    

    public AlunoDAOProxy(){
        super();
        this.alunos=new HashMap<>();
    }

    @Override
    public void addAluno(String nome) throws Exception {
        this.alunos.put(nome, new Aluno(nome));
        
    }

    @Override
    public Aluno getAluno(String nome) throws Exception {
        return alunos.get(nome);
    }
    
}
