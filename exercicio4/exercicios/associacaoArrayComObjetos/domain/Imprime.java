package com.java.intermediario.associacaoArrayComObjetos.domain;

public class Imprime {
    
    public void imprimeRelatorio(ExercicioSeminario seminario) {
        System.out.println();
        System.out.println("Seminario: "+seminario.getTitulo());
        System.out.println("- Local: "+seminario.getLocal().getEndereco());
        
        // imprime Professores
        if (seminario.getProfessores() == null) {
            System.out.print("- Palestrante: Prof. "+seminario.getProfessor().getNome());
            System.out.println(", "+seminario.getProfessor().getEspecialidade());
        } else {
            for (ExercicioProfessor exercicioProfessor : seminario.getProfessores()) {
                System.out.print("- Palestrante: Prof. "+exercicioProfessor.getNome());
                System.out.println(", "+exercicioProfessor.getEspecialidade());
            }
        }
        
        // imprime Alunos
        System.out.println("- Alunos inscritos: ");
        if (seminario.getAluno() != null || seminario.getAlunos() != null) {
            if (seminario.getAluno() != null) {
                System.out.print("-- "+seminario.getAluno().getNome());
                System.out.println(", "+seminario.getAluno().getIdade()+" anos");
            } 
            if (seminario.getAlunos() != null) {
                for (ExercicioAluno exercicioAluno : seminario.getAlunos()) {
                    System.out.print("-- "+exercicioAluno.getNome());
                    System.out.println(", "+exercicioAluno.getIdade()+" anos");
                }           
            } 
        } else {
            System.out.println("- Nao houve inscricao de alunos.");
            return;
        }        
    }

    public void imprimeSeminario(ExercicioSeminario... seminario) {
        int aux = 0;
        for (ExercicioSeminario exercicioSeminario : seminario) {
            System.out.print(++aux+". ");
            System.out.println(exercicioSeminario.getTitulo());
        }
    }
    

    public void imprimeLocalidade(ExercicioLocalidade... local) {
        int aux = 0;
        for (ExercicioLocalidade exercicioLocalidade : local) {
            System.out.print(++aux+". ");
            System.out.println(exercicioLocalidade.getEndereco());            
        }
    }

    public void imprimeProfessor(ExercicioProfessor... professor) {
        int aux = 0;
        for (ExercicioProfessor exercicioProfessor : professor) {
            System.out.print(++aux+". ");
            System.out.print(exercicioProfessor.getNome()+", especialista em ");
            System.out.println(exercicioProfessor.getEspecialidade());
        }
    }

    public void imprimeAluno(ExercicioAluno... aluno) {
        int aux = 0;
        for (ExercicioAluno exercicioAluno : aluno) {
            System.out.print(++aux+". ");
            System.out.print(exercicioAluno.getNome()+", ");
            System.out.println(exercicioAluno.getIdade());
        }
    }
}