Algoritmo Aceleracion_Ejercicio_01
	//Enunciado: Calacula la Aceleración 
	//Leer valores de Vi, Vf y t
	//Pedir cada valor por teclado
	// Hallar la aceleación
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 7/02/23
	//declaracion de variables
	Definir Vf, Vi, t, a Como Real;
	//inicializacion de variables
	Vf=0.0;
	Vi=0.0;
	t=0.0;
	a=0.0;
	//Entrada de datos
	Escribir "Por favor ingrese el valor de la velocidad inicial en m/s";
	Leer Vi;
	Escribir "Por favor ingrese el valor de la velocidad final m/s"; 
	Leer Vf;
	Escribir "Por favor ingrese el valor de el tiempo en segundos";
	Leer t;
	//procesos
	a=(Vf-Vi)/t;
	//salida
	Escribir "la aceleracion ha sido: ", a, "m/s2";
FinAlgoritmo
