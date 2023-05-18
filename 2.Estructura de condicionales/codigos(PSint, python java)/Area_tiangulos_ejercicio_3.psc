Algoritmo Area_tiangulos_ejercicio_3
	//Enunciado: Encontrar el area de un triaungulo
	//Leer la base y la altura
	//Pedir cada valor por teclado
	// hallar el area del triangulo
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 01/03/23
	//declaracion de variables
	Definir v_l1, v_l2, v_l3, v_sp, v_area Como Real;
	//Inicializacion de variables
	v_l1=0.0;
	v_l2=0.0;
	v_l3=0.0;
	v_sp=0.0;
	v_area=0.0;
	//Entrada de datos
	escribir "Por favor escriba los 3 lados del triangulo";
	leer v_l1,  v_l2, v_l3;
	//Procesos y salidas
	v_sp = (v_l1 + v_l2 + v_l3) / 2;
	si (v_sp > v_l2) y (v_sp > v_l2) y (v_sp > v_l3) entonces
		v_area = rc (v_sp * (v_sp - v_l1) * (v_sp - v_l2) * (v_sp - v_l3));
		escribir v_area;
	SiNo
		escribir"No es un triangulo";
	fin si
FinAlgoritmo
