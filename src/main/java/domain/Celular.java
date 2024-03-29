package domain;

public class Celular {
    private String marca;
    private String modelo;
    private String color;
    private String imei;

    public Celular(String marca, String modelo, String color, String imei) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getImei() {
        return imei;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}
