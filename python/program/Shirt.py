from Clothing import Clothing

class Shirt(Clothing):
    def __init__(self, id_product, name, brand, price, size, material, gender, color, sleeve_type):
        super().__init__(id_product, name, brand, price, size, material, gender)
        self.color = color
        self.sleeve_type = sleeve_type

    def get_color(self):
        return self.color

    def get_sleeve_type(self):
        return self.sleeve_type

    def set_color(self, color):
        self.color = color

    def set_sleeve_type(self, sleeve_type):
        self.sleeve_type = sleeve_type

    def create_shirts(cls):
        shirt_list = []
        num_shirts = int(input("Berapa banyak kemeja yang ingin Anda input? "))
        for i in range(num_shirts):
            print(f"\nInput Kemeja {i + 1}:")
            shirt = cls("", "", "", 0, "", "", "", "", "")
            shirt.set_id_product(input("ID Produk: "))
            shirt.set_name(input("Nama: "))
            shirt.set_brand(input("Merk: "))
            shirt.set_price(float(input("Harga: ")))
            shirt.set_size(input("Ukuran: "))
            shirt.set_material(input("Material: "))
            shirt.set_gender(input("Gender: "))
            shirt.set_color(input("Warna: "))
            shirt.set_sleeve_type(input("Tipe Lengan: "))
            shirt_list.append(shirt)
            print("Kemeja berhasil ditambahkan.")
        return shirt_list