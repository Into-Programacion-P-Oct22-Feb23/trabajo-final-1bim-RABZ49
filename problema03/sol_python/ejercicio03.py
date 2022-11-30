total = 0
salario = 0
nombre = input("Ingrese su nombre: ")
tipoEmpleado = int(input("Ingrese el tipo de empleado que es: "))
horasTrabajadas = int(input("Ingrese el número de horas trabajadas: "))
costoHora = float(input("Ingrese la hora por pagar: "))

salario = horasTrabajadas * costoHora
if tipoEmpleado == 1:

    total = costoHora * 1.5
    salario = total * horasTrabajadas
elif tipoEmpleado == 2:
    total = costoHora * 2
    salario = total * horasTrabajadas
elif tipoEmpleado == 3:
    total = costoHora * 2.5
    salario = total * horasTrabajadas
elif tipoEmpleado == 4:
    total = costoHora * 3
    salario = total * horasTrabajadas
else:

    print("El empleado ", nombre, " de tipo ", tipoEmpleado, " tiene un "
          + "salario final de ", salario, " dólares.\n")