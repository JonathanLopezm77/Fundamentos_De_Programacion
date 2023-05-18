# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el valor de la suma consecutiva de los numeros enteros positivos del 1 al 50
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 01/03/23
	# declaracion de variables
	i = int()
	suma = int()
	# inicializacion de variables
	i = 0
	suma = 0
	# procesos y salidas
	print("Lista de numeros sumados")
	for i in range(1,51):
		print(i)
		suma = suma+i
	print("El resultado de la suma es ",suma)

