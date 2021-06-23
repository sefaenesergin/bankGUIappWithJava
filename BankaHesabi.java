/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaodevi;

/**
 *
 * @author 123
 */
import java.util.ArrayList;

public class BankaHesabi  {
    double ıbanYapici = Math.random() * 100;
    private double iban=ıbanYapici;
    double bakiye;
    
    public BankaHesabi( double bakiye) {

       
        this.bakiye = bakiye;
    }

   
    @Override
    public String toString() {
        return (super.toString() + "bakiye miktari\n   no: " + getBakiye());
    }

    /**
     * @return the iban
     */
    public double getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    public void setIban(double iban) {
        this.iban = iban;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

}
