package modelo.dto;
// Generated 14-09-2021 18:12:56 by Hibernate Tools 4.3.1



/**
 * DetalleEquipo generated by hbm2java
 */
public class DetalleEquipo  implements java.io.Serializable {


     private Integer id;
     private Equipo equipo;
     private Incripcion incripcion;

    public DetalleEquipo() {
    }

    public DetalleEquipo(Equipo equipo, Incripcion incripcion) {
       this.equipo = equipo;
       this.incripcion = incripcion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Equipo getEquipo() {
        return this.equipo;
    }
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    public Incripcion getIncripcion() {
        return this.incripcion;
    }
    
    public void setIncripcion(Incripcion incripcion) {
        this.incripcion = incripcion;
    }




}


