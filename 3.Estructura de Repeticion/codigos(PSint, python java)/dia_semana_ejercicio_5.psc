Algoritmo dia_semana_ejercicio_5
	//Enunciado: Encontrar el dia de la semana con una fecha ingresando el primer dia del mes
	//Leer valore dia y primer dia del mes
	//Pedir valores por teclado
	//hallar el dia de la semana
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 2/03/23
	//declaracion de variables
	Definir v_dia, v_d1 como entero;
	Definir v_dia1 Como Caracter;
	//Inicialiacion variables
	v_dia=0;
	v_d1=0;
	v_dia1="";
	//Entrada de datos
	escribir "Cual fue el primer dia del mes (L,M,X,J,V,S,D)";
	leer v_dia1;
	//Procesos y salidas
	Segun v_dia1 Hacer
'L':
	v_d1<- 0;
'M':
	v_d1<- 1;
'X':
	v_d1<- 2;
'J':
	v_d1<- 3;
'V':
	v_d1<- 4;
'S':
	v_d1<- 5;
'D':
	v_d1<- 6;
	Fin segun
	Escribir "Por favor ingresar el dia";
	leer v_dia ;
	v_dia = v_dia + v_d1;
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
FinAlgoritmo
