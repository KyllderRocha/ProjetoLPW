/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lpw
 */
public class MaterialEstudo {
    
    private String codProfesor;
    private String codAluno;
    private ArrayList<String> arquivos;
    private Date data;

    public MaterialEstudo() {
    }

    public MaterialEstudo(String codProfesor, String codAluno, ArrayList<String> arquivos, Date data) {
        this.codProfesor = codProfesor;
        this.codAluno = codAluno;
        this.arquivos = arquivos;
        this.data = data;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    public ArrayList<String> getArquivos() {
        return arquivos;
    }

    public void setArquivos(ArrayList<String> arquivos) {
        this.arquivos = arquivos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}
