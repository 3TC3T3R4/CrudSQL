package com.contactos.service;
import com.contactos.domain.Contacto;
import java.util.List;
import java.util.Optional;

/**
 * Interface para el servicio de contactos
 *
 * @version 1.0.0 2022-08-11
 * @author Estevan Tangarife Correa <teban_1928@hotmail.com>
 * @since 1.0.0
 */
public interface IContactoService {

    /**
     * listar los contactos en una lista
     *
     * @return lista de Objetos de tipo contacto
     *
     */
    public List<Contacto> list();

    /**
     * Almacenar o guardar los contactos
     *
     * @param contacto Objeto del contacto a guardar
     * @return Objeto del contacto guardado
     *
     */
    public Contacto save(Contacto contacto);

    /**
     * Actualiza una tupla completa de un contacto
     *
     * @param id Identificador del contacto a actualizar
     * @param contacto Objeto del contacto a actualizar
     * @return Objeto del contacto actualizado
     *
     */
    public Contacto update(Long id,Contacto contacto);


    /**
     * Elimina una tupla completa de un contacto
     *
     * @param contacto Objeto del contacto a eliminar
     * @return Objeto del contacto eliminado
     *
     */
    public void  delete(Contacto contacto);

    /**
     * Busca una tupla completa de un contacto
     *
     * @param contacto Objeto del contacto a buscar
     * @return Objeto del contacto encontrado
     *
     */
    public Optional<Contacto> findUser(Contacto contacto);


}
