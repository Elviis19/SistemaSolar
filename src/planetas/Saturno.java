package planetas;

public class Saturno {

    private String nombre;
    private int Satelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciasol;
    private boolean observable;

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getSatelites() {
        return Satelites;
    }

    public void setSatelites(Integer Satelites) {
        this.Satelites = Satelites;
    }

    public Double getMasa() {
        return masa;
    }

    public void setMasa(Double masa) {
        this.masa = masa;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public Integer getDistanciasol() {
        return distanciasol;
    }

    public void setDistanciasol(Integer distanciasol) {
        this.distanciasol = distanciasol;
    }

    public Boolean getObservable() {
        return observable;
    }

    public void setObservable(Boolean observable) {
        this.observable = observable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Saturno{");
        sb.append("nombre=").append(nombre);
        sb.append(", Satelites=").append(Satelites);
        sb.append(", masa=").append(masa);
        sb.append(", volumen=").append(volumen);
        sb.append(", diametro=").append(diametro);
        sb.append(", distanciasol=").append(distanciasol);
        sb.append(", observable=").append(observable);
        sb.append('}');
        return sb.toString();
    }
    public double densidad(){
        return masa/volumen;
    }
    public boolean planetaexterior(){
        double limitmaxi = 3.4*149597870; 
        double distanciaplaneta = distanciasol*1_000_000;
        if (distanciaplaneta>limitmaxi){
            return true;
            
        }else{
            return false;
        }
    }
}
