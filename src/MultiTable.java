public class MultiTable {
    public static void main(String[] args) {
        int startNumber = 2;
        StringBuilder currentLine = new StringBuilder();
        do{
            for (int secondMultNumber = 1; secondMultNumber <= 10; secondMultNumber++) {
                for (int firstMultNumber = startNumber; firstMultNumber < startNumber + 4; firstMultNumber++) {
                    currentLine.append(getExpression(firstMultNumber, secondMultNumber) + "     ");
                }
                System.out.println(currentLine);
                currentLine.delete(0, currentLine.length());
            }
            System.out.println();
            startNumber += 4;
        }while (startNumber < 10);
    }

    static StringBuilder getExpression(int multiplyingNumber1, int multiplyingNumber2) {
        StringBuilder currentExpression = new StringBuilder();
        return currentExpression.append(multiplyingNumber1 + "x" + String.format("%2d", multiplyingNumber2) + " =" +
                String.format("%2d", multiplyingNumber1 * multiplyingNumber2));
    }
}