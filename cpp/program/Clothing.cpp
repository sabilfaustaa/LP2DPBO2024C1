#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

class Clothing : public Product {
private:
    string size;
    string material;
    string gender;

public:
    Clothing(string idProduct, string name, string brand, double price, string size, string material, string gender)
    : Product(idProduct, name, brand, price), size(size), material(material), gender(gender) {
    }

    string getSize() const {
        return size;
    }

    string getMaterial() const {
        return material;
    }

    string getGender() const {
        return gender;
    }

    void setSize(const string& sz) {
        size = sz;
    }

    void setMaterial(const string& mt) {
        material = mt;
    }

    void setGender(const string& gd) {
        gender = gd;
    }

    ~Clothing() {
    }
};
