# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Calacula la Aceleración 
	# Leer valores de Vi, Vf y t
	# Pedir cada valor por teclado
	# Hallar la aceleación
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 7/02/23
	# declaracion de variables
	vf = float()
	vi = float()
	t = float()
	a = float()
	# inicializacion de variables
	vf = 0.0
	vi = 0.0
	t = 0.0
	a = 0.0
	# Entrada de datos
	print("Por favor ingrese el valor de la velocidad inicial en m/s")
	vi = float(input())
	print("Por favor ingrese el valor de la velocidad final m/s")
	vf = float(input())
	print("Por favor ingrese el valor de el tiempo en segundos")
	t = float(input())
	# procesos
	a = (vf-vi)/t
	# salida
	print("la aceleracion ha sido: ",a,"m/s2")

