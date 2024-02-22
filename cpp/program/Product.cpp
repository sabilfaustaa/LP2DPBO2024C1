#include <iostream>
#include <string>

using namespace std;

class Product {
private:
    string idProduct;
    string name;
    string brand;
    double price;

public:
    Product(string idProduct, string name, string brand, double price) {
        this->idProduct = idProduct;
        this->name = name;
        this->brand = brand;
        this->price = price;
    }

    string getIdProduct() const {
        return idProduct;
    }

    string getName() const {
        return name;
    }

    string getBrand() const {
        return brand;
    }

    double getPrice() const {
        return price;
    }

    void setIdProduct(const string& id) {
        idProduct = id;
    }

    void setName(const string& newName) {
        name = newName;
    }

    void setBrand(const string& newBrand) {
        brand = newBrand;
    }

    void setPrice(double newPrice) {
        price = newPrice;
    }

    ~Product() {

    }
};