Algoritmo Factorial_Naturales_Ejercicio_3_16
	//Escribir un algoritmo que calcule el producto de los n primeros números naturales hasta el 12.
	//Leer valores del numero natural
	//Pedir el valor por teclado
	// y hallar el factorial
	//desarrollado por Jonathan López
	//version 1.1
	//fecha 04/03/23
	//declaracion de variables
	Definir v_NumN, v_f Como Entero 
	//inicializacion de variables
	v_NumnN=0//VARIABLE QUE ALMACENA EL NUMERO NATURAL.
	v_f=0 //VARIABLE QUE ALMACENA EL PRODUCTO O FACTORIAL.
	//Entrada de datos
	Escribir "Escriba un numero natura";leer v_NumN
	//Proceso
	Si v_NumN=0 Entonces
		Escribir "Factorial de 0 igual a 1"
	SiNo
		Si v_NumN>0 Entonces
			v_f=1
		SiNo
			Escribir "Numero negativo"
		Fin Si
	Fin Si
	Repetir
		v_f=v_f*v_NumN
		v_NumN=v_NumN-1
	Hasta Que v_NumN=1
	//Salida
	Escribir "Factorial=",v_f
FinAlgoritmo
