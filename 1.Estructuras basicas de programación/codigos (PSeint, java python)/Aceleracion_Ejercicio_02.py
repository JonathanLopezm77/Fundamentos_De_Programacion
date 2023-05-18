# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Calcular la aceleración
	# Leer valores Vfkmh, Vikkmh y t
	# Pedir cada valor por teclado
	# y hallar la aceleración
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 07/02/23
	# declaracion de variables
	vfkmh = float()
	vikmh = float()
	t = float()
	vfms = float()
	vims = float()
	a = float()
	# inicializacion de variables
	vfkmh = 0.0
	vikmh = 0.0
	t = 0.0
	vfms = 0.0
	vims = 0.0
	a = 0.0
	# Entrada de datos
	print("Por favor ingrese la velocidad inicial en km/h")
	print("Recuerde que si parte del reposo la velocidad inicial es 0")
	vikmh = float(input())
	print("Por favor ingrese la velocidad final en km/h")
	vfkmh = float(input())
	print("Por favor ingrese el tiempo en segundos")
	t = float(input())
	# Proceso
	vfms = vfkmh*(5/18)
	vims = vikmh*(5/18)
	a = (vfms-vims)/t
	# Salida
	print("La velocidad final en m/s es: ",vfms)
	print("La velocidad inicial en m/s es: ",vims)
	print("La aceleración fue de: ",a,"m/s2")

