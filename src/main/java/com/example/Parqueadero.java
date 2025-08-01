package com.example;

public class Parqueadero {
     private int capacidad ;
    private boolean conVigilante;
    private String localizacion;
    private boolean iluminacion;
    private boolean senalizacion;
    private boolean conPago;

    public Parqueadero(int capacidad, boolean conVigilante, String localizacion, boolean iluminacion, boolean senalizacion, boolean conPago) {
        this.capacidad = capacidad;
        this.conVigilante = conVigilante;
        this.localizacion = localizacion;
        this.iluminacion = iluminacion;
        this.senalizacion = senalizacion;
        this.conPago = conPago;
    }

    // GETTER
    
    public int getCapacidad(){
        return capacidad;
    }
    public boolean getConVigilante(){
        return conVigilante;
    }
    public String getLocalizacion(){
        return localizacion;
    }
    public boolean getIluminacion(){
        return iluminacion;
    }
    public boolean getSenalzacion(){
        return senalizacion;
    }
    public boolean getConPago(){
        return conPago;
    }

    // SETTER

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public void setConVigilante(boolean conVigilante){
        this.conVigilante = conVigilante;
    }
    public void setLocalizacion(String localizacion){
        this.localizacion = localizacion;
    }
    public void setIluminacion(boolean iluminacion){
        this.iluminacion = iluminacion;
    }
    public void setSenalizacion(boolean senalizacion){
        this.senalizacion = senalizacion;
    }
    public void setConPago(boolean conPago){
        this.conPago = conPago;
    }

    @Override
    public String toString(){
        return String.format("Parqueadero [capacidad=%d, conVigilante=%b, localizacion='%s', iluminacion=%b, senalizacion=%b, conPago=%b]", 
                capacidad, conVigilante, localizacion, iluminacion, senalizacion, conPago);
    }
    

}
