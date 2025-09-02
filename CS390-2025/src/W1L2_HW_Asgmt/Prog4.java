package W1L2_HW_Asgmt;

public class Prog4 {
    public static void main(String[] args) {
        String[] strArray = {"horse", "dog", "cat", "horse", "dog"};
        String[] uniqueStrArray = new String[strArray.length];
        int uniqueCount = 0;

        for (int i = 0; i < strArray.length; i++) {
            String currentStr = strArray[i];
            boolean notUnique = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueStrArray[j] == currentStr) {
                    notUnique = true;
                    break;
                }
            }

            if (!notUnique) {
                uniqueStrArray[uniqueCount] = currentStr;
                uniqueCount++;
            }
        }

        // This is to print the unique values in the new array
        for (int i = 0; i < uniqueCount; i++)  {
            System.out.println(uniqueStrArray[i]);
        }
    }
}
