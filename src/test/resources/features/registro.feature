#language:es

  @creaNuevoUsuario
  Característica: En el portal de Shopify me registro como un nuevo usuario
    Esquema del escenario: Registro nuevo usuario
    Dado que me encuentro en el formulario de registro
    Cuando lleno los datos <nombre> <apellido> <correo> y <contrsena> luego le doy al boton de registrar
    Entonces debo de estar registrado y lo confirmo viendo la seccion de 'My Account'

    Ejemplos:
      | nombre    | apellido | correo             | contrasena   |
      | Elizabeth | cardona  | eliza123@gmail.com | soyTurron983 |
