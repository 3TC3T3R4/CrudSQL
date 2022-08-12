package com.contactos.service;

import com.contactos.dao.ContactoDao;
import com.contactos.domain.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * Clase tipo Servicio para el manejo de los contactos
 *
 * @version 1.0.0 2022-08-11
 * @author Estevan Tangarife Correa <teban_1928@hotmail.com>
 * @since 1.0.0
 */
//vamos a decirle a JPA que esto es un servicio
@Service
public class ContactoService  implements IContactoService {


    /**
     * Sirve para inyectar el usuario DAO
     */
    @Autowired
    private ContactoDao contactoDao;

    /**
     * Sirve para devolver la lista de contactos existentes
     * @return lista de contactos
     */
    @Override
    @Transactional(readOnly = true)
    public List<Contacto> list() {
        return (List<Contacto>) contactoDao.findAll();
    }

    /**
     * Sirve para crear el objeto contacto
     * @param contacto objeto de contacto a crear
     * @return objeto del contacto creado
     */
    @Override
    @Transactional
    public Contacto save(Contacto contacto) {
        return contactoDao.save(contacto);
    }

    /**
     *
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actulizar
     * @return objeto contacto actualizado
     */
    @Override
    @Transactional
    public Contacto update(Long id, Contacto contacto) {

        contacto.setId(id);
        return contactoDao.save(contacto);
    }

    /**
     * Actualizar el nombre a un contacto
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actualizar
     */
    @Transactional
    public void updateNombre(Long id, Contacto contacto) {

        contactoDao.updateNombre(id,contacto.getNombre());

    }

    /**
     * Actualizar el telefono a un contacto
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actualizar
     */
    @Transactional
    public void updateTelefono(Long id, Contacto contacto) {

        contactoDao.updateTelefono(id,contacto.getTelefono());

    }

    /**
     * Actualizar el email a un contacto
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actualizar
     */
    @Transactional
    public void updateEmail(Long id, Contacto contacto) {

        contactoDao.updateEmail(id,contacto.getEmail());

    }

    /**
     * Actualizar la fecha a un contacto
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actualizar
     */
    @Transactional
    public void updateDate(Long id, Contacto contacto) {

        contactoDao.updateDate(id,contacto.getDate());

    }

    /**
     * Actualizar el estado a un contacto
     * @param id identificador del contacto a actualizar
     * @param contacto objeto del contacto a actualizar
     */
    @Transactional
    public void updateEstado(Long id, Contacto contacto) {

        contactoDao.updateEstado(id,contacto.getEstado());

    }


    /**
     * Sirve para eliminar el contacto
     * @param contacto objeto contacto a eliminar
     */
    @Override
    @Transactional
    public void delete(Contacto contacto) {

        contactoDao.delete(contacto);

    }

    /**
     * Sirve para leer el contacto buscandolo
     * @param contacto
     * @return contacto buscado por su id
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Contacto> findUser(Contacto contacto) {

        return  contactoDao.findById(contacto.getId());
    }
}
