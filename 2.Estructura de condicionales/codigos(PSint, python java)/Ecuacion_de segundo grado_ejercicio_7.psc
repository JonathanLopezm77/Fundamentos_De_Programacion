Proceso Ecuacion_de_degundo_grado_Ejercicio_7
	//Enunciado: Encontrar las coordenadas en el plano carteciano x,y para graficar una ecuacion cuadratica o de sgundo grado
	//Leer valores de a, b y c
	//Pedir cada valor por teclado
	//desarrollado por Jonathan López
	//version 1.0
	//fecha 05/03/23
	//declaracion de variables
	
	Definir v_a, v_b, v_c, v_x1, v_x2, v_y, v_verx, v_very, v_ejes  Como Real;
	//inicializacion de variables
	v_a=0.0;
	v_b=0.0;
	v_c=0.0;
	v_x1=0.0;
	v_x2=0.0;
	v_y=0.0;
	v_verx=0.0;
	v_very=0.0;
	v_ejes=0.0;
	//Entrada de datos
	Escribir"Ecuacion ax²+ bx + c";
	Escribir "Por favor escribir el valor de a";
	Leer v_a;
	Escribir "Por favor escribir el valor de b";
	Leer v_b;
	Escribir "Por favor escribir el valor de c";
	Leer v_c;
	//procesos y salidas
	si v_b^2-4*v_a*v_c>0 Entonces
		Escribir"el primer corte con x es";
		v_x1=-(-v_b+RC(v_b^2-4*v_a*v_c))/2*v_a
		Escribir "(", v_x1, ",0", ")";
		Escribir"Elsegundo corte con x es";
		v_x2=-(-v_b-RC(v_b^2-4*v_a*v_c))/2*v_a
		Escribir "(", v_x2, ",0", ")";
	SiNo  
		Escribir "Las raices son imaginarias";
		Escribir -v_b/(2*v_a), "+",(RC(abs(v_b^2-4*v_a*v_c)))/2*v_a, "i"
		Escribir -v_b/(2*v_a), "-",(RC(abs(v_b^2-4*v_a*v_c)))/2*v_a, "i"
	FinSi
	// se emplea el condicional si para encontrar los cortes con el eje x pero si el resultado al que hay que sacar raiz cruadrada es negativo el resultado son numeros imaginarios
	Escribir "el corte con y es";
	v_y=v_a*(0)^2+v_b*(0)+v_c;
	Escribir "(", "0,", v_y, ")";
	//se halla el corte con y en cordendas x,y por eso 0,y
	Escribir "El eje de simetría es";
	v_ejes=-v_b/2*v_a;
	Escribir v_ejes;
	Escribir "El vertice en y es";
	v_very= v_a*(v_ejes)^2+v_b*(v_ejes)+v_c;
	Escribir v_very;
	Escribir "Elvertice en coordenadas (x,y) es";
	Escribir "(", v_ejes, ",", v_very, ")";
	Si v_a>0 Entonces
		Escribir "La funcion es concava hacia arriba";
	SiNo
		Escribir"la funcion es concava hacia abajo";
	Fin Si
	//se emplea el condicional si poara saber hacia donde es concava la funcion y poder graficar 
FinProceso
