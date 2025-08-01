package com.example;

public class Computador {

private int precio;
private String marca;
private String sistemaOperativo;
private int capacidadAlmacenamiento;
private int memoriaRam;
private String tipo;

public Computador(int precio, String marca, String sistemaOperativo, int capacidadAlmacenamiento, int memoriaRam, String tipo) {
    this.precio = precio;
    this.marca = marca;
    this.sistemaOperativo = sistemaOperativo;
    this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    this.memoriaRam = memoriaRam;
    this.tipo = tipo;
  }

  // Getters and Setters

  public int getPrecio(){
    return precio;
  }

  public String getMarca(){
    return marca;
  }

  public String getSistemaOperativo(){
    return sistemaOperativo;
  }

  public int getCapacidadAlmacenamiento(){
    return capacidadAlmacenamiento;
  }

  public int getMemoriaRam(){
    return memoriaRam;
  }

  public String getTipo(){
    return tipo;
  }

  // Setters

  public void setPrecio(int precio){
    this.precio=precio;
  }

  public void  setMarca(String marca){
    this.marca=marca;
  }

  public void setSistemaOperativo(String sistemaOperativo){
    this.sistemaOperativo=sistemaOperativo;
  }

  public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento){
    this.capacidadAlmacenamiento=capacidadAlmacenamiento;
  }

  public void setMemoriaRam(int memoriaRam){
    this.memoriaRam=memoriaRam;
  }

  public void setTipo(String tipo){
    this.tipo=tipo;
  }

  @Override
  public String toString() {
    return String.format("Computador [precio=%d, marca='%s', sistemaOperativo='%s', capacidadAlmacenamiento=%d, memoriaRam=%d, tipo='%s']",
            precio, marca, sistemaOperativo, capacidadAlmacenamiento, memoriaRam, tipo);
  }

}
