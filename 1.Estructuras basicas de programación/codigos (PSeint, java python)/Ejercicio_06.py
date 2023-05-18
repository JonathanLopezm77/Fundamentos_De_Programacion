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
	# Declaracion de variables
	v_n1 = float()
	v_n2 = float()
	v_n3 = float()
	v_p1 = float()
	v_p2 = float()
	v_p3 = float()
	v_np = float()
	v_ns = float()
	v_nt = float()
	v_n = float()
	v_nd = float()
	v_si = int()
	v_ina = int()
	v_nomest = str()
	v_nomasi = str()
	# Inicializacion de variables
	v_n1 = 0.0
	v_n2 = 0.0
	v_n3 = 0.0
	v_p1 = 0.0
	v_p2 = 0.0
	v_p3 = 0.0
	v_np = 0.0
	v_ns = 0.0
	v_nt = 0.0
	v_n = 0.0
	v_nd = 0.0
	v_si = 0
	v_ina = 0
	v_nomest = ""
	v_nomasi = ""
	# Entrada de datos
	print("Por favor ingrese el nombre del estudiante")
	v_nomest = input()
	print("Por favor ingrese el nombre e la asignatura")
	v_nomasi = input()
	print("Por favor ingrese nota del primer parcial")
	v_n1 = float(input())
	print("Por favor ingrese nota del segundo parcial")
	v_n2 = float(input())
	print("Por favor ingrese nota del tercer parcial")
	v_n3 = float(input())
	print("Por favor ingrese el primer porsentaje recuerde que debe ser en decimal así 10%= 0.1")
	v_p1 = float(input())
	print("Por favor ingrese el segundo porsentaje")
	v_p2 = float(input())
	print("Por favor ingrese el tercer porsentaje ")
	v_p3 = float(input())
	print("Por favor Ingrese la cantidad de inacistencias")
	v_ina = int(input())
	# Procesos y salidas 
	print("la nota del primaer parcial es ")
	v_np = v_n1*v_p1
	print(v_np)
	print("la nota del segundo parcial es ")
	v_ns = v_n2*v_p2
	print(v_ns)
	print("la nota del segundo parcial es ")
	v_nt = v_n3*v_p3
	print(v_nt)
	print("La nota es ")
	v_n = v_np+v_ns+v_nt
	print(v_n)
	print("si el numero de inacistencias es menor a 12 y nota  es mayor a 3.5 opcion 1, si el numero de inacistencias es menor a 12 pero la nota es menor a 3.5 opcion 2, si el numero de inacistencias es mayor o igual a 12 opcion 3 ")
	v_si = int(input())
	if v_si hacer;==1:
		print("aprueba academicamente")
		print("la Nota definitiva es igual a")
		v_nd = v_n
		print(v_nd)
	elif v_si hacer;==2:
		print("reprueba academicamente")
		print("la Notade definitiva es igual a")
		v_nd = v_n
		print(v_nd)
	elif v_si hacer;==3:
		print("reprueba por inacistencias")
		print("la Notade definitiva es igual a")
		v_nd = v_n/2
		print(v_nd)

