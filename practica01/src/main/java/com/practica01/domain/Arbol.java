
package com.practica01.domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable {
     private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String nombre;
    private String tipo;
    private int dureza;
    private String imagen;
    private boolean activo;

    public Arbol() {
    }

    public Arbol(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
}
