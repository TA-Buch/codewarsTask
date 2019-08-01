public class Functions {

    public static String createPhoneNumber(int[] a) {

        if (a.length < 10) {
            throw new IllegalArgumentException();
        }

        StringBuilder resultPhone = new StringBuilder("(");

        for(int i=0; i < a.length; i++) {
            if ((i != 3) && (i != 6)) {
                resultPhone.append(a[i]);
            } else if (i == 3) {
                resultPhone.append(") ").append(a[i]);
            } else if (i == 6) {
                resultPhone.append("-").append(a[i]);
            }
        }
        return resultPhone.toString();
    }


    public static String createPhoneNumber2(int[] a) {

        if (a.length < 10) {
            throw new IllegalArgumentException();
        }

        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", a[0], a[1], a[2], a[3], a[4], a[5], a[6], a[7], a[8], a[9]);

    }

    public static void main( String[] args ) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber2(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
}
