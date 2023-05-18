# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado:cular la media de una serie de números positivos, suponiendo que los datos se leen desde un terminal. 
	# Leer valores de v_dato
	# Pedir cel valor por teclado
	# y hallar la media
	# desarrollado por Jonathan López
	# version 1.1
	# fecha 26/02/2023
	# declaracion de variables
	# VARIABLE DE ENTRADA QUE CUENTA LOS NUMEROS
	v_i = int()
	# VARIABLE DE ENTRADA QUE SUMA LOS NUMEROS
	v_suma = float()
	# VARIABLE DE PROCESO QUE ALMACENA EL NUMERO ESCRITO
	v_num = float()
	# VARIABLE DE SALIDA QUE ALMACENA LA MEDIA
	v_media = float()
	# inicializacion de variables
	v_i = 0
	v_suma = 0.0
	v_num = 0.0
	v_media = 0.0
	# Procesos
	print("Por favor introduzca los numeros de los cuales desea sacar la media para fiinalizar digite 0")
	while True:# no hay 'repetir' en python
		# Entrada de dato
		v_num = float(input())
		# procesos
		if v_num==0:
			v_media = v_suma/v_i
		else:
			if v_num<0:
				print("Este programa no suma numeros negativos")
			else:
				v_i = v_i+1
				v_suma = v_suma+v_num
		if v_num==0 or v_num<0: break
	# Salida
	print("la media es= ",v_media)

