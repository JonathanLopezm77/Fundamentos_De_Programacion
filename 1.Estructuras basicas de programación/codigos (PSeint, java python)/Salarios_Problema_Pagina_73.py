# Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# Enunciado: Calcular el salario bruto y el salario neto de un trabajador "por horas" conociendo el nombre, número de horas trabajadas, impuestos a pagar y salario neto.
	# Leer ne, ht y vh
	# Pedir cada valor por teclado
	# desarrollado por Jonathan López
	# version 1.0
	# fecha  24/02/23
	# declaracion de variables
	v_ne = str()
	v_ht = int()
	v_vh = float()
	v_sb = float()
	v_tasas = float()
	v_neto = float()
	# inicializacion de variables
	v_ne = ""
	v_ht = 0
	v_vh = 0.0
	v_sb = 0.0
	v_tasas = 0.0
	v_neto = 0.0
	# entrada de datos
	print("Por favor escriba el nombre del empleado")
	v_ne = input()
	print("Por favor escriba la cantidad de horas trabajadas")
	v_ht = int(input())
	print("Por favor escriba el valor hora")
	v_vh = float(input())
	# Proceos
	v_sb = v_ht*v_vh
	v_tasas = v_sb*0.25
	v_neto = v_sb-v_tasas
	# Salida
	print("el nomnbre del empleado es= ",v_ne)
	print("el salario bruto es= ","$",v_sb)
	print("los impuestos o tasas a pagar son=","$",v_tasas)
	print("el salario neto es= ","$",v_neto)

