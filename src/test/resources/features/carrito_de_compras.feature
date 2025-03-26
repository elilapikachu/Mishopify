#language:es
  @AgregarArticulo
  Característica: Realizo pruebas en el carrito de compras

    Escenario: Agrego un articulo al carrito de compras
      Dado que me encuentro en la informacion del primero articulo
      Cuando le doy click al boton de agregar al carrito
      Entonces  El articulo debe de estar en el carrito


@RemoverArticulo
  Escenario: Elimino un articulo del carrito
    Dado que hay un articulo en el carrito de compras
    Cuando me meto al carrito y le doy a eliminar articulo
    Entonces el carrito debe quedar vacio