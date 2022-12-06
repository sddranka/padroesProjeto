public class AlunoDAODecorator implements AlunoDAOInterface {

    private static AlunoDAOInterface alunoDAO;

    private AlunoDAOInterface getDAO(){
        if(alunoDAO==null)
        alunoDAO=new AlunoDAOProxy();
        return alunoDAO;
    }


    @Override
    public void addAluno(String nome) throws Exception {
        if(nome.isBlank())
            throw new AlunoException("Nome Invalido");
        getDAO().addAluno(nome);
    }

    @Override
    public Aluno getAluno(String nome) throws Exception {
        if(nome.isBlank()){
            throw new AlunoException("Nome invalido");
        }
        Aluno a=getDAO().getAluno(nome);
        if(a==null){
            throw new AlunoException("Nome invalido");
        }
        return a;
    }

    
}
