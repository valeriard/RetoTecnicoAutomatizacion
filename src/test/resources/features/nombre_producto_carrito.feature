#author : Valeria Rivera
#language: es

  Característica: Realizar la validacion del nombre del producto seleccionado en el carrito tenga el mismo nombre

    Esquema del escenario: validar  que el nombre del producto seleccionados en el carrito
      Dado que estoy en la pagina del exito
      Cuando elijo una categoria
      Y luego selecciono una subcategoria
      Y agrego cinco productos con distintas cantidades al carrito
      |nombreProductoUno|cantidadProductoUno|nombreProductoDos|cantidadProductoDos|nombreProductoTres|cantidadProductoTres|nombreProductoCuatro|cantidadProductoCuatro|nombreProductoCinco|cantidadProductoCinco|
      |<nombreProductoUno>|<cantidadProductoUno>|<nombreProductoDos>|<cantidadProductoDos>|<nombreProductoTres>|<cantidadProductoTres>|<nombreProductoCuatro>|<cantidadProductoCuatro>|<nombreProductoCinco>|<cantidadProductoCinco>|
      Y ingreso al carrito de compras e ingreso un correo
      Entonces verifico el nombre de los productos agregados debera ser igual que en el carrito
      |nombreProductoUno|nombreProductoDos|nombreProductoTres|nombreProductoCuatro|nombreProductoCinco|
      |<nombreProductoUno>|<nombreProductoDos>|<nombreProductoTres>|<nombreProductoCuatro>|<nombreProductoCinco>|
      Y el total de los precios de los productos agregados debera ser igual que en el carrito
      Y las cantidades de los productos agregados debera ser igual que en el carrito
      Y el numero de productos agregados debe ser igual que en el carrito

      Ejemplos:
        |nombreProductoUno|cantidadProductoUno|nombreProductoDos|cantidadProductoDos|nombreProductoTres|cantidadProductoTres|nombreProductoCuatro|cantidadProductoCuatro|nombreProductoCinco|cantidadProductoCinco|
        |AGUILA           |5                  |COSTENA           |5                  |CLUBCOLOMBIA     |6              |CORONA                   |4               |ANDINA             |4              |



