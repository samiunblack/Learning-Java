public class Store {
    
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    public Store(String product, int count, double price){
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    public void makeCookie(){
        System.out.println("Made 1 cookie");
        inventoryCount++;
    }

    public static void main(String[] args)
    {
        Store cookiesStore = new Store("🍪", 45, 3.75);
        
        System.out.println("The store has total $"  + 
        cookiesStore.inventoryCount * cookiesStore.inventoryPrice + 
        " equivalent " + cookiesStore.productType);

        cookiesStore.makeCookie();
        System.out.println("Total cookies " + cookiesStore.inventoryCount);
    }
}
