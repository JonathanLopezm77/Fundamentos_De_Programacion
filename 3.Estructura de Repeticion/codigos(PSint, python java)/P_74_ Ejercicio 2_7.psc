Algoritmo Secuencia_Ejercicio_2_7
	//Enunciado:cular la media de una serie de números positivos, suponiendo que los datos se leen desde un terminal. 
	//Leer valores de v_dato
	//Pedir cel valor por teclado
	// y hallar la media
	//desarrollado por Jonathan López
	//version 1.1
	//fecha 26/02/2023
	//declaracion de variables
	Definir v_i Como Entero;//VARIABLE DE ENTRADA QUE CUENTA LOS NUMEROS
	Definir v_suma Como real; //VARIABLE DE ENTRADA QUE SUMA LOS NUMEROS
	Definir v_num Como Real; //VARIABLE DE PROCESO QUE ALMACENA EL NUMERO ESCRITO
	Definir v_media Como Real; //VARIABLE DE SALIDA QUE ALMACENA LA MEDIA
	//inicializacion de variables
	v_i=0;
	v_suma=0.0;
	v_num=0.0;
	v_media=0.0;
	//Procesos
	Escribir "Por favor introduzca los numeros de los cuales desea sacar la media para fiinalizar digite 0";
	Repetir
		//Entrada de dato
		Leer v_num;
	//procesos
		Si v_num=0 Entonces
			v_media=v_suma/v_i;
		SiNo
		si v_num<0 Entonces 
			Escribir "Este programa no suma numeros negativos";
		SiNo
			v_i=v_i+1;
			v_suma=v_suma+v_num;
		fin si
		Fin Si
	Hasta Que v_num=0 o v_num<0
	
	//Salida
	Escribir"la media es= ",v_media;
FinAlgoritmo
