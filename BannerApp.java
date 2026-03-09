import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Method to create character patterns
    public static Map<Character, String[]> createCharacterPatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return patterns;
    }

    // Method to print banner message
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = patterns.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = createCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}