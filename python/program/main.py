from Shirt import Shirt

def print_table_line(length):
    print("|" + "-" * length + "|")

def display_shirts_with_all_parent_class(shirt_list):
    max_lengths = {
        "id_product": len("ID Produk"),
        "name": len("Nama"),
        "brand": len("Merk"),
        "price": len("Harga"),
        "size": len("Ukuran"),
        "material": len("Material"),
        "gender": len("Gender"),
        "color": len("Warna"),
        "sleeve_type": len("Tipe Lengan")
    }

    for shirt in shirt_list:
        max_lengths["id_product"] = max(max_lengths["id_product"], len(shirt.get_id_product()))
        max_lengths["name"] = max(max_lengths["name"], len(shirt.get_name()))
        max_lengths["brand"] = max(max_lengths["brand"], len(shirt.get_brand()))
        max_lengths["price"] = max(max_lengths["price"], len(f"{shirt.get_price():.2f}"))
        max_lengths["size"] = max(max_lengths["size"], len(shirt.get_size()))
        max_lengths["material"] = max(max_lengths["material"], len(shirt.get_material()))
        max_lengths["gender"] = max(max_lengths["gender"], len(shirt.get_gender()))
        max_lengths["color"] = max(max_lengths["color"], len(shirt.get_color()))
        max_lengths["sleeve_type"] = max(max_lengths["sleeve_type"], len(shirt.get_sleeve_type()))

    total_length = sum(max_lengths.values()) + 8
    print_table_line(total_length)

    header_format = "|" + "|".join(f"%-{max_lengths[field]}s" for field in ["id_product", "name", "brand", "price", "size", "material", "gender", "color", "sleeve_type"]) + "|"
    print(header_format % ("ID Produk", "Nama", "Merk", "Harga", "Ukuran", "Material", "Gender", "Warna", "Tipe Lengan"))
    print_table_line(total_length)

    for shirt in shirt_list:
        print(header_format % (
            shirt.get_id_product(),
            shirt.get_name(),
            shirt.get_brand(),
            f"{shirt.get_price():.2f}",
            shirt.get_size(),
            shirt.get_material(),
            shirt.get_gender(),
            shirt.get_color(),
            shirt.get_sleeve_type()
        ))
    print_table_line(total_length)

def main():
    shirt_list = []
    shirt_list = Shirt.create_shirts(Shirt)
    display_shirts_with_all_parent_class(shirt_list)

if __name__ == "__main__":
    main()
