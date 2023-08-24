package funcional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	
	public static void main(String[] args) {
		
		List<String> palavras = Arrays.asList("java", "kotlin", "python", "c", "go", "ruby");
		
		Predicate<String> maisDeCincoCarateres = palavra -> palavra.length() > 5;
		
		palavras.stream()
		.filter(t -> t.length()>5)
		.forEach(System.out::println);
	}
}
