

async function getcontacts() {

  let datacontactos = document.getElementById('labelcontactos');
  const respuesta = await axios.get('http://localhost:9090/contactos');
  let array = respuesta.data;
  let i = 0;


  while (i < array.length) {

    if (array[i].estado == 1) {

      datacontactos.innerText = datacontactos.innerText +'  ' + JSON.stringify(array[i]);
      
    }

    i++;

  }



}



async function registration() {

  const name = document.getElementById('name').value
  const telefono = document.getElementById('telefono').value
  const email = document.getElementById('email').value
  const date = document.getElementById('date').value
  const estado = document.getElementById('estado').value

  const data = {

    nombre: name,
    telefono: telefono,
    email: email,
    date: date,
    estado: estado

  }
  try {

    const respuesta = await axios.post('http://localhost:9090/contacto', data);

    console.log('ESTE ES LA CREACION DE un usuario JUEGO', respuesta.data);


  } catch (e) {

    console.log(e);
  }

}



async function updatecontact() {

  const idcont = document.getElementById("idcontact").value;
  const namenew = document.getElementById('namenew').value
  const telefononew = document.getElementById('telefononew').value
  const emailnew = document.getElementById('emailnew').value
  const datenew = document.getElementById('datenew').value
  const estadonew = document.getElementById('estadonew').value

  const data2 = {

    nombre: namenew,
    telefono: telefononew,
    email: emailnew,
    date: datenew,
    estado: estadonew

  }
  console.log(data2);


  try {


    const respuesta = await axios.put(`http://localhost:9090/contacto/${idcont}`, data2);

    console.log('actualizacion de un contacto', respuesta);


  } catch (e) {

    console.log(e);
  }




}



async function deletecontact() {

  const idcont = document.getElementById("idcontactdelete").value;


  try {


    const respuesta = await axios.delete(`http://localhost:9090/contacto/${idcont}`);
    alert("CONTACTO ELIMINADO");
    console.log('contacto eliminado', respuesta);


  } catch (e) {

    console.log(e);
  }




}



async function deletelogic() {

  const idcont = document.getElementById("idlogic").value;



  const estatus = 0;


  const data3 = {
    estado: estatus

  }


  try {


    const respuesta = await axios.patch(`http://localhost:9090/contacto/estado/${idcont}`, data3);

    console.log('borrado logico', respuesta);


  } catch (e) {

    console.log(e);
  }




}
