#language:es
  @BusquedaExitosa
  Característica: Realizo una busqueda con una palabra clave y me aparece un resultado relacionado
    Esquema del escenario: Realizo busqueda en el portal de shopify
      Dado que ingreso la palabra '<busqueda>' en el buscador de la pagina Home
      Cuando realizo la busqueda
      Entonces deben aparecer uno o varios resultados y verifico que el resultado contenga la palabra '<busqueda>' en el
      Ejemplos:
        | busqueda |
        | Grey        |