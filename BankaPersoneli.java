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
public class BankaPersoneli extends Kisi {
    
    private int personelID=100425596;
    
    
    private ArrayList<Musteri> musteriler;
    
    
    public BankaPersoneli(String ad, String soyAd, String eMail, int telefonNumarasi, int personelID) {
        super(ad, soyAd, eMail, telefonNumarasi);
        this.personelID=personelID;
        musteriler= new ArrayList<Musteri>();
        
    }
    
    
    
    
    
     public String toString(){
        return (super.toString()+"personel id  no: " +getPersonelID()+"musteriler???: \n");
    }

    /**
     * @return the personelID
     */
    public int getPersonelID() {
        return personelID;
    }

    /**
     * @param personelID the personelID to set
     */
    public void setPersonelID(int personelID) {
        this.personelID = personelID;
    }

    /**
     * @return the musteriler
     */
    public ArrayList<Musteri> getMusteriler() {
        return musteriler;
    }

    /**
     * @param musteriler the musteriler to set
     */
    public void setMusteriler(ArrayList<Musteri> musteriler) {
        this.musteriler = musteriler;
    }
}
