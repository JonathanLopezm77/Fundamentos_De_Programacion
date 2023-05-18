# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar la aceleracion y diatancia
	# Leer valores de Vi, Vf, t
	# Pedir cada valores por teclado
	# y hallar la aceleracion y la distancia
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 08/02/23
	# declaracion de variables
	vf = float()
	vi = float()
	t = float()
	a = float()
	d = float()
	# inicializacion de variables
	vf = 0.0
	vi = 0.0
	t = 0.0
	a = 0.0
	d = 0.0
	# Entrada de datos
	print("Por favor ingresar la velocidad inicial en m/s")
	vi = float(input())
	print("Por favor ingresar la velocidad final en m/s")
	vf = float(input())
	print("Por favor ingresar el tiempo en segundos")
	t = float(input())
	# Procesos
	a = (vf-vi)/t
	d = (vi*t)+(1/2*a)*(t**2)
	# Salida
	print("La aceleracion fue de: ",a,"m/s2")
	print("La distancia recorrida fue de: ",d,"m")

