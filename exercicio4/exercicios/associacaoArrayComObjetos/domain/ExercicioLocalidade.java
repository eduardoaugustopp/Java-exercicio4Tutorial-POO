package com.java.intermediario.associacaoArrayComObjetos.domain;

public class ExercicioLocalidade {
    private String endereco;
    private ExercicioSeminario seminario;
    private ExercicioSeminario[] seminarios;

    public ExercicioLocalidade(String endereco) {
        this.endereco = endereco;
    }

    public ExercicioLocalidade(String endereco, ExercicioSeminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public ExercicioLocalidade(String endereco, ExercicioSeminario[] seminarios) {
        this.endereco = endereco;
        this.seminarios = seminarios;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ExercicioSeminario getSeminario() {
        return this.seminario;
    }

    public void setSeminario(ExercicioSeminario seminario) {
        this.seminario = seminario;
    }

    public ExercicioSeminario[] getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(ExercicioSeminario[] seminarios) {
        this.seminarios = seminarios;
    }

}