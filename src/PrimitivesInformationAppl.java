import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesInformationAppl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // input data from the console
		while (true) {

			System.out.println("Enter integer primitive type (long, int, short, char, byte) or exit: ");

			String line = scanner.nextLine();

			if (line.equals("exit")) {
				System.out.println("Thanks for using our application & bye!");
				break;
			}

			switch (line) {
			case "byte": {
				printInformationByTypeByte(line);
				break;
			}
			case "char": {
				printInformationByTypeChar(line);
				break;
			}
			case "short": {
				printInformationByTypeShort(line);
				break;
			}
			case "int": {
				printInformationByTypeInt(line);
				break;
			}
			case "long": {
				printInformationByTypeLong(line);
				break;
			}
			default:
				System.out.println("Wrong primitive type!\n-----\n");
				break;
			}

		}
	}
	
	// your homework should contain switch by the given type (long, int, short,
	// char, byte)
	// for default there should be out: Wrong primitive type
	// for each type there should be an appropriate method of printing information
	// of the type
	// for example, printCharInformation - method printing out the info about type
	// "char"
	
	private static void printInformationByTypeInt(String line) {
		int minValue = 1;
		int maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n-----\n", minValue,
				maxValue, nBits / 8);

	}

	private static void printInformationByTypeLong(String line) {
		long minValue = 1;
		long maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n-----\n", minValue,
				maxValue, nBits / 8);
	}

	private static void printInformationByTypeByte(String type) {
		byte minValue = 1;
		byte maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (byte) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (byte) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n-----\n", (int) minValue,
				(int) maxValue, nBits / 8);
	}

	private static void printInformationByTypeChar(String type) {
		char minValue = 1;
		char maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (char) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (char) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n-----\n", (int) minValue,
				(int) maxValue, nBits / 8);
	}

	private static void printInformationByTypeShort(String type) {
		short minValue = 1;
		short maxValue = 1;
		int nBits = 1;
		while (minValue > 0) {
			minValue = (short) (minValue * 2);
			nBits = nBits + 1;
		}
		maxValue = (short) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n-----\n", (int) minValue,
				(int) maxValue, nBits / 8);
	}
}
