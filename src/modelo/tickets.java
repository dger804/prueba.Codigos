
package modelo;

public class tickets {
    private int id;
    private String codigo;
    private boolean estado;

    public tickets(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }        
    
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public boolean estadoCodigo(){
        return estado;
    }
}