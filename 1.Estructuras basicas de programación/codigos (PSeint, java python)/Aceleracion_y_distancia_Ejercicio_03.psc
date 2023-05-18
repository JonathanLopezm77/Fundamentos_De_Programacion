Algoritmo Aceleracion_y_distancia_Ejercicio_03
	//Enunciado: Encontrar la aceleracion y diatancia
	//Leer valores de Vi, Vf, t
	//Pedir cada valores por teclado
	// y hallar la aceleracion y la distancia
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 08/02/23
	//declaracion de variables
	Definir Vf, Vi, t, a, d Como Real;
	//inicializacion de variables
	Vf=0.0;
	Vi=0.0;
	t=0.0;
	a=0.0;
	d=0.0;
	//Entrada de datos
	Escribir "Por favor ingresar la velocidad inicial en m/s";
	Leer Vi;
	Escribir "Por favor ingresar la velocidad final en m/s";
	Leer Vf;
	Escribir "Por favor ingresar el tiempo en segundos";
	Leer t;
	//Procesos
	a= (Vf-Vi)/t;
	d= (Vi * t) + (1/2 * a)* (t^2);
	//Salida
	Escribir "La aceleracion fue de: ", a, "m/s2";
	Escribir "La distancia recorrida fue de: ", d, "m";
FinAlgoritmo
