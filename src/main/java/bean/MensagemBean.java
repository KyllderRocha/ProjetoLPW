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
import model.Mensagem;

/**
 *
 * @author netoa
 */
@ManagedBean
@RequestScoped
public class MensagemBean {

    /**
     * Creates a new instance of MensagemBean
     */
    
    private List<Mensagem> mensagens = new ArrayList<>();
    private Mensagem mensagem;
    
    public MensagemBean() {
        mensagem = new Mensagem();
    }
    
}
