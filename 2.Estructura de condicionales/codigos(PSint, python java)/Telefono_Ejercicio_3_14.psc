Algoritmo TELEFONO_Ejercicio_3_14
	//Enunciado:Determinar la cantidad total a pagar por una llamada telefónica, teniendo en cuenta lo siguiente:
	//el coste minimo de una llamada es 10 centimos  este costo se mantiene en los primeros 3 minutos
	//cualquier minuto adicional se cobra a 5 centimos
	//Creado por: Jonathan Lopez
	//version 1.0
	//fecha 28/02/23
	//declaracion de variables
	Definir v_NumPas, v_CLL, v_NumPasEx  Como Entero; 
	//inicializacion de variables
	v_NumPas=0;//variable que alamacena la cantidad 
	v_CLL=0;//variable donde se alamcena el costo de la llamada
	v_NumPasEx=0;//variable que alamacaena la cantidad de pasos depues de los 3 minutos
	//Entrada de datos
	Escribir "Escribir numero de pasos";Leer v_NumPas;
	//Proccesos
	Si v_NumPas <0 Entonces;
		Escribir "ERROR";
		v_NumPas=0;//porque no puden cobrar pasos negativos
	sino
	v_CLL=10;//porque el cobro minimo es de 10 
	v_NumPasEx=v_NumPas-5;
	Si v_NumPasEx>0 Entonces
		v_CLL=v_CLL+v_NumPasEx*5;//por cada paso se agregan 5 centimos
	Fin Si
Fin Si
	//Salida
	Escribir "PASOS=",v_NumPas;
	Escribir "VALOR DE LA LLAMADA=",v_CLL,"CENTIMOS";//resuktado final imprime la cantidad de pasos y los centimos a pagar por ewl ususario
FinAlgoritmo
