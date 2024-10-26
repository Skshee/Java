class SplitEquation{
      public static void main(String[] args) {
        String eq1="12X+3Y";
        System.out.println(eq1);
        String[] arr=eq1.split("\\+");
        int xCoefficient=0;
        int yCoefficient=0;
        String str1="";
        String str2="";

        for (String term : arr) {
            term = term.trim();
            if (term.endsWith("X")) {
                 str1 += (term.replace("X", "").trim());
                 xCoefficient=Integer.parseInt(str1);
                // System.out.println(str1);
            } else if (term.endsWith("Y")) {
                  str2 = (term.replace("Y", "").trim());
                  yCoefficient=Integer.parseInt(str2);
                //  System.out.println(str2);
            } else {
                throw new IllegalArgumentException("Invalid Equation");
            }
        }
        System.out.println(xCoefficient);
        System.out.println(yCoefficient);
      }



}