departamentos = ["ropa", "deportes", "jugueteria"]
meses = ["enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"]
# Crearemos el arreglo bidimensional
ventas = [
    [0 for i in range(3)] for i in range(12)
]

def insertar_venta(mes, departamento, cantidad):
    mes = mes.lower().replace(" ", "")
    departamento = departamento.lower().replace(" ", "")
    if mes in meses  and departamento in departamentos:
        ventas[meses.index(mes)][departamentos.index(departamento)] = cantidad
        print(f"venta inserada con exito")
    else:
        print("Mes o departamento inválido")

def buscar_venta(mes, departamento):
    mes = mes.lower().replace(" ", "")
    departamento = departamento.lower().replace(" ", "")
    if mes in meses  and departamento in departamentos:
        return f"la venta del mes {mes} para el departamento {departamento} es: {ventas[meses.index(mes)][departamentos.index(departamento)]}"
    else:
        print("Mes o departamento inválido")
        
def eliminar_venta(mes, departamento):
    mes = mes.lower().replace(" ", "")
    departamento = departamento.lower().replace(" ", "")
    if mes in meses  and departamento in departamentos:
        ventas[meses.index(mes)][departamentos.index(departamento)] = 0
        print("Venta eliminada con exito")
    else:
        print("Mes o departamento inválido")
        
# pruebas:
# insertar_venta("Enero", "Ropa", 1500)
# print(buscar_venta("Enero", "Ropa"))
# print(ventas)