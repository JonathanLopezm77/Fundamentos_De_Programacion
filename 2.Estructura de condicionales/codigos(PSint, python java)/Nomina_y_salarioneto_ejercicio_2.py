# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: leer la cantidad de horas trabajadas y el valor de la hora por cada semana
	# Pedir por teclado las horas trabajadas y valor hora
	# calcular valor hora extraordinaria, cantidad de horas extraordinarias, 
	# y hallar el valor de x
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 28/02/23
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
	v_sb = float()
	v_impuestos = float()
	v_sn = float()
	v_ch1 = int()
	v_ch2 = int()
	v_ch3 = int()
	v_ch4 = int()
	v_che1 = int()
	v_che2 = int()
	v_che3 = int()
	v_che4 = int()
	n = str()
	# inicializacion de variables
	n = ""
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
	v_sb = 0.0
	v_impuestos = 0.0
	v_sn = 0.0
	v_ch1 = 0
	v_ch2 = 0
	v_ch3 = 0
	v_ch4 = 0
	v_che1 = 0
	v_che2 = 0
	v_che3 = 0
	v_che4 = 0
	# Entrada de datos
	print("Por favor escribir el nombre del empleado")
	n = input()
	print(n)
	print("Por favor introdusca el valor de la hora")
	v_vh = float(input())
	print("El valor de la hora es")
	print(v_vh)
	print("Por favor introduzca la cantidad de horas trabajadas de la primera semana")
	v_ch1 = int(input())
	# Procesos y salidas
	if v_ch1>35:
		print("La cantidad de horas trabajadas normales es")
		print("35")
		v_che1 = v_ch1-35
		print("La cantidad de horas trabajadas extraordinarias es")
		print(v_che1)
	else:
		print("La cantidad de horas trabajadas normales es")
		print(v_ch1)
		print("La cantidad de horas trabajadas extraordinarias es")
		print(v_che1)
	if v_che1!=0:
		print("El pago por horas normales en la primera semana es")
		v_ph1 = v_vh*35
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
	# Entrada de datos
	print("Por favor introduzca la cantidad de horas trabajadas de la segunda semana")
	v_ch2 = int(input())
	# Procesos y salidas
	if v_ch2>35:
		print("La cantidad de horas trabajadas normales en la segunda semana  es")
		print("35")
		v_che2 = v_ch2-35
		print("La cantidad de horas trabajadas extraordinarias en la segunda semana es")
		print(v_che2)
	else:
		print("La cantidad de horas trabajadas normales en la segunda semana es")
		print(v_ch2)
		print("La cantidad de horas trabajadas extraordinarias en la segunda semana es")
		print(v_che2)
	if v_che2!=0:
		print("El pago por horas normales en la segunda semana es")
		v_ph2 = v_vh*35
		print(v_ph2)
	else:
		print("El pago por horas normales en la segunda semana es")
		v_ph2 = v_vh*v_ch2
		print(v_ph2)
	v_phe2 = v_che2*v_vh*(1.5)
	print("El pago por horas extraordinarias en la segunda semana es")
	print(v_phe2)
	print("EL pago de la  segunda semana es")
	v_ps2 = v_phe2+v_ph2
	print(v_ps2)
	# pago segunda semana//
	# Entrada de datos
	print("Por favor introduzca la cantidad de horas trabajadas de la tercera semana")
	v_ch3 = int(input())
	# procesos y salidas
	if v_ch3>35:
		print("La cantidad de horas trabajadas normales en la tercera semana  es")
		print("35")
		v_che3 = v_ch3-35
		print("La cantidad de horas trabajadas extraordinarias en la tercera semana es")
		print(v_che3)
	else:
		print("La cantidad de horas trabajadas normales en la tercera semana es")
		print(v_ch3)
		print("La cantidad de horas trabajadas extraordinarias en la tercera semana es")
		print(v_che3)
	if v_che3!=0:
		print("El pago por horas normales en la tercera semana es")
		v_ph3 = v_vh*35
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
	# Entrada de datos
	print("Por favor introduzca la cantidad de horas trabajadas de la cuarta semana")
	v_ch4 = int(input())
	# Procesos y salidas
	if v_ch4>35:
		print("La cantidad de horas trabajadas normales en la cuarta semana  es")
		print("35")
		v_che4 = v_ch4-35
		print("La cantidad de horas trabajadas extraordinarias en la cuarta semana es")
		print(v_che4)
	else:
		print("La cantidad de horas trabajadas normales en la cuarta semana es")
		print(v_ch4)
		print("La cantidad de horas trabajadas extraordinarias en la cuarta semana es")
		print(v_che4)
	if v_che4!=0:
		print("El pago por horas normales en la cuarta semana es")
		v_ph4 = v_vh*35
		print(v_ph4)
	else:
		print("El pago por horas normales en la cuarta semana es")
		v_ph4 = v_vh*v_ch4
		print(v_ph4)
	v_phe4 = v_che4*v_vh*(1.5)
	print("El pago por horas extraordinarias en la cuarta semana es")
	print(v_phe4)
	print("El pago de la cuarta semana es")
	v_ps4 = v_phe4+v_ph4
	print(v_ps4)
	# pago cuarta semana//
	# Procesos y salidas
	print("El salario bruto es")
	v_sb = v_ps1+v_ps2+v_ps3+v_ps4
	print(v_sb)
	# salario neto//
	if v_sb<=300000:
		print("Esta libre de impuestos")
	if v_sb<=400000 and v_sb>300000:
		v_impuesto = (v_sb-300000)*0.2
	if v_sb>400000:
		v_impuesto = (v_sb-400000)*0.3+(100000*0.2)
	v_sn = v_sb-v_impuesto
	print("Salario neto es igual a: ",v_sn,"$")

