Algoritmo mayor_jercicio_6
	//ENUNCIADO=Ealgorimo que dice cual el mayor de los 3 numeros ingresados por el usuario
	//Leer valores de a, b y c
	//Pedir cada valor por teclado
	// y hallar el vnumero mayor
	//Desarerolado por: Jonathan López
	//VERSION=1.1
	//fecha 26/02/23
	//declaracion de variables
	Definir a, b, c Como Real; //variables que alamcenan los nhumeros a comparar
	//inicializacion de variables
	a=0.0;
	b=0.0;
	c=0.0;
	//Entrada de datos
	Escribir "Por favor ingrese el primer numero (a)";leer a;
	Escribir "Por favor ingrese el segundo numero (b)";leer b;
	Escribir "Por favor ingrese el tercer numero (c)";leer c;
	//Procesos y salidas}
	//comparaciones  para saber si 2 o toodos numeros ingresador por el usuario son iguales
	si a=b Entonces
		Escribir "a y b son iguales"; 
	FinSi
	si c=b Entonces
		Escribir "b y c son iguales";
	FinSi
	si a=c Entonces
		Escribir "a y c son iguales";
	FinSi
	si a=b y b=c Entonces
		Escribir "todos los numeros son iguales";
		
	SiNo
	//comparacion para sber cual es el numero mayor
		Si a<b Entonces
			Si b<c Entonces
				Escribir "EL numero amyor es= ",c;
			SiNo
				Escribir "EL numero mayor es= ",b;
			Fin Si
		SiNo
			Si a<c Entonces
				Escribir "El numero mayor es= ",c;
			SiNo
				Escribir "EL numero mayor es =",a;
			Fin Si
		Fin Si
	FinSi
FinAlgoritmo
