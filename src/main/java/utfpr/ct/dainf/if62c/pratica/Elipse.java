/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import static java.lang.Math.sqrt;

/**
 *
 * @author Cliente
 */
public class Elipse implements FiguraComEixos {
    private double r;
    private double s;
    public Elipse(double r,double s){
        this.r=r;
        this.s=s;
    }
    public double getArea(){
        return Math.PI*getEixoMaior()*getEixoMenor();
    }
    public double getPerimetro(){
        return Math.PI*(3*(getEixoMaior()+getEixoMenor())-(sqrt((3*getEixoMaior()+getEixoMenor())*(getEixoMaior()+3*getEixoMenor()))));
    }
    /**
     * @return the r
     */
    public double getEixoMaior() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     * @return the s
     */
    public double getEixoMenor() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(double s) {
        this.s = s;
    }
    public String getNome() {
        return this.getClass().getSimpleName();
    }
    
}
