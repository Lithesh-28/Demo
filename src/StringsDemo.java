public class StringsDemo {
    public static void main(String[] args) {
//        String s1 = "hello";
//        //s1.charAt(0)= 'j';
//
//        String s2 = s1+"world";
//        System.out.println(s1);
//        System.out.println(s2);

//        StringBuilder s1 = new StringBuilder("hello");
//        s1.setCharAt(0,'j');
//        s1.append("world");
//        System.out.println(s1);

        StringBuffer s1 = new StringBuffer("hello");
        s1.setCharAt(0,'j');
        s1.append("world");
        System.out.println(s1);
    }
}
