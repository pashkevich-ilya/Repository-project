package com.example.repo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
	public class CalculatorTest {

	@Test
	public void testMocking() {
		Calculator calc = Mockito.mock(Calculator.class);
		Mockito.when(calc.add(2, 3)).thenReturn(5);
		assertEquals(5, calc.add(2, 3));
	}


	@Test
	public void testAddition() {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		assertEquals(5, result);  // Проверка, что 2 + 3 = 5
	}

	@Test
	public void testSubtraction() {
		Calculator calc = new Calculator();
		int result = calc.subtract(5, 3);
		assertEquals(2, result);  // Проверка, что 5 - 3 = 2
	}

	@Test
	public void testDivisionByZero() {
		Calculator calc = new Calculator();
		assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));  // Ожидаем ошибку при делении на ноль
	}
}



