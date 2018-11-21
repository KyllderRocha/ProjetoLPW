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
import model.Aluno;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class AlunoBean {

    /**
     * Creates a new instance of AlunoBean
     */
    
    private List<Aluno> alunos = new ArrayList<>();
    private Aluno aluno;
    
    public AlunoBean() {
        aluno = new Aluno();
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
}
