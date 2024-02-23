<?php

require_once("Product.php");

class Clothing extends Product {
    protected $size;
    protected $material;
    protected $gender;

    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender) {
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size;
        $this->material = $material;
        $this->gender = $gender;
    }

    public function getSize() {
        return $this->size;
    }

    public function getMaterial() {
        return $this->material;
    }

    public function getGender() {
        return $this->gender;
    }

    public function setSize($size) {
        $this->size = $size;
    }

    public function setMaterial($material) {
        $this->material = $material;
    }

    public function setGender($gender) {
        $this->gender = $gender;
    }
}

?>
