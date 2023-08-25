package funcional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ComsumerExample {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
		/*
		 * Usando fora Consumer<Integer> imprimirNumeroPar = numero -> { if (numero % 2
		 * == 0) { System.out.println(numero); } };
		 */
		// Usando Consumer direto
		numeros.stream().forEach(new Consumer<Integer>() {

			public void accept(Integer n) {
				if (n % 2 == 0) {
					System.out.println(n);
				}
			}
		});

		// Usando lambda
		numeros.stream().filter(n -> n % 2 == 0)
		.forEach(System.out::println);

	}
}
