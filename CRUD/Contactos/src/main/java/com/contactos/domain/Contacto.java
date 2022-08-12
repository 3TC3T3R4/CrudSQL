package com.contactos.domain;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
/**
 * Clase que sirve como bosquejo de dibujo o traduccion de la tabla de mi base de datos a POO
 *
 * @version 1.0.0 2022-08-11
 * @author Estevan Tangarife Correa <teban_1928@hotmail.com>
 * @since 1.0.0
 */

//el domain sirve como por ejemplo dibujar la tabla de mi base de datos en lenguaje de java POO por ejemplo
@Data //getter and setters
@Entity
@Table(name="contacto")
public class Contacto implements Serializable {

    /**
     * Variable usada para manejar el tema del identificador de la tupla (consecutivo)
     */
    private static final long  serialVersionUID = 1L;

    /**
     * Identificador de la tupla
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Long id;

    /**
     * Nombre del contacto
     */
    @Column(name = "nombre")
    private String nombre;

    /**
     * Telefono del contacto
     */
    @Column(name = "telefono")
    private Integer telefono;

    /**
     * Email del contacto
     */
    @Column(name = "email")
    private String email;

    /**
     * Fecha de nacimiento del contacto
     */
    @Column(name = "fecha_nacimiento")
    private String date;

    /**
     * Estado del contacto 1 si esta activo 0 no esta activo
     */
    @Column(name = "estado")
    private Integer estado;


}
