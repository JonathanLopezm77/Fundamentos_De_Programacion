# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).

from math import sqrt

if __name__ == '__main__':
	# Enunciado: Encontrar el area de un triaungulo
	# Leer la base y la altura
	# Pedir cada valor por teclado
	# hallar el area del triangulo
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 01/03/23
	# declaracion de variables
	v_l1 = float()
	v_l2 = float()
	v_l3 = float()
	v_sp = float()
	v_area = float()
	# Inicializacion de variables
	v_l1 = 0.0
	v_l2 = 0.0
	v_l3 = 0.0
	v_sp = 0.0
	v_area = 0.0
	# Entrada de datos
	print("Por favor escriba los 3 lados del triangulo")
	v_l1 = float(input())
	v_l2 = float(input())
	v_l3 = float(input())
	# Procesos y salidas
	v_sp = (v_l1+v_l2+v_l3)/2
	if (v_sp>v_l2) and (v_sp>v_l2) and (v_sp>v_l3):
		v_area = sqrt(v_sp*(v_sp-v_l1)*(v_sp-v_l2)*(v_sp-v_l3))
		print(v_area)
	else:
		print("No es un triangulo")

