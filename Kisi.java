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
public class Kisi {
    private String ad;
    private String soyAd;
    private String eMail;
    private int telefonNumarasi;
    
    public Kisi(String ad, String soyAd, String eMail, int telefonNumarasi){
        this.ad=ad;
        this.soyAd=soyAd;
        this.eMail=eMail;
        this.telefonNumarasi=telefonNumarasi;
        
    }
    
        @Override
     public String toString(){
        return("ad -"+ getAd()+ "\nsoyad - "+ getSoyAd()+ "\nemail - " + geteMail() + "tel no: \n" +getTelefonNumarasi());
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyAd
     */
    public String getSoyAd() {
        return soyAd;
    }

    /**
     * @param soyAd the soyAd to set
     */
    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    /**
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the telefonNumarasi
     */
    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }

    /**
     * @param telefonNumarasi the telefonNumarasi to set
     */
    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
    
}


