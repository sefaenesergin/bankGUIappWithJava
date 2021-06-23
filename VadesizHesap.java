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
public class VadesizHesap extends BankaHesabi {

    private String hesapTuru = "vadesiz";

    public VadesizHesap(double bakiye) {
        super(bakiye);
    }
    
    
   

    public boolean paraTransferi(String alanHesap, String gonderenHesap, double miktar) {
        if (miktar > bakiye) {
            return false;
        } else {
            bakiye = bakiye - (miktar);
        }
        return false;
    }

    public void krediKartiBorcOdeme(String kartBilgisi, double odenecekMiktar) {

    }

    @Override
    public String toString() {
        return (super.toString() + "");
    }

    /**
     * @return the hesapTuru
     */
    public String getHesapTuru() {
        return hesapTuru;
    }

    /**
     * @param hesapTuru the hesapTuru to set
     */
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

}
