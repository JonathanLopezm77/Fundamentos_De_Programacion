# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el dia de la semana con una fecha
	# Leer valor dia
	# Pedir valor dia por teclado
	# hallar el dia de la semana
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 2/03/23
	# declaracion de variables
	v_dia = int()
	print("Por favor ingrese el dia ")
	# inicializacion de variables
	dia = 0
	# Entrada de datos
	v_dia = int(input())
	if v_dia<=31:
		if v_dia%7==0:
			print("Domingo")
		elif v_dia%7==1:
			print("Lunes")
		elif v_dia%7==2:
			print("Martes")
		elif v_dia%7==3:
			print("Miercoles")
		elif v_dia%7==4:
			print("Jueves")
		elif v_dia%7==5:
			print("Viernes")
		elif v_dia%7==6:
			print("Sabado")
	else:
		print("ningun mes tiene mas de 31 dias ")

