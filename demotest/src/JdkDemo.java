public class JdkDemo {
    public static void main(String[] args) {
        String a="b";
         String b=show(a);
        System.out.println(b);
    }

    private static String show(String a) {
        String aa = null;
        switch (a){
            case "null" :
                System.out.println("a");
                break;
            case "b":
                aa="b";
                break;
            default:
                System.out.println("c");
                break;
        }
        return aa;
    }
}
