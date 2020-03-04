/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.eci.cvds.servlet;

/**
 *
 * @author andres.gonzalez-ca
 */

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




@ManagedBean(name = "guessBean")
@SessionScoped
public class BackingBean{
    
    private int num;
    private int intentos;
    private int acum;
    private String estado;
    private ArrayList listIntentos;

    public BackingBean() {
        listIntentos=new ArrayList();
        num = (int)(Math.random()*10+1);
        intentos=0;
        acum=100000;
        estado="No ha ganado";
    }


    
    
    public void guess(int inte){
        if(("No ha ganado").equals(estado)){
            if(inte == this.num){
                estado="Gano "+acum;
            }else{
                acum-=10000;
                intentos+=1;
                listIntentos.add(inte);
            }
        }
        
    }
    public void restart(){
        intentos=0;
        acum=100000;
        listIntentos.clear();
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

    public ArrayList getListIntentos() {
        return listIntentos;
    }

    public void setListIntentos(ArrayList listIntentos) {
        this.listIntentos = listIntentos;
    }
    
    
  
    
    
   
    
}
