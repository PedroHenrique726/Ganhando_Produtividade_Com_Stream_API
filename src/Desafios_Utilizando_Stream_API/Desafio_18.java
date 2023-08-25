package Desafios_Utilizando_Stream_API;
import java.util.Arrays;
import java.util.List;

public class Desafio_18 {

	public static void main(String[] args) {
		
		
		//Desafio 18 - Filtrar os números primos da lista:
			//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(numeros.stream().filter(n -> Desafio_14.ePrimo(n)).toList());
		
	}
}