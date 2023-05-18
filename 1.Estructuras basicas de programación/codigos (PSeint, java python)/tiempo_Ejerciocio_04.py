# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el tiempo que tarda en lacanzar la velocidad final un cuespo
	# Leer valores de Vims, Vfkmh, a
	# Pedir cada valor por teclado
	# y hallar el tiempo que tarda
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 08/02/23
	# declaracion de variables
	vims = float()
	vfkmh = float()
	vfms = float()
	a = float()
	t = float()
	# inicializacion de variables
	vims = 0.0
	vfkmh = 0.0
	vfms = 0.0
	a = 0.0
	t = 0.0
	# Entrada de datos
	print("Por favor ingresar la velocidad inicial en m/s")
	vims = float(input())
	print("Por favor ingresar la velocidad final en km/h")
	vfkmh = float(input())
	print("Por favor ingresar la aceleración en m/s2")
	a = float(input())
	# Procesos
	vfms = vfkmh*5/18
	t = (vfms-vims)/a
	# Salida
	print("La velocidad final en m/s es: ",vfms)
	print("El tiempo que tarda un cuerpo en lacanzar la velocidad final es: ",t,"s")

