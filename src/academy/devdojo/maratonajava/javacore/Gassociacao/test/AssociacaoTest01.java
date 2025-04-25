package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua teste");
        Aluno aluno = new Aluno("Cleber", 18);
        Professor professor = new Professor("Rufus", "Pendrive");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Bootavel", alunosParaSeminario, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.imprime();
    }
}
