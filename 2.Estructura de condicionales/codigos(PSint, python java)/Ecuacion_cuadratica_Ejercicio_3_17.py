# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).

from math import sqrt

if __name__ == '__main__':
	# Enunciado: Encontrar las coordenadas en el plano carteciano x,y para graficar una ecuacion cuadratica o de sgundo grado
	# Leer valores de a, b y c
	# Pedir cada valor por teclado
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 03/03/23
	# declaracion de variables
	v_a = float()
	v_b = float()
	v_c = float()
	v_x1 = float()
	v_x2 = float()
	v_y = float()
	v_verx = float()
	v_very = float()
	v_ejes = float()
	# inicializacion de variables
	v_a = 0.0
	v_b = 0.0
	v_c = 0.0
	v_x1 = 0.0
	v_x2 = 0.0
	v_y = 0.0
	v_verx = 0.0
	v_very = 0.0
	v_ejes = 0.0
	# Entrada de datos
	print("Ecuacion ax²+ bx + c")
	print("Por favor escribir el valor de a")
	v_a = float(input())
	print("Por favor escribir el valor de b")
	v_b = float(input())
	print("Por favor escribir el valor de c")
	v_c = float(input())
	# procesos y salidas
	if v_b**2-4*v_a*v_c>0:
		print("el primer corte con x es")
		v_x1 = -(-v_b+sqrt(v_b**2-4*v_a*v_c))/2*v_a
		print("(",v_x1,",0",")")
		print("Elsegundo corte con x es")
		v_x2 = -(-v_b-sqrt(v_b**2-4*v_a*v_c))/2*v_a
		print("(",v_x2,",0",")")
	else:
		print("Las raices son imaginarias")
		print(-v_b/(2*v_a),"+",(sqrt(abs(v_b**2-4*v_a*v_c)))/2*v_a,"i")
		print(-v_b/(2*v_a),"-",(sqrt(abs(v_b**2-4*v_a*v_c)))/2*v_a,"i")
	# se emplea el condicional si para encontrar los cortes con el eje x pero si el resultado al que hay que sacar raiz cruadrada es negativo el resultado son numeros imaginarios
	print("el corte con y es")
	v_y = v_a*(0)**2+v_b*(0)+v_c
	print("(","0,",v_y,")")
	# se halla el corte con y en cordendas x,y por eso 0,y
	print("El eje de simetría es")
	v_ejes = -v_b/2*v_a
	print(v_ejes)
	print("El vertice en y es")
	v_very = v_a*(v_ejes)**2+v_b*(v_ejes)+v_c
	print(v_very)
	print("Elvertice en coordenadas (x,y) es")
	print("(",v_ejes,",",v_very,")")
	if v_a>0:
		print("La funcion es concava hacia arriba")
	else:
		print("la funcion es concava hacia abajo")
	# se emplea el condicional si poara saber hacia donde es concava la funcion y poder graficar 

