control = ""
control1 = ""
control2 = ""
control3 = ""
bandera = True
salir = str("o")
valores = "metros\tyardas\tpulgadas\tpies"
while bandera:
    metros = float(input("ingrese el valor en metros:"))
    yardas = metros * 1.094
    pulgadas = metros * 39.37
    pies = metros * 3.281
    yardasR = round(yardas, 2)
    pulgadasR = round(pulgadas, 2)
    piesR = round(pies, 2)
    control = str(control) + str(metros) + "\n"
    control1 = str(control1) + str(yardasR) + "\n"
    control2 = str(control2) + str(pulgadasR) + "\n"
    control3 = str(control3) + str(piesR) + "\n"
    salir = input("ingrese s para salir.\n-->")
    if salir == "s":
        bandera = False
print("\nmetros\n\n" + control + "\nyardas\n\n" + control1 + "\npulgadas\n\n" + control2 + "\npies\n\n" + control3)
