package modelo.dto;
// Generated 14-09-2021 18:12:56 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoJugador generated by hbm2java
 */
public class TipoJugador  implements java.io.Serializable {


     private Integer id;
     private String descripcion;
     private Set perfilJugadors = new HashSet(0);

    public TipoJugador() {
    }

    public TipoJugador(Integer id) {
        this.id = id;
    }
    
	
    public TipoJugador(String descripcion) {
        this.descripcion = descripcion;
    }
    public TipoJugador(String descripcion, Set perfilJugadors) {
       this.descripcion = descripcion;
       this.perfilJugadors = perfilJugadors;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getPerfilJugadors() {
        return this.perfilJugadors;
    }
    
    public void setPerfilJugadors(Set perfilJugadors) {
        this.perfilJugadors = perfilJugadors;
    }




}


