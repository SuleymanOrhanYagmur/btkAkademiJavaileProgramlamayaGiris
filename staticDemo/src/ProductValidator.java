public class ProductValidator {
    static {
        System.out.println("Yapıcı blog çalıştı");
    }
    public ProductValidator(){
        System.out.println("Static Yapıcı blog çalıştı");
    }
    //bir ürünü kaydederken güncellerken kurallara uygun olup olmadığını anlamak için kullanırız.
    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;

        } else {
            return false;

        }
    }
    public void bisey(){


    }
    public static class BaskaBirClass {
        public static void Sil(){

        }
    }

}
