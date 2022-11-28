dato1 = int(input('ingrese el numero entero mayor o igual a 2: '))
contador = 1
total = 0
dato2 = "error"
if dato1 >= 2:
    if dato1 % 2 == 1:
        print("El numero ingresado es impar")
    else:
        while contador <= dato1:
            contador = contador + 1
            if contador % 2 == 0:
                print(contador)
else:
    print(dato2)
