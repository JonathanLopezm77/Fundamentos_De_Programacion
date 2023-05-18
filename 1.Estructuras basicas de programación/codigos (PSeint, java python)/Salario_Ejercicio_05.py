# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Calcular el salario con descuentos
	# Leer valores de v_VH, v_HTD, v_HTN
	# Pedir cada valor por teclado
	# y hallar el valor de x
	# desarrollado por Jonathan López
	# version 1.0
	# fecha 28/02/23
	# declaracion de variables
	v_vh = float()
	v_vh40 = float()
	v_vhn = float()
	v_vthd = float()
	v_vthn = float()
	v_subsalario = float()
	v_rf = float()
	v_fe = float()
	v_bf = float()
	v_sp = float()
	v_salarioneto = float()
	v_htd = int()
	v_htn = int()
	v_nomemp = str()
	# inicializacion de variables
	v_vh = 0.0
	v_vh40 = 0.0
	v_vhn = 0.0
	v_vthd = 0.0
	v_vthn = 0.0
	v_subsalario = 0.0
	v_rf = 0.0
	v_fe = 0.0
	v_bf = 0.0
	v_sp = 0.0
	v_salarioneto = 0.0
	v_htd = 0
	v_htn = 0
	v_nomemp = ""
	# ENTRADA DE DATOS//
	print("Por favor ingrese el nombre del empleado ")
	v_nomemp = input()
	print("Por favor ingrese el valor de la hora")
	v_vh = float(input())
	print("Por favor ingrese la cantidad de Horas Trabajadas Día")
	v_htd = int(input())
	print("Por favor ingrese la cantidad de Horas Trabajadas Noche")
	v_htn = int(input())
	# Procesos
	v_vthd = (v_vh)*(v_htd)
	v_vh40 = v_vh*0.4
	v_vhn = (v_vh)+(v_vh40)
	v_vthn = (v_vhn)*(v_htn)
	v_subsalario = (v_vthd)+(v_vthn)
	v_rf = (v_subsalario)*(0.1)
	v_fe = (v_subsalario)*(0.03)
	v_bf = (v_subsalario)*(0.02)
	v_sp = (v_subsalario)*(0.04)
	v_salarioneto = (v_subsalario)-(v_rf)-(v_fe)-(v_bf)-(v_sp)
	# Salida
	print("Valo Hora Nocturna: ",v_vhn)
	print("El Subsalario es: ",v_subsalario)
	print("Descuentos")
	print("Descuento por retencion de fuente")
	print("10%")
	print("Descuento de fondos de empleados")
	print("3%")
	print("Descuento de bienestar familiar")
	print("2%")
	print("Descuento de salud y pension")
	print("4%")
	print("Salario neto")
	print(v_salarioneto)

