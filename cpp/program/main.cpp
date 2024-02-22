#include <iostream>
#include <vector>
#include <string>
#include "Shirt.cpp"

using namespace std;

void printTableLine(const vector<int>& columnWidths) {
    cout << "|";
    for (auto width : columnWidths) {
        cout << string(width + 3, '-');
    }
    cout << "|";
    cout << endl;
}

void displayShirts(const vector<Shirt>& shirts) {
    vector<string> headers = {"ID Produk", "Nama", "Merk", "Harga", "Ukuran", "Material", "Gender", "Warna", "Tipe Lengan"};
    vector<int> columnWidths(headers.size(), 0);

    for (const auto& shirt : shirts) {
        vector<string> values = {
            shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), to_string(shirt.getPrice()),
            shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType()
        };
        
        for (size_t i = 0; i < values.size(); ++i) {
            if (values[i].length() > columnWidths[i]) {
                columnWidths[i] = values[i].length();
            }
        }
    }

    for (size_t i = 0; i < headers.size(); ++i) {
        if (headers[i].length() > columnWidths[i]) {
            columnWidths[i] = headers[i].length();
        }
    }

    printTableLine(columnWidths);
    cout << "|  ";
    for (size_t i = 0; i < headers.size(); ++i) {
        cout << left << headers[i] << string(columnWidths[i] - headers[i].length() + 1, ' ') << "| ";
    }
    cout << endl;
    printTableLine(columnWidths);

    for (const auto& shirt : shirts) {
        vector<string> values = {
            shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), to_string(shirt.getPrice()),
            shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType()
        };
        
        cout << "|  ";
        for (size_t i = 0; i < values.size(); ++i) {
            cout << left << values[i] << string(columnWidths[i] - values[i].length() + 1, ' ') << "| ";
        }
        cout << endl;
    }
    printTableLine(columnWidths);
}

int main() {
    vector<Shirt> shirtList;   
    shirtList = Shirt::createShirts();

    displayShirts(shirtList);

    return 0;
}
