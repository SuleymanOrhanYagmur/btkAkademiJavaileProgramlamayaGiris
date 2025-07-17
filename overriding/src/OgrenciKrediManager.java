public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar) { //hesaplayı aynı imzayla yazdığımız için bu çalışıyor overriding burda oluyor

        return  tutar * 1.08;

    }
}
