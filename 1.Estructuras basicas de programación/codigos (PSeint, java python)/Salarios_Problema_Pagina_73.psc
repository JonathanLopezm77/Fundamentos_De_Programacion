Algoritmo Salarios_Problema_Pagina_73
	//Enunciado: Calcular el salario bruto y el salario neto de un trabajador "por horas" conociendo el nombre, número de horas trabajadas, impuestos a pagar y salario neto.
	//Leer ne, ht y vh
	//Pedir cada valor por teclado
	//desarrollado por Jonathan López
	//version 1.0
	//fecha  24/02/23
	//declaracion de variables
	Definir v_ne Como Caracter;
	Definir v_ht Como Entero;
	Definir v_vh Como real;
	Definir v_sb Como real;
	Definir v_tasas Como real;
	definir v_neto Como real;
	//inicializacion de variables
	v_ne="";
	v_ht=0;
	v_vh=0.0;
	v_sb=0.0;
	v_tasas=0.0;
	v_neto=0.0;
	//entrada de datos
	Escribir "Por favor escriba el nombre del empleado";Leer v_ne;
	Escribir "Por favor escriba la cantidad de horas trabajadas";leer v_ht;
	Escribir "Por favor escriba el valor hora";Leer v_vh;
	//Proceos
	v_sb=v_ht*v_vh;
	v_tasas=v_sb*0.25;
	v_neto=v_sb-v_tasas;
	//Salida
	Escribir "el nomnbre del empleado es= ",v_ne;
	Escribir "el salario bruto es= ","$",v_sb;
	Escribir "los impuestos o tasas a pagar son=","$",v_tasas;
	Escribir "el salario neto es= ","$",v_neto;
FinAlgoritmo
