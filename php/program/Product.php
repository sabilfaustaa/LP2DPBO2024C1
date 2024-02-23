<?php

class Product {
    protected $idProduct;
    protected $name;
    protected $brand;
    protected $price;

    public function __construct($idProduct = "", $name = "", $brand = "", $price = 0.0) {
        $this->idProduct = $idProduct;
        $this->name = $name;
        $this->brand = $brand;
        $this->price = $price;
    }

    public function getIdProduct() {
        return $this->idProduct;
    }

    public function getName() {
        return $this->name;
    }

    public function getBrand() {
        return $this->brand;
    }

    public function getPrice() {
        return $this->price;
    }

    public function setIdProduct($idProduct) {
        $this->idProduct = $idProduct;
    }

    public function setName($name) {
        $this->name = $name;
    }

    public function setBrand($brand) {
        $this->brand = $brand;
    }

    public function setPrice($price) {
        $this->price = $price;
    }
}

?>
