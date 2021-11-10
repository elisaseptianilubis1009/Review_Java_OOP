/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package review_java_oop.belajar.SuperConstructor;

/**
 *
 * @author admin
 */
public class Butterfly extends Animals{
    
    private String simbiosis;

    public String getSimbiosis() {
        return simbiosis;
    }

    public void setSimbiosis(String simbiosis) {
        this.simbiosis = simbiosis;
    }

  
    public Butterfly(String simbiosis){
        super(simbiosis);
        this.simbiosis=simbiosis;
    }
    
    public Butterfly(){
        super("serangga");
    }
    
}
