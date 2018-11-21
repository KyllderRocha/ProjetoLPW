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
import model.MaterialEstudo;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class MaterialEstudoBean {

    /**
     * Creates a new instance of MaterialEstudoBean
     */
    
    private List<MaterialEstudo> materiais = new ArrayList<>();
    private MaterialEstudo material;
    
    public MaterialEstudoBean() {
        this.material = new MaterialEstudo();
    }

    public List<MaterialEstudo> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<MaterialEstudo> materiais) {
        this.materiais = materiais;
    }

    public MaterialEstudo getMaterial() {
        return material;
    }

    public void setMaterial(MaterialEstudo material) {
        this.material = material;
    }
    
    
    
}
