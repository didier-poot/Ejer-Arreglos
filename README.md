mi código es un programa sencillo para gestionar las ventas mensuales de tres departamentos el cual consiste en recibir datos mediantes los métodos y hacer acciones en el arreglo bidimensional llamado ventas, donde: las filas son los meses y
las columnas son las ventas correspondientes por mes como los nombre de los métodos dicen

"validar_datos": este método la use para evitar errores, recibe como parametros el nombre del mes y del departamento.

  * (.lower().replace(" ", "")) Convierte el mes y el departamento a minúsculas y elimina los espacios en blanco.
    Esto hace que la validación no distinga entre mayúsculas y minúsculas y sea flexible a errores de escritura. Por ejemplo, " Enero " o "enero" son tratados como válidos.
  * Verifica si el mes y el departamento proporcionados existen en las listas predefinidas "meses" y "departamentos".
  * Devuelve True si ambos son válidos y False en caso contrario. Esto es crucial para que los otros métodos no intenten acceder a datos que no existen, lo que causaría un error.

"insertar_venta": inserta una venta con base al mes y al departamento, y por supuesto claro que la cantidad de venta
* se llaama a "validar_datos"
* Si los datos son válidos, utiliza el método .index() para encontrar la posición (índice) de ese mes y departamento en sus respectivas listas.
*  usa los índices para acceder a la posición correcta en el arreglo ventas y le suma la cantidad proporcionada. Por ejemplo, ventas[0][0] corresponde a "Enero" y "Ropa".

"Buscar venta": se encarga de encontrar la cantidad de venta en el mes y departamento proporcionado
* se llama a "validar_datos"
* Si los datos son válidos, encuentra los índices correspondientes del mes y el departamento.
* Accede a la posición en el arreglo ventas y retorna el valor de la venta almacenada en esa celda.

"eliminar_venta": resetea las ventas de un departamento en un mes específico.
* Valida los datos de entrada
* Si los datos son correctos, encuentra los índices correspondientes.
* Accede a la posición en el arreglo ventas y asigna el valor de 0, lo que efectivamente "elimina" la venta al dejarla sin un monto.

al final del código hice unas pruebas para ver la funcionalidad del código.
