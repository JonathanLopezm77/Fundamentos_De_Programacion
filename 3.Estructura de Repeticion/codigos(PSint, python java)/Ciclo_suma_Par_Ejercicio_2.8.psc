Algoritmo Ejercicio_28_ciclo_suma_pares
	//Enunciado: Encontrar el valor de la suma de los numeros enteros psositivos pares del 2 al 100
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 02/03/23
	//declaracion de variables
	Definir i, suma como enteros;
	//inicializacion de variables
	i=0;
	suma=0;
	//procesos y salidas
	Escribir "Lista de numeros sumados";
	Para i<-2 Hasta 100 Con Paso 2 Hacer
		Escribir i;
		suma=suma + i;
	Fin Para
	Escribir "El resultado de la suma es ", suma;
FinAlgoritmo