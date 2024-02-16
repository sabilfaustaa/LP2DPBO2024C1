import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printTableLine(int length) {
        System.out.print("|");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }
    
    public static void displayShirtsWithAllParentClass(ArrayList<Shirt> daftarKemeja) {
        int maxIdProductLength = "ID Produk".length();
        int maxNameLength = "Nama".length();
        int maxBrandLength = "Merk".length();
        int maxPriceLength = "Harga".length();
        int maxSizeLength = "Ukuran".length();
        int maxMaterialLength = "Material".length();
        int maxGenderLength = "Gender".length();
        int maxColorLength = "Warna".length();
        int maxSleeveTypeLength = "Tipe Lengan".length();

        for (Shirt shirt : daftarKemeja) {
            maxIdProductLength = Math.max(maxIdProductLength, shirt.getIdProduct().length());
            maxNameLength = Math.max(maxNameLength, shirt.getName().length());
            maxBrandLength = Math.max(maxBrandLength, shirt.getBrand().length());
            maxPriceLength = Math.max(maxPriceLength, String.format("%.2f", shirt.getPrice()).length());
            maxSizeLength = Math.max(maxSizeLength, shirt.getSize().length());
            maxMaterialLength = Math.max(maxMaterialLength, shirt.getMaterial().length());
            maxGenderLength = Math.max(maxGenderLength, shirt.getGender().length());
            maxColorLength = Math.max(maxColorLength, shirt.getColor().length());
            maxSleeveTypeLength = Math.max(maxSleeveTypeLength, shirt.getSleeveType().length());
        }
        
        int totalAllLength = maxIdProductLength + maxNameLength + maxBrandLength + maxPriceLength + maxSizeLength + maxMaterialLength + maxGenderLength + maxColorLength + maxSleeveTypeLength + 8;

        printTableLine(totalAllLength);

        System.out.printf("|%-" + maxIdProductLength + "s|%-" + maxNameLength + "s|%-" + maxBrandLength + "s|%-" +
                    maxPriceLength + "s|%-" + maxSizeLength + "s|%-" + maxMaterialLength + "s|%-" +
                    maxGenderLength + "s|%-" + maxColorLength + "s|%-" + maxSleeveTypeLength + "s|%n",
                    "ID Produk", "Nama", "Merk", "Harga", "Ukuran", "Material", "Gender", "Warna", "Tipe Lengan");

        printTableLine(totalAllLength);

        for (Shirt shirt : daftarKemeja) {
            System.out.printf("|%-" + maxIdProductLength + "s|%-" + maxNameLength + "s|%-" + maxBrandLength + "s|%" +
                    maxPriceLength + ".2f|%-" + maxSizeLength + "s|%-" + maxMaterialLength + "s|%-" +
                    maxGenderLength + "s|%-" + maxColorLength + "s|%-" + maxSleeveTypeLength + "s|%n",
                    shirt.getIdProduct(), shirt.getName(), shirt.getBrand(), shirt.getPrice(), shirt.getSize(),
                    shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType());
        }

        printTableLine(totalAllLength);
    }

    public static void main(String[] args) {
        ArrayList<Shirt> daftarKemeja = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        while (i < 3) {
            System.out.println("Input Kemeja " + (i+1) + " : ");

            System.out.print("ID Produk: ");
            String idProduct = scanner.nextLine();

            System.out.print("Nama: ");
            String name = scanner.nextLine();

            System.out.print("Merk: ");
            String brand = scanner.nextLine();

            System.out.print("Harga: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("Ukuran: ");
            String size = scanner.nextLine();

            System.out.print("Material: ");
            String material = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Warna: ");
            String color = scanner.nextLine();

            System.out.print("Tipe Lengan: ");
            String sleeveType = scanner.nextLine();

            Shirt shirt = new Shirt(idProduct, name, brand, price, size, material, gender, color, sleeveType);
            daftarKemeja.add(shirt);

            System.out.println("Kemeja " + (i+1) + " berhasil ditambahkan.\n");

            i++;
        }

        displayShirtsWithAllParentClass(daftarKemeja);

        scanner.close();
    }
}
