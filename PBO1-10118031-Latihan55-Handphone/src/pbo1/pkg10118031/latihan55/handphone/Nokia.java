/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118031.latihan55.handphone;

/**
 *
 * @author Vendetta
 */
public class Nokia extends Handphone{
    
    private String wpKeyStore;

    public Nokia(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
    
    
    
    
}