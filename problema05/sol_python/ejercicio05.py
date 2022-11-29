x = float(input("Ingrese el valor de X: "))
y = float(input("Ingrese el valor de Y: "))
if x >= 0 and y >= 0:
	print("Los valores del cuadrante 1.")
elif x < 0 and y >= 0:
	print("Los valores del cuadrante 2.")
elif x < 0 and y < 0:
	print("Los valores del cuadrante 3.")
else:
	print("Los valores del cuadrante 4.")