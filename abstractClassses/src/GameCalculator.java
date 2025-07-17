public abstract class GameCalculator {
    public abstract void hesapla();
//normal classtan farkı hesapla nın içini boş bırakıp hangi class extend ederse hesapla operasyonunu override etmesini zorunlu kılıyoruz
    //abstract class bu işe yarıyor
    public final void gameOver(){
        System.out.println("Oyun bitti");
    } // game over operasyonu final kelimesi ile içini değiştiremiyorsun kullanmak istiyorsan final sayesinde aynen kullanman lazım demek oluyor
}
