/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.jakartatemplate;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "loginController")
@SessionScoped
@Data
public class LoginController implements Serializable {

    // <editor-fold defaultstate="collapsed" desc="fields)">
    private static final long serialVersionUID = 1L;
    private String username;
    // </editor-fold>
    /**
     * Creates a new instance of LoginController
     */
    public LoginController() {
    }
    
}
