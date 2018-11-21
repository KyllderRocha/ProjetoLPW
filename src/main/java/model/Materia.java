package model;

public class Materia {
    
    private String nome;
    private String info;
    private String cargaHoraria;
    private String cod;

    public Materia(String nome, String info, String cargaHoraria, String cod) {
        this.nome = nome;
        this.info = info;
        this.cargaHoraria = cargaHoraria;
        this.cod = cod;
    }

    public Materia() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    
    
    
    
}
