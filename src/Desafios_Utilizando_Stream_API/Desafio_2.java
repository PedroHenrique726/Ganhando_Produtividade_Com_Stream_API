package Desafios_Utilizando_Stream_API;
import java.util.Arrays;
import java.util.List;

public class Desafio_2 {

	public static void main(String[] args) {
		
		//Desafio 2 - Imprima a soma dos números pares da lista:
			//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println(numeros.stream().filter(x -> x % 2 ==0).reduce(0, (n1, n2) -> n1 + n2));

		
	}
}
