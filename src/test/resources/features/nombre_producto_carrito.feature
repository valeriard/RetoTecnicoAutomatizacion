#author : Valeria Rivera
#language: es

  Característica: Realizar la validacion del nombre del producto seleccionado en el carrito tenga el mismo nombre

    Esquema del escenario: validar  que el nombre del producto seleccionados en el carrito
      Dado que estoy en la pagina del exito
      Cuando elijo una categoria
      Y luego selecciono una subcategoria
      Y agrego cinco productos con distintas cantidades al carrito
      |Ciudad|Almacen|NombreProductoUno|cantidadProductoUno|NombreProductoDos|cantidadProductoDos|NombreProductoTres|cantidadProductoTres|NombreProductoCuatro|cantidadProductoCuatro|NombreProductoCinco|cantidadProductoCinco|
      |<Ciudad>|<Almacen>|<NombreProductoUno>|<cantidadProductoUno>|<NombreProductoDos>|<cantidadProductoDos>|<NombreProductoTres>|<cantidadProductoTres>|<NombreProductoCuatro>|<cantidadProductoCuatro>|<NombreProductoCinco>|<cantidadProductoCinco>|
      Y ingreso al carrito de compras
      Entonces verifico el nombre de los productos agregados debera ser igual que en el carrito
      Ejemplos:
        |Ciudad   |Almacen      |NombreProductoUno|cantidadProductoUno|NombreProductoDos|cantidadProductoDos|NombreProductoTres|cantidadProductoTres|NombreProductoCuatro|cantidadProductoCuatro|NombreProductoCinco|cantidadProductoCinco|
        |Medellín|Exito Envigado|CLUB COLOMBIA    |2                  |POKER            |4                  |COSTENA           |1              |CORONA                   |3                     |ANDINA             |5                    |



