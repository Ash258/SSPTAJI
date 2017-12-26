package FinalMaturitaCodes;

public class Numbers{

	/**
	 * Metoda pro zjištění, zda je zadané číslo Mersennovo prvočíslo. Mersennovo prvočíslo je takové, které je o jedna
	 * menší než celočíselná mocnina dvojky.
	 *
	 * @param n Hodnota, u které se má zjistit, zda je Mersennovo prvočíslo
	 *
	 * @return
	 */
	private static boolean isMersenne(int n){
		for(int i = 0; power(2, i) < n; i++) {
			if(n == power(2, i + 1) - 1) {
				return true;
			}
		}
		return false;
	}

	private static int power(int a, int b){
		int result = 1;
		for(int i = 0; i < b; i++) {
			result *= a;
		}
		return result;
	}

	/**
	 * Metoda pro vyjádření prvočíselného rozkladu zadaného čísla. Prvočíselná faktorizaca je vyjádření přirozeného
	 * čísla jako součinu mocnin prvočísel.
	 *
	 * @param value Číslo, které se má prvočíselné rozložit.
	 *
	 * @return Prvočíselný rozklad daného čísla.
	 */
	public static String primeFactorization(int value){
		int    tmp      = value;
		String finalStr = "";
		for(int i = 2; i <= Math.sqrt(tmp); i++) {
			while(tmp % i == 0) {
				tmp = tmp / i;
				finalStr += i + " * ";
			}
		}
		if(tmp > 1) finalStr += tmp;
		return finalStr;
	}

	/**
	 * Metoda pro nalezení všech prvočísel do zadaného maxima pomocí Eratosthenesova algoritmu.
	 *
	 * @param max Horní mez
	 */
	public static boolean[] sieveOfEratosthenes(int max){
		boolean[] sieve = new boolean[max];
		sieve[0] = sieve[1] = true;
		for(int i = 2; i <= Math.sqrt(sieve.length); i++) {
			if(sieve[i] == true) continue;
			for(int j = 2 * i; j < sieve.length; j += i) {
				sieve[j] = true;
			}
		}
		return sieve;
		//printSieve(sieve);
	}

	/**
	 * Metoda pro vypsání Erasthenovova síta.
	 *
	 * @param sieve Síto, které se má vypsat
	 */
	private static void printSieve(boolean[] sieve){
		for(int i = 2; i < sieve.length; i++) {
			if(sieve[i] == false) System.out.print(i + " ");
		}
	}

	/**
	 * Metoda pro výpočet faktoruálu zadaného čísla. Pouze pro integer. Faktoriál je číslo, rovné součinu všech kladných
	 * celých čísel menších nebo rovných n, pokud je n kladné a 1 pokud n = 0.
	 *
	 * @param value Hodnota pro výpočet faktoriálu
	 *
	 * @return faktoriál daného čísla, -1 při neplatném vstupu
	 */
	public static int factorial(int value){
		if(value < 0) {
			return -1;
		} else if(value == 0 || value == 1) {
			return 1;
		}
		return value * factorial(value - 1);
	}

	/**
	 * Metoda pro zjištění, zda je dané číslo dokonalé. Dokonalé číslo je číslo, u kterého platí, že je součtem všech
	 * svých dělitelů (kromě sebe samotného).
	 *
	 * @param value Hodnota, u které chceme zjistit, zda je dokonalá
	 *
	 * @return true Pokud je číslo dokonalé.
	 */
	public static boolean isPerfectNumber(int value){
		int temp = 0;
		for(int i = 1; i <= value / 2; i++) {
			if(value % i == 0) {
				temp += i;
			}
		}
		if((temp == value) && (temp != 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metoda pro zjištění, zda je zadané číslo palindrom. Palindromické číslo je „symetrické“ číslo. Jeho hodnota se
	 * nezmění pokud jeho číslice napíšeme v opačném pořadí
	 *
	 * @param value Hodnota, u které chceme zjistit, zda je palindrom
	 *
	 * @return true Pokud je zadané číslo palindrom
	 */
	public static boolean isPalindromicNumber(int value){
		int palindrome = value;
		int reverse    = 0;
		while(palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if(value == reverse) {
			return true;
		}
		return false;
	}

	/**
	 * Metoda pro zjištění, zda je zadané číslo palindrom (Pomocí stringBuilderu). Palindromické číslo je „symetrické“
	 * číslo. Jeho hodnota se nezmění pokud jeho číslice napíšeme v opačném pořasdí
	 *
	 * @param value Hodnota, u které chceme zjistit, szda je palindrom
	 *
	 * @return true Pokud je zadané číslo palindrom
	 */
	public static boolean isPalindromicNumberString(int value){
		StringBuilder sb      = new StringBuilder(Integer.toString(value));
		String        normal  = Integer.toString(value);
		String        reverse = sb.reverse().toString();
		if(normal.equals(reverse)) {
			return true;
		}
		return false;
	}

	/**
	 * Metoda pro zjištění, zda je zadané číslo prvočíslo. Prvočísla jsou Přirozené číslo, které je beze zbytku
	 * dělitelné právě dvěma různými přirozenými čísly, a to číslem jedna a sebou samým 1 není prvočíslo
	 *
	 * @return true Pokud je číslo prvočíslo
	 */
	public static boolean isPrimeNumber(int value){
		if(value <= 1) return false;
		for(int index = 2; index < Math.sqrt(value); index++) {
			if((value % index) == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Metoda pro zjištění, zda je zadané číslo abundantní. Abundantní číslo je takové číslo, které je menší než součet
	 * jeho vlastních dělitelů. Každé celé číslo větší než 20 161 lze zapsat jako součet dvou abundantních čísel
	 *
	 * @param value Hodnota, u které chceme zjistit, zda je abundantní
	 *
	 * @return true Pokud je abundantní
	 */
	public static boolean isAbundantNumber(int value){
		int tmp = 0; //Pomocná proměnná pro sčítání dělitelů.
		for(int index = 1; index < value; index++) {
			if((value % index) == 0) {
				tmp += index;
			}
		}
		if(value < tmp) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Zjistí, zda je zadané číslo deficientní. Součet všech kladných dělitelů kromě n samého s(n) < n
	 *
	 * @param value Hodnota, pro kterou se má zjistit, zda je deficientní
	 *
	 * @return TRUE Pokud je hodnota deficientní
	 */
	public static boolean isDeficientNumber(int value){
		int tmp = 0; //Pomocná proměnná pro sčítání dělitelů.
		for(int index = 1; index < value; index++) {
			if((value % index) == 0) {
				tmp += index;
			}
		}
		if(value > tmp) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metoda pro zjištění počtu cifer Pomocí String.length();
	 *
	 * @param value Hodnota pro zjištění počtu cifer
	 *
	 * @return Počet cifer zadaného čísla
	 */
	public static int countDecimalPlaces(int value){
		int    count       = 0;
		String valueString = Integer.toString(Math.abs(value));
		count = valueString.length();
		return count;
	}

	/**
	 * Určení počtu desetinných míst v doublu.
	 *
	 * @param value Hodnota pro zjištění
	 */
	public static void countDecimalPlacesDouble(double value){
		String text          = Double.toString(Math.abs(value));
		int    integerPlaces = text.indexOf('.');
		int    decimalPlaces = text.length() - integerPlaces - 1;
	}

	/**
	 * Metoda pro zjištění ciferného součtu zadaného čísla
	 *
	 * @param value Číslo, u kterého se má zjistit ciferný součet
	 *
	 * @return sum Ciferný součet daného čísla
	 */
	public static int sumDigits(int value){
		int sum = 0;
		//Záporné číslo se převede na kladné
		if(value < 0) {
			value = Math.abs(value); //Pomocí absolutní hodnoty
			//value *= -1;
		}
		while(value > 0) {
			sum += value % 10;
			value /= 10;
		}
		sum += value;
		return sum;
	}

	/**
	 * Rekurzivní metoda pro zjištění největšího společného jmenovatele pomocí Euklidova algoritmu.
	 *
	 * @param numerator Čitatel
	 * @param denominator Jmenovatel
	 *
	 * @return greatestCommonDivisor_Euklidean(numerator, denominator)
	 */
	public static int greatestCommonDivisor_Euklidean(int numerator, int denominator){
		if(denominator == 0) return numerator;
		return greatestCommonDivisor_Euklidean(denominator, numerator % denominator);
	}

	/**
	 * Collatzova posloupnost
	 *
	 * @param n Číslo
	 */
	public static void collatz(int n){
		System.out.println(n);
		//		if(n > max){
		//			max = n;
		//		}
		if(n == 1) {
			//System.out.println("Max = " + max);
			//System.out.println("Počet = " + count);
			return;
		} else if(n % 2 == 0) {
			//count++;
			collatz(n / 2);
		} else {
			//count++;
			collatz(3 * n + 1);
		}
	}

	/**
	 * Výpočet diskriminantu.
	 *
	 * @param a x^2
	 * @param b x^1
	 * @param c x^0
	 */
	public static String discriminant(double a, double b, double c){
		double D = Math.pow(b, 2) - (4 * a * c);
		if(D == 0) {
			//jeden koren
			double x1 = x1 = (-b + Math.sqrt(D)) / (2 * a);
			return "x1: " + x1;
		} else if(D < 0) {
			return 0 + " - Nelze ";
		} else {
			//vse v poradku, spocitam koreny (x1=(-b+√D)/(2a), x2=(-b+√D)/(2a))
			double x1 = x1 = (-b + Math.sqrt(D)) / (2 * a);
			double x2 = x2 = (-b - Math.sqrt(D)) / (2 * a);
			return "x1: " + x1 + System.lineSeparator() + "x2: " + x2;
		}
		//return D;
	}

	/**
	 * Fibonacciho posloupnost.
	 *
	 * @param index pořadí čísla (od 0)
	 *
	 * @return Fibonacciho číslo na daném pořadí
	 */
	public static int fibonacci(int index){
		if(index == 0) return 0;
		if(index == 1) return 1;
		int prePre = 0; //predminule cislo
		int pre    = 1; //minule cislo
		int result = 0; //vysledek
		for(int i = 1; i < index; i++) { //poci od druheho indexu
			result = prePre + pre; //vysledek je soucet dvou minulych cisel
			prePre = pre; //v dalsim kroku je minule predminulym
			pre = result; //a vysledek je minulym cislem
		}
		return result;
		//Rekurzivně - nevhodné
		/*
		if(index == 0) { return 0; } else if(index == 1) { return 1; } else {
			return fibonacci(index - 1) + fibonacci(index - 2);
		}
		*/
	}

	public static void main(String[] args){
		//System.out.println(sumDigits(12345));
		//System.out.println(countDecimalPlaces(34714));
		//System.out.println(isAbundantNumber(24));
		//System.out.println(isPrimeNumber(997));
		//System.out.println(isPrimeNumber(2));
		//System.out.println(greatestCommonDivisor_Euklidean(778, 84));
		//System.out.println(isPalindromicNumberString(121));
		//System.out.println(isPalindromicNumber(121));
		//System.out.println(isPerfectNumber(28));
		//System.out.println(isMersennePrimeNumber(2));
		//System.out.println(factorial(5));
		//printSieve(sieveOfEratosthenes(50));
		//System.out.println(primeFactorization(5000));
		//collatz(6);
		//System.out.println(fibonacci(25));
		//MersennePrimeNumber(65);
		//System.out.println(isMersenne(32));
	}
}
