package Desafios_Utilizando_Stream_API;
import java.util.Arrays;
import java.util.List;

public class Desafio_17 {

	public static void main(String[] args) {
		
		//Desafio 17 - Agrupe os números em pares e ímpares:
			//Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
			
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		

		System.out.println("Os numeros pares da lista são: " + numeros.stream().filter(n -> n% 2 == 0).toList());
		System.out.println("Os numeros impares da lista são: " + numeros.stream().filter(n -> n% 2 != 0).toList());
		
	}
}
