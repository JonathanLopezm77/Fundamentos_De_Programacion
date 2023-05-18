Algoritmo tiempo_Ejerciocio_04
	//Enunciado: Encontrar el tiempo que tarda en lacanzar la velocidad final un cuespo
	//Leer valores de Vims, Vfkmh, a
	//Pedir cada valor por teclado
	// y hallar el tiempo que tarda
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 08/02/23
	//declaracion de variables
	Definir Vims, Vfkmh, Vfms, a, t Como Real;
	//inicializacion de variables
	Vims=0.0;
	Vfkmh=0.0;
	Vfms=0.0;
	a=0.0;
	t=0.0;
	//Entrada de datos
	Escribir "Por favor ingresar la velocidad inicial en m/s";
	Leer Vims;
	Escribir "Por favor ingresar la velocidad final en km/h";
	Leer Vfkmh;
	Escribir "Por favor ingresar la aceleración en m/s2";
	Leer a;
	//Procesos
	Vfms= Vfkmh * 5/18;
	t= (Vfms -Vims)/a;
	//Salida
	Escribir "La velocidad final en m/s es: ", Vfms;
	Escribir "El tiempo que tarda un cuerpo en lacanzar la velocidad final es: ", t, "s";
	
FinAlgoritmo
