public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int megaRemain = kiloBytes % 1024;
        System.out.println(kiloBytes < 0 ? "Invalid Value" :
                kiloBytes + " KB = " + megaBytes + " MB and " + megaRemain + " KB");
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }
}
