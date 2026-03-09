public class BannerApp {

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

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(buildLine(word, i));
        }
    }
}