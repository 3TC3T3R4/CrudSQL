package com.contactos.dao;

import com.contactos.domain.Contacto;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 * Crud y metodos para la lista de contactos
 *
 * @version 1.0.0 2022-08-11
 * @author Estevan Tangarife Correa <teban_1928@hotmail.com>
 * @since 1.0.0
 */
//lo que me permite ami conectarme  se conecta a la base de datos y se conecta a esa tabla con el id de tipo Long
public interface ContactoDao extends CrudRepository<Contacto,Long> {
  /**
   * Metodo para actualizar el nombre del contacto ya que no existe en el crud
   * @param id nuevo valor inyectado
   * @param nombre nuevo valor inyectado
   */
  @Modifying
  @Query("update Contacto contc set contc.nombre = :nombre where contc.id = :id")
  public void updateNombre(@Param(value = "id") Long id,
                           @Param(value = "nombre")String nombre);

  /**
   * Metodo para actualizar el telefono del contacto  ya que no existe en el crud
   * @param id nuevo valor inyectado
   * @param telefono nuevo valor inyectado
   */
    @Modifying
    @Query("update Contacto contc set contc.telefono = :telefono where contc.id = :id")
    public void updateTelefono(@Param(value = "id") Long id,
                             @Param(value = "telefono")Integer telefono);
  /**
   * Metodo para actualizar el email del contacto  ya que no existe en el crud
   * @param id nuevo valor inyectado
   * @param email nuevo valor inyectado
   */
    @Modifying
    @Query("update Contacto contc set contc.email = :email where contc.id = :id")
    public void updateEmail(@Param(value = "id") Long id,
                             @Param(value = "email")String email);
  /**
   * Metodo para actualizar la fecha del contacto  ya que no existe en el crud
   * @param id nuevo valor inyectado
   * @param date nuevo valor inyectado
   */
    @Modifying
    @Query("update Contacto contc set contc.date = :date where contc.id = :id")
    public void updateDate(@Param(value = "id") Long id,
                             @Param(value = "date")String date);
  /**
   * Metodo para actualizar el estado del contacto  ya que no existe en el crud
   * @param id nuevo valor inyectado
   * @param estado nuevo valor inyectado
   */
  @Modifying
  @Query("update Contacto contc set contc.estado = :estado where contc.id = :id")
  public void updateEstado(@Param(value = "id") Long id,
                         @Param(value = "estado")Integer estado);
  
}
