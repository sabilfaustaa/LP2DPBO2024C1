<?php

require_once("Clothing.php");

class Shirt extends Clothing {
    private $color;
    private $sleeveType;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType) {
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color;
        $this->sleeveType = $sleeveType;
    }

    public function getColor() {
        return $this->color;
    }

    public function getSleeveType() {
        return $this->sleeveType;
    }

    public function setColor($color) {
        $this->color = $color;
    }

    public function setSleeveType($sleeveType) {
        $this->sleeveType = $sleeveType;
    }

    public static function createShirts() {
        $shirts = [];
        $numShirts = readline("Berapa banyak kemeja yang ingin Anda buat? ");

        for ($i = 0; $i < $numShirts; $i++) {
            echo "Input Kemeja " . ($i + 1) . ":\n";
            $idProduct = readline("ID Produk: ");
            $name = readline("Nama: ");
            $brand = readline("Merk: ");
            $price = readline("Harga: ");
            $size = readline("Ukuran: ");
            $material = readline("Material: ");
            $gender = readline("Gender: ");
            $color = readline("Warna: ");
            $sleeveType = readline("Tipe Lengan: ");

            $shirt = new Shirt($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType);
            array_push($shirts, $shirt);
            echo "Kemeja berhasil ditambahkan.\n";
        }

        return $shirts;
    }
}

?>
