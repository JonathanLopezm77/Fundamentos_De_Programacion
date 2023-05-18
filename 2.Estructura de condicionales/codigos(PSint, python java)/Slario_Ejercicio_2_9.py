# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Encontrar el salario a pagar
	# Leer valores de la hora, la cantidad de horas normales de la semana 1, 2, 3 y 4
	# Pedir cada valor por teclado
	# y calcular el salario a pagar
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 01/03/23
	# declaracion de variables
	v_vh = float()
	v_ph1 = float()
	v_ph2 = float()
	v_ph3 = float()
	v_ph4 = float()
	v_phe1 = float()
	v_phe2 = float()
	v_phe3 = float()
	v_phe4 = float()
	v_ps1 = float()
	v_ps2 = float()
	v_ps3 = float()
	v_ps4 = float()
	v_sm = float()
	v_ch1 = int()
	v_ch2 = int()
	v_ch3 = int()
	v_ch4 = int()
	v_che1 = int()
	v_che2 = int()
	v_che3 = int()
	v_che4 = int()
	v_nomemp = str()
	# inicializacion de variables
	v_vh = 0.0
	v_ph1 = 0.0
	v_ph2 = 0.0
	v_ph3 = 0.0
	v_ph4 = 0.0
	v_phe1 = 0.0
	v_phe2 = 0.0
	v_phe3 = 0.0
	v_phe4 = 0.0
	v_ps1 = 0.0
	v_ps2 = 0.0
	v_ps3 = 0.0
	v_ps4 = 0.0
	v_sm = 0.0
	v_ch1 = 0
	v_ch2 = 0
	v_ch3 = 0
	v_ch4 = 0
	v_che1 = 0
	v_che2 = 0
	v_che3 = 0
	v_che4 = 0
	v_nomemp = ""
	# Entrada de datos
	print("Por favor escribir el nombre del empleado")
	v_nomemp = input()
	print(v_nomemp)
	print("Por favor introdusca el valor de la hora")
	v_vh = float(input())
	print("El valor de la hora es")
	print(v_vh)
	print("Por favor introduzca la cantidad de horas trabajadas de la primera semana")
	v_ch1 = int(input())
	# Procesos y salidas
	if v_ch1>40:
		print("La cantidad de horas trabajadas normales es")
		print("40")
		v_che1 = v_ch1-40
		print("La cantidad de horas trabajadas extraordinarias es")
		print(v_che1)
	else:
		print("La cantidad de horas trabajadas normales es")
		print(v_ch1)
		print("La cantidad de horas trabajadas extraordinarias es")
		print(v_che1)
	if v_che1!=0:
		print("El pago por horas normales en la primera semana es")
		v_ph1 = v_vh*40
		print(v_ph1)
	else:
		print("El pago por horas normales en la primera semana es")
		v_ph1 = v_vh*v_ch1
		print(v_ph1)
	v_phe1 = v_che1*v_vh*(1.5)
	print("El pago por horas extraordinarias en la primera semana es")
	print(v_phe1)
	print("El pago de la primera semana es")
	v_ps1 = v_phe1+v_ph1
	print(v_ps1)
	# pago primera semana//
	print("Por favor introduzca la cantidad de horas trabajadas de la segunda semana")
	v_ch2 = int(input())
	if v_ch2>40:
		print("La cantidad de horas trabajadas normales en la segunda semana  es")
		print("40")
		v_che2 = v_ch2-40
		print("La cantidad de horas trabajadas extraordinarias en la segunda semana es")
		print(v_che2)
	else:
		print("La cantidad de horas trabajadas normales en la segunda semana es")
		print(v_ch2)
		print("La cantidad de horas trabajadas extraordinarias en la segunda semana es")
		print(v_che2)
	if v_che2!=0:
		print("El pago por horas normales en la segunda semana es")
		v_ph2 = v_vh*40
		print(v_ph2)
	else:
		print("El pago por horas normales en la segunda semana es")
		v_ph2 = v_vh*v_ch2
		print(v_ph2)
	v_phe2 = v_che2*v_vh*(1.5)
	print("El pago por horas extraordinarias en la segunda semana es")
	print(v_phe2)
	print("El pago de la segunda semana es")
	v_ps2 = v_phe2+v_ph2
	print(v_ps2)
	# pago segunda semana//
	print("Por favor introduzca la cantidad de horas trabajadas de la tercera semana")
	v_ch3 = int(input())
	if v_ch3>40:
		print("La cantidad de horas trabajadas normales en la tercera semana  es")
		print("40")
		v_che3 = v_ch3-40
		print("La cantidad de horas trabajadas extraordinarias en la tercera semana es")
		print(v_che3)
	else:
		print("La cantidad de horas trabajadas normales en la tercera semana es")
		print(v_ch3)
		print("La cantidad de horas trabajadas extraordinarias en la tercera semana es")
		print(v_che3)
	if v_che3!=0:
		print("El pago por horas normales en la tercera semana es")
		v_ph3 = v_vh*40
		print(v_ph3)
	else:
		print("El pago por horas normales en la tercera semana es")
		v_ph3 = v_vh*v_ch3
		print(v_ph3)
	v_phe3 = v_che3*v_vh*(1.5)
	print("El pago por horas extraordinarias en la tercera semana es")
	print(v_phe3)
	print("El pago de la tercera semana es")
	v_ps3 = v_phe3+v_ph3
	print(v_ps3)
	# pago tercera semana//
	print("Por favor introduzca la cantidad de horas trabajadas de la cuarta semana")
	v_ch4 = int(input())
	if v_ch4>40:
		print("La cantidad de horas trabajadas normales en la cuarta semana  es")
		print("40")
		v_che4 = v_ch4-40
		print("La cantidad de horas trabajadas extraordinarias en la cuarta semana es")
		print(v_che4)
	else:
		print("La cantidad de horas trabajadas normales en la cuarta semana es")
		print(v_ch4)
		print("La cantidad de horas trabajadas extraordinarias en la cuarta semana es")
		print(v_che4)
	if v_che4!=0:
		print("El pago por horas normales en la cuarta semana es")
		v_ph4 = v_vh*40
		print(v_ph4)
	else:
		print("El pago por horas normales en la cuarta semana es")
		v_ph4 = v_vh*v_ch4
		print(v_ph4)
	v_phe4 = v_che4*v_vh*(1.5)
	print("El pago por horas extraordinarias en la cuarta semana es")
	print(v_phe4)
	print("El pago de la tercera semana es")
	v_ps4 = v_phe4+v_ph4
	print(v_ps4)
	# pago cuarta semana//
	print("El salario mensual es")
	v_sm = v_ps1+v_ps2+v_ps3+v_ps4
	print(v_sm)

