class Product {
    protected String idProduct;
    protected String name;
    protected String brand;
    protected double price;

    public Product(String idProduct, String name, String brand, double price) {
        this.idProduct = idProduct;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setIdProduct (String idProduct) {
        this.idProduct = idProduct;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public void setPrice (double price) {
        this.price = price;
    }
}