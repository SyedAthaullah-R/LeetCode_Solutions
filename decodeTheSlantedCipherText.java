// Time Complexity: O(m * n)
public class decodeTheSlantedCipherText {
    public String decodeCipherText(String encodedText, int rows) {
        int cols = encodedText.length() / rows;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char[][] decode = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                decode[i][j] = encodedText.charAt(count++);
            }
        }
        for (int col = 0; col < cols; col++) {
            int i = 0, j = col;
            while (i < rows && j < cols) {
                sb.append(decode[i][j]);
                i++;
                j++;
            }
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' ')
            sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        decodeTheSlantedCipherText a = new decodeTheSlantedCipherText();
        System.out.println(a.decodeCipherText("iveo    eed   l te   olc", 4));
    }
}
