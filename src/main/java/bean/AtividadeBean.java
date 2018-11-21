/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Atividade;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class AtividadeBean {

    /**
     * Creates a new instance of AtividadeBean
     */
    
    private List<Atividade> atividades = new ArrayList<>();
    private Atividade atividade;
    
    public AtividadeBean() {
        atividade = new Atividade();
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    
    
}
