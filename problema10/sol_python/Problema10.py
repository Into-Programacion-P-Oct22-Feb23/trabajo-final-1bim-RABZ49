bandera = True
dato1 = 0
dato2 = 0
mensaje = 0
contador = 0
media = 0
control = "b"
while bandera:
    dato1 = int(input("ingrese el dato a calcular:"))
    mensaje = mensaje + dato1
    control = input("ingrese s para salir\n-->")
    contador = contador + 1
    if control == "s":
        bandera = False
media = mensaje/contador
print("La media es de :"media)
