public class BaseKrediManager {
    public  double hesapla(double tutar) {
    //public final double hesapla(double tutar)  Eğer yazdığın methodu extend edenler methodu değiştiremesin istiyorsan bu şekilde final yazarak
    //yalnızca senin yazdığın şekilde kalmasını sağlayabilirsin
        return  tutar * 1.18;

    }
}
