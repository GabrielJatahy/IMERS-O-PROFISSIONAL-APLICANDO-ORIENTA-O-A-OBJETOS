public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Gabriel Jatahy", "2025001", "Ciência da Computação");
        Professor professor = new Professor("Ana Paula", "Banco de Dados", "PROF123");
        Curso curso = new Curso("Engenharia de Software", "ESW001", 360);

        System.out.println(aluno);
        System.out.println(professor);
        System.out.println(curso);

        // alterando curso do aluno
        aluno.setCurso("Engenharia de Software");
        System.out.println("Curso atualizado do aluno: " + aluno.getCurso());
    }
}
