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
public class YatirimHesabi extends BankaHesabi {

    private String hesapTuru = "yatirim";
    

    public YatirimHesabi(double bakiye) {
        super(bakiye);
    }

    public double paraCek(double miktar) {
        if (miktar > bakiye) {
            return Double.NaN;
        } else {
            bakiye = bakiye - miktar;
        }
        return bakiye;
    }

    public void paraEkle(double miktar) {
        bakiye = bakiye + miktar;

    }



    @Override
    public String toString() {
        return (super.toString() + "");
    }

}
