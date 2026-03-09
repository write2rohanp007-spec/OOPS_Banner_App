public class BannerApp {

    public static void main(String[] args) {

        // Array to store all banner lines
        String[] banner = {
            String.join(" ", "  *****  ", "  *****  ", " ******  ", " *****  "),
            String.join(" ", " *     * ", " *     * ", " *     * ", "*     * "),
            String.join(" ", "*       *", "*       *", " *     * ", "*      "),
            String.join(" ", "*       *", "*       *", " ******  ", " ***** "),
            String.join(" ", "*       *", "*       *", " *       ", "      *"),
            String.join(" ", " *     * ", " *     * ", " *       ", "*     *"),
            String.join(" ", "  *****  ", "  *****  ", " *       ", " ***** ")
        };

        // Loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}