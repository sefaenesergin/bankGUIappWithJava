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
import java.util.Scanner;

import java.util.ArrayList;
public class Musteri extends Kisi {
    
    double doubleRandomNumber = Math.random() * 5;
    private int musteriNumarasi=(int) doubleRandomNumber;
    
   
    private ArrayList <BankaHesabi> hesaplar;
    private ArrayList <KrediKarti> krediKartlari;
    BankaHesabi sefa=new BankaHesabi(250); //parametresi bakiyesi
    
    KrediKarti enes=new KrediKarti(500,400); //parametreleri -> limit-güncel borç
    
    
    
    public Musteri(String ad, String soyAd, String eMail, int telefonNumarasi, int musteriNumarasi) {
        super(ad, soyAd, eMail, telefonNumarasi);
        this.musteriNumarasi=musteriNumarasi;
        hesaplar= new ArrayList<BankaHesabi> ();
        krediKartlari= new ArrayList<KrediKarti>();
        
        
    }

   
    
    
    
       
   public void hesapEkle(BankaHesabi m1){
       System.out.println("Vadesiz hesap mı yoksa Yatırım hesabı mı açmak istiyorsunuz? Vadesiz Hesap için 1, Yatırım Hesabı için 2'ye basın.");
       
       Scanner girdi=new Scanner(System.in);
       int sonuc=girdi.nextInt();
       
       if(sonuc==1){
           hesaplar.add(m1);// vadesiz hesap açıldı
       }else if(sonuc==2){
           hesaplar.add(m1);//yatırım hesabı açıldı.
       }
        //müşterinin açmak istediği hesap türüne göre bir parametre alacak.
        //ilgili sınıftan nesne oluşturup bunu hesaplar isimli arrayliste ekleyecek.
     
        
        
        
    }
    
    public void krediKartiEkle(KrediKarti k1){
        //kredikarti sınıfından bir nesne oluştur ve bunu kredikartlari isimli arrayliste ekle
        krediKartlari.add(k1);
        
        
        
    }
    
    
    
    public void hesapSil(BankaHesabi m1){
       
        
        //ilk bakiye kontrol et. bakiye büyükse başka hesaba aktar de. para sıfırda hesabı sil.  
        if(sefa.getBakiye()>0){
            System.out.println("Lütfen bakiyenizi başka bir hesaba aktarınız.");
        }else {
            System.out.println("hesap silindi");
            hesaplar.remove(m1);
            
       }
        
    }
    
    public void krediKartiSil(KrediKarti k1){
        //bu metot öncelikle  borcu kontrol etmeli.borç sıfırsa silmeli. değilse borç öde demeli
        if(     enes.getGuncelBorc()  >0 ) {
            System.out.println("Borcunuzu ödedikten sonra  kredi kartınızı silebilirsiniz.");
        } else {
            krediKartlari.remove(k1);
        }
    }
    
        @Override
     public String toString(){
        return (super.toString()+"musteri   no: " +getMusteriNumarasi());
    }

    /**
     * @return the musteriNumarasi
     */
    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    /**
     * @param musteriNumarasi the musteriNumarasi to set
     */
    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    /**
     * @return the hesaplar
     */
    public ArrayList <BankaHesabi> getHesaplar() {
        return hesaplar;
    }

    /**
     * @param hesaplar the hesaplar to set
     */
    public void setHesaplar(ArrayList <BankaHesabi> hesaplar) {
        this.hesaplar = hesaplar;
    }

    /**
     * @return the krediKartlari
     */
    public ArrayList <KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    /**
     * @param krediKartlari the krediKartlari to set
     */
    public void setKrediKartlari(ArrayList <KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }
    
    
    
}
