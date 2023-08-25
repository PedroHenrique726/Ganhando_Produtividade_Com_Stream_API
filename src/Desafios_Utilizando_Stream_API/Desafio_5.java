package Desafios_Utilizando_Stream_API;
import java.util.Arrays;
import java.util.List;

public class Desafio_5 {

	public static void main(String[] args) {
		
		//esafio 5 - Calcule a média dos números maiores que 5:
			//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		System.out.println((numeros.stream().filter(n -> n > 5).reduce(0, (n1, n2) -> n1 + n2)) / numeros.stream().filter(n -> n > 5).count());

		
	}
}
