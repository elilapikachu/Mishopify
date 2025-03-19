#language:es
  @Aparicioncapcha
  Característica: En el portal de Shopify verifico que aparezca el capcha cuando detecte un bot
    Esquema del escenario: verifico aparicion del capcha
    Dado que me encuentro en el formulario de registro
    Cuando lleno los datos <nombre> <apellido> <correo> y <contrasena> luego le doy al boton de registrar
    Entonces debe de aparecer el chapcha evitando el registro

    Ejemplos:
      | nombre    | apellido | correo             | contrasena   |
      | Elizabeth | cardona  | eliza123@gmail.com | soyTurron983 |
