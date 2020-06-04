public class Digui {
    public static void main(String[] args) {
        String str = "abcd";
        String change = reverse(str);
//        G(9);
        double a=10.2;
        int b=(int) a;
        System.out.println(b);
//        int aaa="year"+1;
            
    }

    public static String reverse(String str) {
        if ((null == str) || (str.length() <1)) {
            return str;
        }
        char c = str.charAt(0);
        System.out.println(c);
        String s = c + reverse(str.substring(1));
        System.out.println(s);
        return s;
//        StringBuffer stringBuffer =new StringBuffer(str);
//
//        return   stringBuffer.reverse().toString();


//        String reverse = reverse(str.substring(1));
//        char c = str.charAt(0);
//        StringBuffer stringBuffer=new StringBuffer();
//        stringBuffer.append(reverse);
//        stringBuffer.append(c);
//        String s = stringBuffer.toString();

//        return s;
    }

    public static void G(int a) {
        if (a > 0) {
            G(a - 1);
            for (int i = 1; i <= a; i++) {
                System.out.print(i + "*" + a + "=" + i * a + " ");
                System.out.print("    ");
            }
            System.out.println("\r\n");


        }
    }
}
