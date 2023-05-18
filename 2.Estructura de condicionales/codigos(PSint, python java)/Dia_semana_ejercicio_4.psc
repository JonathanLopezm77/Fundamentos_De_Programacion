Algoritmo Dia_semana_ejercicio_4
	//Enunciado: Encontrar el dia de la semana con una fecha
	//Leer valor dia
	//Pedir valor dia por teclado
	//hallar el dia de la semana
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 2/03/23
	//declaracion de variables
	
	Definir v_dia Como Entero;
	escribir"Por favor ingrese el dia ";
	//inicializacion de variables
	dia=0;
	//Entrada de datos
	leer v_dia ;
si v_dia<=31 Entonces
	segun v_dia MOD 7 hacer
		0:
			Escribir "Domingo";
			
		1:
			Escribir "Lunes";
		2:
			Escribir  "Martes";
		3:
			Escribir "Miercoles";
		4:
			Escribir "Jueves";
		5:
			Escribir "Viernes";
		6:
			Escribir "Sabado";
	FinSegun
SiNo
	Escribir "ningun mes tiene mas de 31 dias ";	

FinSi

FinAlgoritmo
