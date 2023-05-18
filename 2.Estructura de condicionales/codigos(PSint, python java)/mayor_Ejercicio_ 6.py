# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# ENUNCIADO=Ealgorimo que dice cual el mayor de los 3 numeros ingresados por el usuario
	# Leer valores de a, b y c
	# Pedir cada valor por teclado
	# y hallar el vnumero mayor
	# Desarerolado por: Jonathan López
	# VERSION=1.1
	# fecha 26/02/23
	# declaracion de variables
	# variables que alamcenan los nhumeros a comparar
	a = float()
	b = float()
	c = float()
	# inicializacion de variables
	a = 0.0
	b = 0.0
	c = 0.0
	# Entrada de datos
	print("Por favor ingrese el primer numero (a)")
	a = float(input())
	print("Por favor ingrese el segundo numero (b)")
	b = float(input())
	print("Por favor ingrese el tercer numero (c)")
	c = float(input())
	# Procesos y salidas}
	# comparaciones  para saber si 2 o toodos numeros ingresador por el usuario son iguales
	if a==b:
		print("a y b son iguales")
	if c==b:
		print("b y c son iguales")
	if a==c:
		print("a y c son iguales")
	if a==b and b==c:
		print("todos los numeros son iguales")
	else:
		# comparacion para sber cual es el numero mayor
		if a<b:
			if b<c:
				print("EL numero amyor es= ",c)
			else:
				print("EL numero mayor es= ",b)
		else:
			if a<c:
				print("El numero mayor es= ",c)
			else:
				print("EL numero mayor es =",a)

