import java.util.*;

public class Cipher2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secretCode = scanner.nextLine();

        String cipher = scanner.nextLine();

        List<String> originalMessages = decodeMessages(secretCode, cipher);

        System.out.println(originalMessages.size());
        originalMessages.forEach(System.out::println);
    }

    private static List<String> decodeMessages(String secretCode, String cipher) {
        Map<Character, String> letterToCodeMap = new HashMap<>();

        // Populate the letter to code map from the cipher
        for (int i = 0; i < cipher.length(); i++) {
            char letter = cipher.charAt(i);
            String code = getCodeFromCipher(cipher, i);
            i += code.length();
            letterToCodeMap.put(letter, code);
        }
        List<String> originalMessages = new ArrayList<>();

        generateOriginalMessages(secretCode, 0, new StringBuilder(), letterToCodeMap, originalMessages);

        Collections.sort(originalMessages);

        return originalMessages;
    }

    private static String getCodeFromCipher(String cipher, int startIndex) {
        StringBuilder codeBuilder = new StringBuilder();

        int i = startIndex + 1;
        while (i < cipher.length() && Character.isDigit(cipher.charAt(i))) {
            codeBuilder.append(cipher.charAt(i));
            i++;
        }
        return codeBuilder.toString();
    }

    private static void generateOriginalMessages(String secretCode, int index, StringBuilder currentMessage,
                                                 Map<Character, String> letterToCodeMap, List<String> originalMessages) {
        if (index == secretCode.length()) {
            originalMessages.add(currentMessage.toString());
            return;
        }

        for (Map.Entry<Character, String> entry : letterToCodeMap.entrySet()) {
            char letter = entry.getKey();
            String code = entry.getValue();
            if (secretCode.startsWith(code, index)) {


                generateOriginalMessages(secretCode, index + code.length(), currentMessage.append(letter), letterToCodeMap, originalMessages);
                currentMessage.setLength(currentMessage.length() - 1);

            }

        }
    }
}


