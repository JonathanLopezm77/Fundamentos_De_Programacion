Algoritmo ciclo_suma_E_Ejercicio_315
	//Enunciado: Encontrar el valor de la suma consecutiva de los numeros enteros positivos del 1 al 50
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 01/03/23
	//declaracion de variables
	Definir i, suma como enteros
	//inicializacion de variables
	i=0;
	suma=0;
	//procesos y salidas
	Escribir "Lista de numeros sumados";
	Para i<-1 Hasta 50 Con Paso 1 Hacer
		Escribir i;
		suma=suma + i;
	Fin Para
	Escribir "El resultado de la suma es ", suma;
FinAlgoritmo
