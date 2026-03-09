import java.util.HashMap;
import java.util.Map;

public class BannerApp {

feature/UC8-MapCharacterPatterns
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

    // Inner Static Class to store character and its pattern
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Utility method to build one line of the banner
    public static String buildLine(CharacterPatternMap[] letters, int row) {

        StringBuilder line = new StringBuilder();

        for (CharacterPatternMap letter : letters) {
            line.append(letter.getPattern()[row]).append(" ");
        }

        return line.toString();
    }

    public static void main(String[] args) {

 feature/UC7-CharacterPatternClass
        // Pattern for letter O
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        // Pattern for letter P
        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        // Pattern for letter S
        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        // Word OOPS (array of objects)
        CharacterPatternMap[] word = {O, O, P, S};

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        String[] banner = {
            String.join(" ", o[0], o[0], p[0], s[0]),
            String.join(" ", o[1], o[1], p[1], s[1]),
            String.join(" ", o[2], o[2], p[2], s[2]),
            String.join(" ", o[3], o[3], p[3], s[3]),
            String.join(" ", o[4], o[4], p[4], s[4]),
            String.join(" ", o[5], o[5], p[5], s[5]),
            String.join(" ", o[6], o[6], p[6], s[6])
        };
 main

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(buildLine(word, i));
        }
    }

    // Method to create pattern for letter O
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to create pattern for letter P
    public static String[] getPPattern() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to create pattern for letter S
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        };
      main
    }
}