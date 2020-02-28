/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase.toLowerCase();
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString() {
        byte[] byteOfUserInputString = userInputStringInLowerCase.getBytes();
        StringBuilder binaryOfUserInputtedString = new StringBuilder();
        for (byte byteHolder : byteOfUserInputString) {
            int temp = byteHolder;
            for (int i = 0; i < 8; i++) {
                binaryOfUserInputtedString.append((temp & 128) == 0 ? 0 : 1);
                temp <<= 1;
            }
            binaryOfUserInputtedString.append(' ');
        }
        return binaryOfUserInputtedString.toString();
    }
}
