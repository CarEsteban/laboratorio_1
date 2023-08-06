public class Jugador{
    String identificador;
    int puntosLocales;
    int puntosTotales;
    int puntosTemporales;

    public Jugador(String identificador){
        this.identificador = identificador;
    }
    
    public String getIdentificador() {
        return identificador;
    }

    public void setPuntosTemporales(int puntosTemporales) {
        
        if(puntosTemporales==0){
            this.puntosTemporales=0;
        }else{
            if(this.puntosTemporales>=20){
                this.puntosTemporales=0;
            }else{
                this.puntosTemporales += puntosTemporales;
        
            }
        }
    }

    public int getPuntosTemporales() {
        return puntosTemporales;
    }

    public void setPuntosLocales(int puntosLocales) {
        this.puntosLocales = puntosLocales;
    }

    public void setPuntosTotales(int puntosTotales) {
        if(puntosTotales==0){
            this.puntosTotales=0;
        }else{
            this.puntosTotales += puntosTotales;
        }
    }
    

    public int getPuntosLocales() {
        return puntosLocales;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }



}