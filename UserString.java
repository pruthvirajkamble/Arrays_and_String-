public final class UserString {
    char[] arr;

    public UserString() {
        arr = new char[0];
    }

    public UserString(String str) {
        arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (char ch : arr) {
            str += ch;
        }
        return str;
    }

    public int length() {
        return arr.length;
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public char charAt(int indx) {
        if (indx < 0 || indx >= arr.length)
            throw new StringIndexOutOfBoundsException("WRONG INDEX : " + indx);
        return arr[indx];
    }

    public int codePointAt(int indx) {
        if (indx < 0 || indx >= arr.length)
            throw new StringIndexOutOfBoundsException("WRONG INDEX : " + indx);
        return arr[indx] + 0;
    }

    public int codePointBefore(int indx) {
        if (indx < 1 || indx > arr.length)
            throw new StringIndexOutOfBoundsException("WRONG INDEX : " + (indx - 1));
        return arr[indx - 1] + 0;
    }

    public int codePointCount(int start, int end) {
        if (start < 0 || end >= arr.length || start > end)
            throw new IndexOutOfBoundsException("Range [" + start + "," + end + "] out of bounds");

        return end - start;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof String)) return false;
        String str1 = (String) obj;
        UserString str2 = new UserString(str1);
        if (this.length() != str2.length())
            return false;

        int indx = 0;
        for (char ch : arr) {
            if (ch == str2.charAt(indx++))
                continue;
            else
                return false;
        }
        return true;
    }

    // Additional Methods

    // 1. StringBuffer
    public StringBuffer toStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (char ch : arr) {
            sb.append(ch);
        }
        return sb;
    }

    // 2. StringBuilder
    public StringBuilder toStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            sb.append(ch);
        }
        return sb;
    }

    // 3. Char Array
    public char[] toCharArray() {
        return arr.clone();
    }

    // 4. Byte Array
    public byte[] toByteArray() {
        byte[] byteArray = new byte[arr.length];
        for (int i = 0; i < arr.length; i++) {
            byteArray[i] = (byte) arr[i];
        }
        return byteArray;
    }

    // 5. To Upper Case
    public UserString toUpperCase() {
        char[] upperArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            upperArr[i] = Character.toUpperCase(arr[i]);
        }
        return new UserString(new String(upperArr));
    }

    // 6. To Lower Case
    public UserString toLowerCase() {
        char[] lowerArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            lowerArr[i] = Character.toLowerCase(arr[i]);
        }
        return new UserString(new String(lowerArr));
    }

    // 7. Index Of
    public int indexOf(char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1; // Not found
    }

    // 8. Last Index Of
    public int lastIndexOf(char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1; // Not found
    }
}
 class DriverString {
    public static void main(String[] args) {
        UserString str1 = new UserString("HelloWorld");

        // StringBuffer
        System.out.println("StringBuffer: " + str1.toStringBuffer());

        // StringBuilder
        System.out.println("StringBuilder: " + str1.toStringBuilder());

        // Char Array
        System.out.println("Char Array: " + java.util.Arrays.toString(str1.toCharArray()));

        // Byte Array
        System.out.println("Byte Array: " + java.util.Arrays.toString(str1.toByteArray()));

        // To Upper Case
        System.out.println("Upper Case: " + str1.toUpperCase());

        // To Lower Case
        System.out.println("Lower Case: " + str1.toLowerCase());

        // Index Of
        System.out.println("Index of 'o': " + str1.indexOf('o'));

        // Last Index Of
        System.out.println("Last Index of 'o': " + str1.lastIndexOf('o'));
    }
}
