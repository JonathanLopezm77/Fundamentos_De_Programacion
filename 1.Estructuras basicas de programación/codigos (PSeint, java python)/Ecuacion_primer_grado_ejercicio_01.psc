Algoritmo Ecuacion_primer_grado_ejercicio_01
	//Enunciado: Encontrar el valor de x en una ecuacion lineal tip ax + b
	//Leer valores de a y b
	//Pedir cada valor por teclado
	// y hallar el valor de x
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 28/02/23
	//declaracion de variables
	Definir v_valorA, v_valorB, v_valorX Como Real;
	//inicializacion de variables
	v_valorA=0;
	v_valorB=0;
	v_valorX=0;
	//Entrada
	Escribir "Calculadora de ecuaciones de primer grado tipo ax + b= 0";
	Escribir "Por favor escribir el valor de a";
		Leer v_valorA;
	Escribir "Por favor escribir el valor de b";
		Leer v_valorB;
	v_valorX=(-v_valorB)/v_valorA;
		Escribir " El valor de x es ", v_valorX;
FinAlgoritmo
