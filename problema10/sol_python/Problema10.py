import numpy as np

bandera = True
dato1 = 0
dato2 = 0
mensaje = 0
media = 0
control = "b"
while bandera:
    dato1 = int(input("ingrese el dato a calcular:"))
    mensaje = mensaje , dato1
    dato2 = mensaje
    control = input("ingrese s para salir\n-->")
    if control == "s":
        bandera = False
print(mensaje)
print(np.mean(mensaje))
