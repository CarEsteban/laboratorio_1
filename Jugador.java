public class Jugador{
    //atributos de la clase jugador
    String identificador;
    int puntosLocales;
    int puntosTotales;
    int puntosTemporales;
    //métodos de la clase jugador
    //constructor
    public Jugador(String identificador){
        this.identificador = identificador;
    }
    //obtener la identificación
    public String getIdentificador() {
        return identificador;
    }

    //setear los puntos temporales
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
    //obtener los pountos temporales
    public int getPuntosTemporales() {
        return puntosTemporales;
    }

    //setear los puntos de los dados en el turno
    public void setPuntosLocales(int puntosLocales) {
        this.puntosLocales = puntosLocales;
    }

    //setear los puntos totales, para irse acumulando o borrarse todos los puntos
    public void setPuntosTotales(int puntosTotales) {
        if(puntosTotales==0){
            this.puntosTotales=0;
        }else{
            this.puntosTotales += puntosTotales;
        }
    }
    
    //obtener los puntos totales y locales.
    public int getPuntosLocales() {
        return puntosLocales;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }



}