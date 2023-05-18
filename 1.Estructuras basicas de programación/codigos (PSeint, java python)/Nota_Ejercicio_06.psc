Algoritmo Ejercicio_06
	//Enunciado: Encontrar el valor de x en una ecuacion lineal tip ax + b
	//Leer valores de a y b
	//Pedir cada valor por teclado
	// y hallar el valor de x
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 28/02/23
	//Declaracion de variables
	Definir v_n1,v_n2,v_n3,v_p1,v_p2,v_p3,v_np,v_ns,v_nt,v_N,v_ND Como Real;
	Definir v_si, v_ina Como Entero;
	Definir v_NomEst, v_NomAsi Como Caracter;
	//Inicializacion de variables
	v_n1=0.0;
	v_n2=0.0;
	v_n3=0.0;
	v_p1=0.0;
	v_p2=0.0;
	v_p3=0.0;
	v_np=0.0;
	v_ns=0.0;
	v_nt=0.0;
	v_N=0.0;
	v_ND=0.0;
	v_si=0;
	v_ina=0;
	v_NomEst="";
	v_NomAsi="";
	// Entrada de datos
	Escribir "Por favor ingrese el nombre del estudiante";
	Leer v_NomEst;
	Escribir "Por favor ingrese el nombre e la asignatura";
	Leer  v_NomAsi;
	Escribir 'Por favor ingrese nota del primer parcial';
	Leer v_n1;
	Escribir 'Por favor ingrese nota del segundo parcial';
	Leer v_n2;
	Escribir 'Por favor ingrese nota del tercer parcial';
	Leer v_n3;
	Escribir 'Por favor ingrese el primer porsentaje recuerde que debe ser en decimal así 10%= 0.1';
	Leer v_p1;
	Escribir 'Por favor ingrese el segundo porsentaje';
	Leer v_p2;
	Escribir 'Por favor ingrese el tercer porsentaje ';
	Leer v_p3;
	Escribir 'Por favor Ingrese la cantidad de inacistencias';
	Leer v_ina;
	// Procesos y salidas 
	Escribir 'la nota del primaer parcial es ';
	v_np <- v_n1*v_p1;
	Escribir v_np;
	Escribir 'la nota del segundo parcial es ';
	v_ns <- v_n2*v_p2;
	Escribir v_ns;
	Escribir 'la nota del segundo parcial es ';
	v_nt <- v_n3*v_p3;
	Escribir v_nt;
	Escribir 'La nota es ';
	v_N <- v_np+v_ns+v_nt;
	Escribir v_N;
	Escribir 'si el numero de inacistencias es menor a 12 y nota  es mayor a 3.5 opcion 1, si el numero de inacistencias es menor a 12 pero la nota es menor a 3.5 opcion 2, si el numero de inacistencias es mayor o igual a 12 opcion 3 ';
	Leer v_si
	Segun v_si  Hacer
		1:
			Escribir 'aprueba academicamente';
			Escribir 'la Nota definitiva es igual a ';
			v_ND = v_N;
			Escribir v_ND;
		2:
			Escribir 'reprueba academicamente';
			Escribir 'la Notade definitiva es igual a';
			v_ND =v_N;
			Escribir v_ND;
		3:
			Escribir 'reprueba por inacistencias';
			Escribir 'la Notade definitiva es igual a';
			v_ND = v_N/2;
			Escribir v_ND;
	FinSegun;
FinAlgoritmo
