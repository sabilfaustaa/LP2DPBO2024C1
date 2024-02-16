class Clothing extends Product {
    protected String size;
    protected String material;
    protected String gender;

    public Clothing(String idProduct, String name, String brand, double price, String size, String material, String gender) {
        super(idProduct, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public String getGender() {
        return gender;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
