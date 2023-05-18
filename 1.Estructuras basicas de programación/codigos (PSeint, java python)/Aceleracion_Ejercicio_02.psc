Algoritmo Aceleracion_Ejercicio_02
	//Enunciado: Calcular la aceleración
	//Leer valores Vfkmh, Vikkmh y t
	//Pedir cada valor por teclado
	// y hallar la aceleración
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 07/02/23
	//declaracion de variables
	Definir Vfkmh, Vikmh, t, Vfms, Vims, a Como Real;
	//inicializacion de variables
	Vfkmh=0.0;
	Vikmh=0.0;
	t=0.0;
	Vfms=0.0;
	Vims=0.0;
	a=0.0;
	//Entrada de datos
	Escribir "Por favor ingrese la velocidad inicial en km/h";
	Escribir "Recuerde que si parte del reposo la velocidad inicial es 0";
	Leer Vikmh;
	Escribir "Por favor ingrese la velocidad final en km/h";
	Leer Vfkmh;
	Escribir "Por favor ingrese el tiempo en segundos";
	Leer t;
	//Proceso
	Vfms= Vfkmh * (5/18);
	Vims= Vikmh * (5/18);
	a= (Vfms-Vims)/t;
	//Salida
	Escribir "La velocidad final en m/s es: ", Vfms;
	Escribir "La velocidad inicial en m/s es: ", Vims;
	Escribir "La aceleración fue de: ", a, "m/s2";
FinAlgoritmo
