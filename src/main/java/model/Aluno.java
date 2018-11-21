package model;

import java.util.Date;

public class Aluno {
   
    private String nome;
    private String CPF;
    private String matricula;
    private Date dt_nascimento;
    private String Responsavel;
    private String telefone;
    private String foto;
    private String login;
    private String senha;
    private String email;

    public Aluno() {
    }
    
    public Aluno(String nome, String CPF, String matricula, Date dt_nascimento, String Responsavel, String telefone, String foto, String login, String senha, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
        this.dt_nascimento = dt_nascimento;
        this.Responsavel = Responsavel;
        this.telefone = telefone;
        this.foto = foto;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public String getResponsavel() {
        return Responsavel;
    }

    public void setResponsavel(String Responsavel) {
        this.Responsavel = Responsavel;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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
