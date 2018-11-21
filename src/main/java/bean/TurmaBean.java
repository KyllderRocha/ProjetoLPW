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
import model.Turma;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class TurmaBean {

    /**
     * Creates a new instance of TurmaBean
     */
    private List<Turma> turmas = new ArrayList<>();
    private Turma turma;
    
    public TurmaBean() {
        turma = new Turma();
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    
    
}
