public class Aluno {
    private String nome;

    private int nota1;
    private int nota2;
    private int nota3;
    private int media;

    private static Aluno aluno;

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return this.nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getMedia() {
        return this.media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    // private Aluno(String nome){
    //     this.nome=nome;
    // }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    ////////////////////// Static Frabic Methods \\\\\\\\\\\\\\\\\\

    public static Aluno CriaNome(String nome) {
        if (aluno != null) {
            aluno.setNome(nome);
        }
        return aluno;
    }

    public static Aluno CriaNomeNota1(String nome,int nota1) {
        if (aluno != null) {
            aluno.setNome(nome);
            aluno.setNota1(nota1);
        }
        return aluno;
    }

    public static Aluno CriaNomeNota2(String nome,int nota2) {
        if (aluno != null) {
            aluno.setNome(nome);
            aluno.setNota2(nota2);
        }
        return aluno;
    }

    public static Aluno CriaNomeNota3(String nome,int nota3) {
        if (aluno != null) {
            aluno.setNome(nome);
            aluno.setNota3(nota3);
        }
        return aluno;
    }

    public static Aluno CriaNomeNotas(String nome,int nota1,int nota2,int nota3){
        if(aluno!=null){
            aluno.setNome(nome);
            aluno.setNota1(nota1);
            aluno.setNota2(nota2);
            aluno.setNota3(nota3);
        }
        return aluno;
    }


}
