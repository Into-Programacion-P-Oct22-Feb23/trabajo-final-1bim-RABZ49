control = ""
control1 = ""
cadena_final = ""
control2 = ""
control3 = ""
bandera = True
salir = str("o")
valores = "\t\tmetros\tyardas\t\tpulgadas\tpies"
while bandera:
    metros = float(input("ingrese el valor en metros:"))
    yardas = metros * 1.094
    pulgadas = metros * 39.37
    pies = metros * 3.281
    cadena_final = "%s\t\t%s\t\t%s\t\t%s\t\t%s\n" % (cadena_final, metros, round(yardas, 2), round(pulgadas, 2), round(pies, 2))
    salir = input("ingrese s para salir.\n-->")
    if salir == "s":
        bandera = False
print(valores)
print(cadena_final)
