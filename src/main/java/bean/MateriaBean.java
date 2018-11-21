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
import model.Materia;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class MateriaBean {

    /**
     * Creates a new instance of MateriaBean
     */
    
    private List<Materia> materias = new ArrayList<>();
    private Materia materia;
    
    public MateriaBean() {
        materia = new Materia();
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    
    
    
}
