# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el valor de x en una ecuacion lineal tip ax + b
	# Leer valores de a y b
	# Pedir cada valor por teclado
	# y hallar el valor de x
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 28/02/23
	# declaracion de variables
	v_valora = float()
	v_valorb = float()
	v_valorx = float()
	# inicializacion de variables
	v_valora = 0
	v_valorb = 0
	v_valorx = 0
	# Entrada
	print("Calculadora de ecuaciones de primer grado tipo ax + b= 0")
	print("Por favor escribir el valor de a")
	v_valora = float(input())
	print("Por favor escribir el valor de b")
	v_valorb = float(input())
	v_valorx = (-v_valorb)/v_valora
	print(" El valor de x es ",v_valorx)

