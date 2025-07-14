public class Main {
    public static void main(String[] args) {
        //Polimorphism Çok biçimlilik demek, Referans tiplerin birbirinin referansını tutması itibariyle olan durum (inheritance varsa aralarında)
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(),new ConsoleLogger()};
        // Aslında FileLoger bir BaseLogger, EmailLogger bir Baselogger olduğu için böyle kullanabiliyoruz hepsinin babası bu o yüzden verebiliyoruz
        // Her biri farklı iş yapan ama her biri Base Logger olan 3 eleman ekledik

        for (BaseLogger logger: loggers )
        //Loggers herşey olavilir, filelogger baseloggeri tutamaz, ama baselogger istediği her özelliği tutabilir anne görevi görüyo hepsini inherite etmiş
        {
            logger.Log("Log Mesajı");
        }
    }
}
