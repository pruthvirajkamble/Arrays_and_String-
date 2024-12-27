class EvenOdd {
    public static void main(String[] args) {
        String input = "1230456";
        StringBuffer output = new StringBuffer(input); 

        
        for (int i = 0; i < output.length(); i++) {
            char ch = output.charAt(i); 
            if (ch == '0') {
                output.setCharAt(i, 'N'); 
            } else if (Character.getNumericValue(ch) % 2 == 0) {
                output.setCharAt(i, 'E'); 
            } else {
                output.setCharAt(i, 'O'); 
            }
        }

        System.out.println("Output: " + output.toString()); // Output: OEONEOE
    }
}
