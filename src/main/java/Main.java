//import org.apache.commons.lang3.StringUtils;

public class Main {
   /* public static void main(String Args[]) {
        simpleTest();
        numberTest();
        nullTest();
        emptyStrTest();
        System.out.println("____________________________________");

        String result = "Привет всем кто живет на луне!";
        String result1 = result.substring(0, 6);
        String result2 = result.substring(0, 17);
        System.out.println(result1);
        System.out.println(result2);

    }*/
/*
    public static void simpleTest() {
        System.out.println(
                "Yevhen".equals(StringUtils.capitalize("Yevhen"))
        );
    }

    public static void numberTest() {
        System.out.println(
                "12345".equals(StringUtils.capitalize("12345"))
        );
    }

    public static void emptyStrTest() {
        System.out.println(
                "".equals(StringUtils.capitalize(""))
        );
    }*/
   public static void main(String[] args){
    //   test();
       nullTest();
       emptyStrTest();
   }



    public static String pad(String text, int len, String substr) {
       if (text == null){
           return null;
       }
        String result = text;
        while (result.length() < len) {
            result += substr;

        }
        return result;
    }


    public static void test(){
        System.out.println("Yevhen!!!!".equals(pad("Yevhen", 10, "!")));
    }

    public static void nullTest() {
        System.out.println(
                null == pad(null, 10, "")
        );
    }
    public static void emptyStrTest() {
        System.out.println(
                "".equals(pad("", 0, ""))
        );
    }
}

