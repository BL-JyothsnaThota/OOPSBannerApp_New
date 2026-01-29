package banner;

public class OOPSBanner {
	 static class CharacterPatternMap {
	        private String[] pattern;

	        public CharacterPatternMap(String[] pattern) {
	            this.pattern = pattern;
	        }

	        public String[] getPattern() {
	            return pattern;
	        }
	    }

	    public static void printBanner(CharacterPatternMap[] chars) {
	        for (int i = 0; i < 7; i++) {
	            for (CharacterPatternMap c : chars) {
	                System.out.print(c.getPattern()[i] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {

	        String[] O = {
	                "  *****  ",
	                " *     * ",
	                "*       *",
	                "*       *",
	                "*       *",
	                " *     * ",
	                "  *****  "
	        };

	        // ✅ P – EXACT AS YOU PROVIDED
	        String[] P = {
	                "********  ",
	                "*       * ",
	                "*       * ",
	                "********  ",
	                "*         ",
	                "*         ",
	                "*         "
	        };

	        // ✅ S – EXACT AS YOU PROVIDED
	        String[] S = {
	                "********* ",
	                "*         ",
	                "*         ",
	                "********* ",
	                "        * ",
	                "        * ",
	                "********* "
	        };

	        CharacterPatternMap o1 = new CharacterPatternMap(O);
	        CharacterPatternMap o2 = new CharacterPatternMap(O);
	        CharacterPatternMap p  = new CharacterPatternMap(P);
	        CharacterPatternMap s  = new CharacterPatternMap(S);

	        CharacterPatternMap[] banner = { o1, o2, p, s };

	        printBanner(banner);
	    }
}
