#include <iostream>
#include <vector>
#include <string>
#include "Clothing.cpp"

using namespace std;

class Shirt : public Clothing {
private:
    string color;
    string sleeveType;

public:
    Shirt() : Clothing("", "", "", 0.0, "", "", "") {
    }

    Shirt(string idProduct, string name, string brand, double price, string size, string material, string gender, string color, string sleeveType)
    : Clothing(idProduct, name, brand, price, size, material, gender), color(color), sleeveType(sleeveType) {
    }

    string getColor() const {
        return color;
    }

    string getSleeveType() const {
        return sleeveType;
    }

    void setColor(const string& cl) {
        color = cl;
    }

    void setSleeveType(const string& sl) {
        sleeveType = sl;
    }

    static vector<Shirt> createShirts() {
        vector<Shirt> shirtList;
        int numShirts;
        cout << "Berapa banyak kemeja yang ingin Anda input? ";
        cin >> numShirts;

        for (int i = 0; i < numShirts; ++i) {
            cout << "\nInput Kemeja " << (i + 1) << ":" << endl;
            Shirt shirt;
            string input;

            cout << "ID Produk: ";
            cin >> input;
            shirt.setIdProduct(input);

            cout << "Nama: ";
            cin >> input;
            shirt.setName(input);

            cout << "Merk: ";
            cin >> input;
            shirt.setBrand(input);

            cout << "Harga: ";
            cin >> input;
            shirt.setPrice(stod(input));

            cout << "Ukuran: ";
            cin >> input;
            shirt.setSize(input);

            cout << "Material: ";
            cin >> input;
            shirt.setMaterial(input);

            cout << "Gender: ";
            cin >> input;
            shirt.setGender(input);

            cout << "Warna: ";
            cin >> input;
            shirt.setColor(input);

            cout << "Tipe Lengan: ";
            cin >> input;
            shirt.setSleeveType(input);

            shirtList.push_back(shirt);
            cout << "Kemeja berhasil ditambahkan.\n";
        }

        return shirtList;
    }


    ~Shirt() {
    }
};
