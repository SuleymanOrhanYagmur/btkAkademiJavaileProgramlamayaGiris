public class Product {

    public Product (int id, String name, String description,double price, int stockAmount,String renk){
        System.out.println("Yapıcı blog çalıştı");
        this.id = id ;
        this.renk = renk;
        this.name = name;
        this.price  = price;
        this.description = description;

    }
    public Product (){ // overloading aşırı yükleme deniyor Product classının 1 parametreli 1 parametresiz classı var istediği şekilde çalışabilir diyoruz

    }
    //Attribute /field
    //private sadece tanımlandığı blogta geçerlidir.
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId() { // ürünün id sini değiştiremez ama bu sayede okuyabilir
        return id;
    }

    //setter
    public void setId(int id) {
        id = id;//_ ile olanlar field attribute yani
        //this.id = id;  //this.id demek bu classın id si demek, diğeride productun id si
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0, 1) + id;

    }

}



