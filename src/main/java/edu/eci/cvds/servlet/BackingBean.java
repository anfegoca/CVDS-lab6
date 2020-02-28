/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.cvds.servlet;


import java.io.Serializable;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author andres.gonzalez-ca
 */


@ManagedBean(name = "guessBean")
@SessionScoped
public class BackingBean implements Serializable{
    
    private int num;
    private int intentos;
    private int acum;
    private String estado;

    public BackingBean() {
        restart();
    }


    
    
    public void guess(int num){
        if(num == this.num){
            estado="Gano "+acum;
        }else{
            acum-=10000;
            intentos+=1;
        }
        
    }
    public void restart(){
        num = (int)(Math.random()*10+1);
        intentos=0;
        acum=100000;
        estado="No ha ganado";
    }
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getAcum() {
        return acum;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
  
    
    
   
    
}
