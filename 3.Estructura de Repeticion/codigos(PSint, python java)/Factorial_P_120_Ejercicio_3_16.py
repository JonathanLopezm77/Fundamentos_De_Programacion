# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Escribir un algoritmo que calcule el producto de los n primeros números naturales hasta el 12.
	# Leer valores del numero natural
	# Pedir el valor por teclado
	# y hallar el factorial
	# desarrollado por Jonathan López
	# version 1.1
	# fecha 04/03/23
	# declaracion de variables
	v_numn = int()
	v_f = int()
	# inicializacion de variables
	# VARIABLE QUE ALMACENA EL NUMERO NATURAL.
	v_numnn = 0
	# VARIABLE QUE ALMACENA EL PRODUCTO O FACTORIAL.
	v_f = 0
	# Entrada de datos
	print("Por favor escriba el numero natural del cual desea conocer su factorial")
	v_numn = int(input())
	# Proceso
	if v_numn==0:
		print("Factorial de 0 igual a 1")
	else:
		if v_numn>0:
			v_f = 1
		else:
			print("Numero negativo")
	while True:# no hay 'repetir' en python
		v_f = v_f*v_numn
		v_numn = v_numn-1
		if v_numn==1: break
	# Salida
	print("Factorial=",v_f)

