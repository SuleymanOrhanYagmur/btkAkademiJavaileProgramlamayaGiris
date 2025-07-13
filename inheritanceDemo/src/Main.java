public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        //ogretmenKrediManager.Hesapla(); // Base den extends edilmiş özellik
        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager());

        
        KrediUI krediUIAskerIcin = new KrediUI();
        krediUIAskerIcin.KrediHesapla(new AskerKrediManager());

    }
}
