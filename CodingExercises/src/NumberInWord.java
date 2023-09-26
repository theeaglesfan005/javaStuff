public class NumberInWord {

    public static void printNumberInWord(int number) {
        System.out.println(switch (number) {
                    case 0 -> "ZERO";
                    case 1 -> "ONE";
                    case 2 -> "TWO";
                    case 3 -> "THREE";
                    case 4 -> "FOUR";
                    case 5 -> "FIVE";
                    case 6 -> "SIX";
                    case 7 -> "SEVEN";
                    case 8 -> "EIGHT";
                    case 9 -> "NINE";
                    default -> "OTHER";
                }
        );
    }

    public static void printNumberInWordForUdemy(int number) {
        String wordNumber = "OTHER";

        switch (number) {
            case 0:
                wordNumber = "ZERO";
                break;
            case 1:
                wordNumber = "ONE";
                break;
            case 2:
                wordNumber = "TWO";
                break;
            case 3:
                wordNumber = "THREE";
                break;
            case 4:
                wordNumber = "FOUR";
                break;
            case 5:
                wordNumber = "FIVE";
                break;
            case 6:
                wordNumber = "SIX";
                break;
            case 7:
                wordNumber = "SEVEN";
                break;
            case 8:
                wordNumber = "EIGHT";
                break;
            case 9:
                wordNumber = "NINE";
                break;
            default:
                break;
        }
        System.out.println(wordNumber);
    }

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(-1);
        printNumberInWord(10);
        System.out.println();
        System.out.println("FOR UDEMY:");
        printNumberInWordForUdemy(0);
        printNumberInWordForUdemy(1);
        printNumberInWordForUdemy(2);
        printNumberInWordForUdemy(3);
        printNumberInWordForUdemy(4);
        printNumberInWordForUdemy(5);
        printNumberInWordForUdemy(6);
        printNumberInWordForUdemy(7);
        printNumberInWordForUdemy(8);
        printNumberInWordForUdemy(9);
        printNumberInWordForUdemy(-1);
        printNumberInWordForUdemy(10);
    }
}
