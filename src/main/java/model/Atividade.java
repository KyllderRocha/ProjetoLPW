package model;
 
import java.util.Date;

public class Atividade {
 
    private String nome;
    private String bimestre;
    private int peso;
    private double notaMAx;
    private double nota;
    private Date data;

    public Atividade(String nome, String bimestre, int peso, double notaMAx, double nota, Date data) {
        this.nome = nome;
        this.bimestre = bimestre;
        this.peso = peso;
        this.notaMAx = notaMAx;
        this.nota = nota;
        this.data = data;
    }

    public Atividade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getNotaMAx() {
        return notaMAx;
    }

    public void setNotaMAx(double notaMAx) {
        this.notaMAx = notaMAx;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
    
}
