departamentos = ["ropa", "deportes", "jugueteria"]
meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]
# Crearemos el arreglo bidimensional
ventas = [
    [0 for i in range(3)] for i in range(12)
]

def validar_datos(mes, departamento):
    mes = mes.lower().replace(" ", "")
    departamento = departamento.lower().replace(" ", "")
    if mes in meses  and departamento in departamentos:
        return True
    else:
        return False

def insertar_venta(mes, departamento, cantidad):
    if validar_datos(mes, departamento):
        indice_mes = meses.index(mes.lower().replace(" ", ""))
        indice_departamento = departamentos.index(departamento.lower().replace(" ", ""))
        ventas[indice_mes][indice_departamento] += cantidad
    else:
        print("Datos invalidos")

def buscar_venta(mes, departamento):
    if validar_datos(mes, departamento):
        indice_mes = meses.index(mes.lower().replace(" ", ""))
        indice_departamento = departamentos.index(departamento.lower().replace(" ", ""))
        return ventas[indice_mes][indice_departamento]
    else:
        return "Datos invalidos"
        
def eliminar_venta(mes, departamento):
    if validar_datos(mes, departamento):
        indice_mes = meses.index(mes.lower().replace(" ", ""))
        indice_departamento = departamentos.index(departamento.lower().replace(" ", ""))
        ventas[indice_mes][indice_departamento] = 0
    else:
        print("Datos invalidos")
        
# pruebas:
insertar_venta("Enero", "Ropa", 1500)
insertar_venta("Enero", "Deportes", 2000)
insertar_venta("Febrero", "Jugueteria", 3000)
print(buscar_venta("Enero", "Ropa"))
print(ventas)
