class Test {

    static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        // Integer argument
        genericDisplay(11);

        // String argument
        genericDisplay("Game");

        // double argument
        genericDisplay(1.0);
    }
}
