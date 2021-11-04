class MakeString {
    public static void main(String args[]) {
        char c[] = { 'J', 'a', 'v', 'a', 'm', 'y', 'p', 'a', 's', 's', 'i', 'o', 'n' };
        String s1 = new String(c);

        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);

        String s3 = new String(c, 6, 7);
        System.out.println(s3);

        char c1[] = { ' ' };
        String s4 = new String(c1);
        System.out.println(s4);

        byte ascii[] = { 65, 66, 67, 68, 69, 70 };
        String s5 = new String(ascii);
        System.out.println(s5);

        int a[] = { 91, 92, 93, 94, 95 };
        String s6 = new String(a, 0, 5);
        System.out.println(s6);

        String s7 = "bhawna";
        String s8 = "BhaWna";
        System.out.println(s8.length());
        System.out.println(s7 + " " + s2 + (2 + 2));
        char c4[] = s8.toCharArray();
        System.out.println("\nConverting string to char array " + c4);

        System.out.println(s8.charAt(4));

        char buf[] = new char[4];
        s2.getChars(0, 4, buf, 0);
        System.out.println(buf);

    }
}