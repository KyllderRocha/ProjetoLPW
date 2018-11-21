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
import model.Professor;

/**
 *
 * @author netoa
 */
@ManagedBean(name="cadProfessor")
@RequestScoped
public class ProfessorBean {

    /**
     * Creates a new instance of ProfessorBean
     */
    private List<Professor> professores = new ArrayList<>();
    private Professor professor;
    
    public ProfessorBean() {
        this.professor = new Professor();
    }
    
    public void cadastraProfessor(Professor professor){
        professores.add(professor);
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
    
    
    
}
