package model;

import java.util.ArrayList;
import java.util.Date;

public class Professor {
    
    private String nome;
    private String cpf;
    private String matricula;
    private Date dt_nascimento;
    private ArrayList<Turma> turma;
    private ArrayList<Materia> materia;
    private String nivelFormacao;
    private String horasAula;
    private String telefone;
    private String foto;
    private String senha;
    private String email;

    public Professor(){
    }

    public Professor(String nome, String cpf, String matricula, Date dt_nascimento, ArrayList<Turma> turma, ArrayList<Materia> materia, String nivelFormacao, String horasAula, String telefone, String foto, String senha, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dt_nascimento = dt_nascimento;
        this.turma = turma;
        this.materia = materia;
        this.nivelFormacao = nivelFormacao;
        this.horasAula = horasAula;
        this.telefone = telefone;
        this.foto = foto;
        this.senha = senha;
        this.email = email;
    }
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(Date dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public ArrayList<Turma> getTurma() {
        return turma;
    }

    public void setTurma(ArrayList<Turma> turma) {
        this.turma = turma;
    }

    public ArrayList<Materia> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Materia> materia) {
        this.materia = materia;
    }

    public String getNivelFormacao() {
        return nivelFormacao;
    }

    public void setNivelFormacao(String nivelFormacao) {
        this.nivelFormacao = nivelFormacao;
    }

    public String getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(String horasAula) {
        this.horasAula = horasAula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
