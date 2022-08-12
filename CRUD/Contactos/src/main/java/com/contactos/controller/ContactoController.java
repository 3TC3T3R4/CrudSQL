package com.contactos.controller;

import com.contactos.domain.Contacto;
import com.contactos.service.ContactoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import java.util.List;
/**
 * Controlador para la lista de contactos
 *
 * @version 1.0.0 2022-08-11
 * @author Estevan Tangarife Correa <teban_1928@hotmail.com>
 * @since 1.0.0
 */
@Slf4j // para imprimir y se vea mejor
@CrossOrigin
@RestController//esta clase es un controlador se le dice a springboot
public class ContactoController {

    /**
     * Servicio para el manejo de la lista de contactos
     */
    @Autowired // donde llega el servicio "inyeccion de dependencia"
    private ContactoService contactoService;

    /**
     * Dirección raíz del sistema, este redirige  /contactos
     *
     * @return Lista de objetos de tipo de clase contacto
     */
    @GetMapping(path = "/contactos")
    public List<Contacto> listado(){

        return contactoService.list();


    }

    /**
     * Crea un nuevo contacto
     *
     * @param contacto Objeto Contacto a crear
     * @return Objeto en formato json
     */
    @PostMapping(path = "/contacto")
    public ResponseEntity<Contacto> crear(@RequestBody Contacto contacto){

        log.info("Contacto creado: {}",contacto);

            contactoService.save(contacto);
            return new ResponseEntity<>(contacto, HttpStatus.CREATED);

    }

    /**
     * Actualiza todos los campos de un contacto
     *
     * @param contacto Objeto contacto a actualizar
     * @param id Identificador del contacto a actualizar
     * @return Objeto Response en formato JSON
     *
     */
    @PutMapping(path = "/contacto/{id}")
    public ResponseEntity<Contacto>  actualizar(@RequestBody Contacto contacto, @PathVariable("id")Long id){

        log.info("Contacto a modificar: {}", contacto);
       var cont =  contactoService.update(id,contacto);
        return new ResponseEntity<>(cont, HttpStatus.CREATED);

    }

    /**
     * Borra un contacto del sistema
     *
     * @param contacto objeto contacto a borrar
     * @param {id} Identificador del contacto a borrar
     * @return Objeto Response en formato JSON
     *
     */
    //borrado fisico
    @DeleteMapping(path = "/contacto/{id}")
    public ResponseEntity<Contacto> borrar(Contacto contacto){

        log.info("CONTACTO A BORRRAR: {}",contacto);
        contactoService.delete(contacto);
        return new ResponseEntity<>(contacto, HttpStatus.OK);


    }

    /**
     * Actualiza el nombre basado en su identificador
     *
     * @param contacto Objeto Contacto
     * @param id Identificador del nombre  a actualizar
     * @return Objeto Response en formato JSON
     *
     */
    @PatchMapping(path = "/contacto/name/{id}")
    public ResponseEntity<Contacto>  actualizarNombre(Contacto contacto,@PathVariable("id")Long id){


        log.info("Contacto a modificar: {}", contacto);
        contactoService.updateNombre(id,contacto);
        return new ResponseEntity<>(contacto, HttpStatus.CREATED);


    }

    /**
     * Actualiza el número de teléfono basado en su identificador
     *
     * @param contacto Objeto Contacto
     * @param id Identificador del número de teléfono a actualizar
     * @return Objeto Response en formato JSON
     *
     */

    @PatchMapping(path = "/contacto/telefono/{id}")
    public ResponseEntity<Contacto>  actualizarTelefono(Contacto contacto,@PathVariable("id")Long id){


        log.info("Contacto a modificar: {}", contacto);
        contactoService.updateTelefono(id,contacto);
        return new ResponseEntity<>(contacto, HttpStatus.CREATED);

    }

    /**
     * Actualiza el email basado en su identificador
     *
     * @param contacto Objeto Contacto
     * @param id Identificador del email  a actualizar
     * @return Objeto Response en formato JSON
     *
     */
    @PatchMapping(path = "/contacto/email/{id}")
    public ResponseEntity<Contacto>  actualizarEmail(Contacto contacto,@PathVariable("id")Long id){

        log.info("Contacto a modificar: {}", contacto);
        contactoService.updateEmail(id,contacto);
        return new ResponseEntity<>(contacto, HttpStatus.CREATED);


    }

    /**
     * Actualiza la fecha basado en su identificador
     *
     * @param contacto Objeto Contacto
     * @param id Identificador de la fecha  a actualizar
     * @return Objeto Response en formato JSON
     *
     */
    @PatchMapping(path = "/contacto/date/{id}")
    public ResponseEntity<Contacto>  actualizarDate(Contacto contacto,@PathVariable("id")Long id){

        log.info("Contacto a modificar: {}", contacto);
        contactoService.updateDate(id,contacto);
        return new ResponseEntity<>(contacto, HttpStatus.CREATED);

    }

    /**
     * Actualiza el estado basado en su identificador
     *
     * @param contacto Objeto Contacto
     * @param id Identificador del estado  a actualizar
     * @return Objeto Response en formato JSON
     *
     */
    @PatchMapping(path = "/contacto/estado/{id}")//borrado logico
    public ResponseEntity<Contacto>  actualizarEstado(@RequestBody Contacto contacto,@PathVariable("id")Long id){

        log.info("Borrado logico: {}", contacto);
        contactoService.updateEstado(id,contacto);
        return new ResponseEntity<>(contacto, HttpStatus.CREATED);

    }





}
