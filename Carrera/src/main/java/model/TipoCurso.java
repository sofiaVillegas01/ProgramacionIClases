package model;

public enum TipoCurso  {
    MAESTRIA(0),DOCTORADO(1);
    private final int codigo;
    TipoCurso(int codigo){
        this.codigo=codigo;
    }
    public int getCodigo(){
        return codigo;
    }
}
