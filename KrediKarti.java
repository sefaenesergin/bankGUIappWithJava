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
public class KrediKarti  {
    
    
    private int kartNumarasi;
    private double limit;
    
    private double guncelBorc=150;
    private int kullanılabilirLimit;

    public KrediKarti( double limit, double guncelBorc) {
        this.limit=limit;
        this.guncelBorc=guncelBorc;
        
    }

 
       @Override
     public String toString(){
        return (super.toString()+"limit miktari\n   no: " + getLimit()+ "guncel borc miktari \n"+ getGuncelBorc());
    }

    /**
     * @return the kartNumarasi
     */
    public int getKartNumarasi() {
        return kartNumarasi;
    }

    /**
     * @param kartNumarasi the kartNumarasi to set
     */
    public void setKartNumarasi(int kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    /**
     * @return the limit
     */
    public double getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * @return the guncelBorc
     */
    public double getGuncelBorc() {
        return  guncelBorc;
    }

    /**
     * @param guncelBorc the guncelBorc to set
     */
    public void setGuncelBorc(double guncelBorc) {
        this.guncelBorc = guncelBorc;
    }

    /**
     * @return the kullanılabilirLimit
     */
    public int getKullanılabilirLimit() {
        return kullanılabilirLimit;
    }

    /**
     * @param kullanılabilirLimit the kullanılabilirLimit to set
     */
    public void setKullanılabilirLimit(int kullanılabilirLimit) {
        this.kullanılabilirLimit = kullanılabilirLimit;
    }
    
    
    
}
