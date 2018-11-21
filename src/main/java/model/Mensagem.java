package model;

import java.util.Date;

public class Mensagem {
    
    private String codProfessor; 
    private String codTurma; 
    private String mensagem; 
    private Date data;
    private String titulo;

    public Mensagem(String codProfessor, String codTurma, String mensagem, Date data, String titulo) {
        this.codProfessor = codProfessor;
        this.codTurma = codTurma;
        this.mensagem = mensagem;
        this.data = data;
        this.titulo = titulo;
    }

    public Mensagem() {
    }

    public String getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(String codProfessor) {
        this.codProfessor = codProfessor;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
            
    
}
