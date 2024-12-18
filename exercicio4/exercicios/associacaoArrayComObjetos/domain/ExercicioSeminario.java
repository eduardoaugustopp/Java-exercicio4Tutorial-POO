package com.java.intermediario.associacaoArrayComObjetos.domain;

public class ExercicioSeminario {
    private String titulo;
    private ExercicioLocalidade local;
    private ExercicioProfessor professor;
    private ExercicioProfessor[] professores;
    private ExercicioAluno aluno;
    private ExercicioAluno[] alunos;
    
    
    public ExercicioSeminario(String titulo, ExercicioLocalidade local, ExercicioProfessor professor) {
        this.titulo = titulo;
        this.local = local;
        this.professor = professor;
    }

    public ExercicioSeminario(String titulo, ExercicioLocalidade local, ExercicioProfessor[] professores) {
        this.titulo = titulo;
        this.local = local;
        this.professores = professores;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ExercicioLocalidade getLocal() {
        return this.local;
    }

    public void setLocal(ExercicioLocalidade local) {
        this.local = local;
    }

    public ExercicioProfessor getProfessor() {
        return this.professor;
    }

    public void setProfessor(ExercicioProfessor professor) {
        this.professor = professor;
    }

    public ExercicioProfessor[] getProfessores() {
        return this.professores;
    }

    public void setProfessores(ExercicioProfessor[] professores) {
        this.professores = professores;
    }

    public ExercicioAluno getAluno() {
        return this.aluno;
    }

    public void setAluno(ExercicioAluno aluno) {
        this.aluno = aluno;
    }

    public ExercicioAluno[] getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ExercicioAluno[] alunos) {
        this.alunos = alunos;
    }

}