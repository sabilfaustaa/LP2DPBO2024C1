<?php
require_once("Shirt.php");

$shirtList = [];

function addShirt($shirtList, $idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType) {
    $newShirt = new Shirt($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeveType);
    array_push($shirtList, $newShirt);
    echo "Kemeja berhasil ditambahkan.<br><br>";

    return $shirtList;
}

function displayShirts($shirtList) {
    echo "<table border='1'>
            <tr>
                <th>ID Produk</th>
                <th>Nama</th>
                <th>Merk</th>
                <th>Harga</th>
                <th>Ukuran</th>
                <th>Material</th>
                <th>Gender</th>
                <th>Warna</th>
                <th>Tipe Lengan</th>
            </tr>";
    foreach ($shirtList as $shirt) {
        echo "<tr>
                <td>".$shirt->getIdProduct()."</td>
                <td>".$shirt->getName()."</td>
                <td>".$shirt->getBrand()."</td>
                <td>".$shirt->getPrice()."</td>
                <td>".$shirt->getSize()."</td>
                <td>".$shirt->getMaterial()."</td>
                <td>".$shirt->getGender()."</td>
                <td>".$shirt->getColor()."</td>
                <td>".$shirt->getSleeveType()."</td>
              </tr>";
    }
    echo "</table>";
}

$shirtList = addShirt($shirtList, "1", "Kemeja Flanel", "Uniqlo", 299.99, "M", "Katun", "Unisex", "Merah", "Panjang");
$shirtList = addShirt($shirtList, "2", "Kemeja Denim", "Levi's", 599.99, "L", "Denim", "Pria", "Biru", "Pendek");
$shirtList = addShirt($shirtList, "3", "Kemeja Polos", "Zara", 399.99, "S", "Polyester", "Wanita", "Hitam", "Panjang");

displayShirts($shirtList);