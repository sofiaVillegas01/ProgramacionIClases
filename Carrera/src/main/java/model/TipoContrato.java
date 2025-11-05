package model;

public enum TipoContrato {
    COMPLETO(0),MEDIO(1);

    private final  int  codigo;
    TipoContrato(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    

}