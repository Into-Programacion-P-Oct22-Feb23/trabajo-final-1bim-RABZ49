trajes = int(input("Ingrese la cantidad de trajes: "))
precio_unitario = float(input("Ingrese el precio unitario del traje: "))
subtotal = 0
total = 0
descuento = 0


if trajes == 1:
    descuento = 20
    subtotal = precio_unitario
    total = (precio_unitario * descuento) / 100
else:
    if trajes == 2:
        descuento = 25
        subtotal = precio_unitario * trajes
        total = (precio_unitario * descuento)/ 100
    else:
        if trajes == 3:
            descuento = 40
            subtotal = precio_unitario * trajes
            total = (precio_unitario * descuento )/ 100
        else:
            if trajes > 3:
                descuento = 50
                subtotal = precio_unitario * trajes
                total = subtotal - (subtotal * descuento) / 100
print("Trajes comprados: ",trajes)
print("El precio unitario es de: ",precio_unitario)
print("Subtotal: ",subtotal)
print("El descuento es de: ",descuento,"por ciento")
print("Total: ",total)