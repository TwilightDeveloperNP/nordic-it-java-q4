package CalcFullPAC;

import java.util.Scanner;

public class FullVer {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		 String TypeOperation ;
		do {
		TypeOperation = operations(scanner);
		} while (!condition(TypeOperation));

	}

	public static String operations(Scanner scanner) {
		String TypeOperation;
		System.out.println("Выбирите тип операции(команда(тип операции)):+, -, *, /, % -  ост. от дел., div - целочис.дил");
		 TypeOperation = scanner.next();
		
		switch (TypeOperation) {
		case "+":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resA = First + Sec;
			System.out.println("Результат операции сложения:" + resA);
			break;
		}
		case "-":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resB = First - Sec;
			System.out.println("Результат операции разности:" + resB);
			break;
		}
		case "*":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resC = First * Sec;
			System.out.println("Результат операции умножения:" + resC);
			break;
		}
		case "/":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resD = (double)First / (double)Sec;
			System.out.println("Результат операции деления:" + resD);
			break;
		}
		case "%":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resE = First % Sec;
			System.out.println("Результат операции остаток от деления:" + resE);
			break;
		}
		case "div":{
			System.out.println("Введите первую переменную");
			var First = scanner.nextInt();
			System.out.println("Введите вторую переменную");
			var Sec = scanner.nextInt();
			var resF = First / Sec;
			System.out.println("Результат операции целочисленное деление:" + resF);
			break;
		}
		default: {
			System.out.println("Введена не правильная операция, попробуйте еще раз:");
		}
		}
		return TypeOperation;
	}

	public static boolean condition(String TypeOperation) {
		return "+".equals(TypeOperation) || "-".equals(TypeOperation) || "*".equals(TypeOperation) || "/".equals(TypeOperation) || "%".equals(TypeOperation) || "div".equals(TypeOperation);
	}

}
