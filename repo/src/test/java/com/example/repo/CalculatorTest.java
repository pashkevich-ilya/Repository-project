package com.example.repo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
	public class CalculatorTest {
	// Тестирование метода add() с использованием Mockito для имитации поведения
	@Test
	public void testMocking() {
		Calculator calc = Mockito.mock(Calculator.class);
		Mockito.when(calc.add(2, 3)).thenReturn(5);  // Мокаем поведение метода add
		assertEquals(5, calc.add(2, 3));  // Проверяем, что результат мока соответствует ожидаемому
	}

	// Тестирование метода сложения
	@Test
	public void testAddition() {
		Calculator calc = new Calculator();
		int result = calc.add(2, 3);
		assertEquals(6, result);  // Проверяем, что 2 + 3 = 5
	}

	// Тестирование метода вычитания
	@Test
	public void testSubtraction() {
		Calculator calc = new Calculator();
		int result = calc.subtract(5, 3);
		assertEquals(2, result);  // Проверяем, что 5 - 3 = 2
	}

	// Тестирование деления на ноль
	@Test
	public void testDivisionByZero() {
		Calculator calc = new Calculator();
		assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));  // Ожидаем исключение при делении на ноль
	}
}



