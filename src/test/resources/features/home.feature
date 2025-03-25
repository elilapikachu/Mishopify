#language:es
  @BusquedaExitosa
  Característica: Realizo una búsqueda con una palabra clave en el portal de Shopify

    Esquema del escenario: Realizo busqueda en el portal de shopify
      Dado que ingreso la palabra '<busqueda>' en el buscador de la pagina Home
      Cuando realizo la busqueda
      Entonces deben aparecer uno o varios resultados y verifico que el resultado contenga la palabra '<busqueda>' en el
      Ejemplos:
        | busqueda |
        | Grey     |


 @BusquedaFallida
    Esquema del escenario: Realizo busqueda en el portal de shopify
      Dado que ingreso la palabra '<busqueda>' en el buscador de la pagina Home
      Cuando realizo la busqueda
      Entonces deben aparecer el mensaje 'No results found for' indicando que no se encontro el resultado deseado
      Ejemplos:
        | busqueda |
        | Rueda        |