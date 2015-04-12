package Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Steffen
 */
public class Member {
    private String name;
    private int adm;
    private int ana;
    private int cre;
    private int fin;
    
    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d, %d", name, adm, ana, cre, fin);
    }
    
    
    
    

    public Member(String name, int adm, int ana, int cre, int fin) {
        this.name = name;
        this.adm = adm;
        this.ana = ana;
        this.cre = cre;
        this.fin = fin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdm() {
        return adm;
    }

    public void setAdm(int adm) {
        this.adm = adm;
    }

    public int getAna() {
        return ana;
    }

    public void setAna(int ana) {
        this.ana = ana;
    }

    public int getCre() {
        return cre;
    }

    public void setCre(int cre) {
        this.cre = cre;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}
