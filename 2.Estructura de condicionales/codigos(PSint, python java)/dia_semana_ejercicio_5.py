# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el dia de la semana con una fecha ingresando el primer dia del mes
	# Leer valore dia y primer dia del mes
	# Pedir valores por teclado
	# hallar el dia de la semana
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 2/03/23
	# declaracion de variables
	v_dia = int()
	v_d1 = int()
	v_dia1 = str()
	# Inicialiacion variables
	v_dia = 0
	v_d1 = 0
	v_dia1 = ""
	# Entrada de datos
	print("Cual fue el primer dia del mes (L,M,X,J,V,S,D)")
	v_dia1 = input()
	# Procesos y salidas
	if v_dia1=="L":
		v_d1 = 0
	elif v_dia1=="M":
		v_d1 = 1
	elif v_dia1=="X":
		v_d1 = 2
	elif v_dia1=="J":
		v_d1 = 3
	elif v_dia1=="V":
		v_d1 = 4
	elif v_dia1=="S":
		v_d1 = 5
	elif v_dia1=="D":
		v_d1 = 6
	print("Por favor ingresar el dia")
	v_dia = int(input())
	v_dia = v_dia+v_d1
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

