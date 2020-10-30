package Class;

/**
 *
 * @author Juan_K
 */
public class products_and_price {
    private String product;
    private double price;
    
    public products_and_price(){
        
    }
    public products_and_price(String product, double price) {
        this.product = product;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Object[] getinfo(){
        Object[] inf = new Object[2];
        inf[0] = this.product;
        inf[1] = this.price;
        return inf;
    }
}
