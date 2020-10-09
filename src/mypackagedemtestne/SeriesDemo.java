package mypackagedemtestne;

class SeriesDemo {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();

        System.out.println(byTwos.start);
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        byTwos.setStart(30);
        System.out.println(byTwos.start);
        System.out.println(byTwos.val);
        System.out.println(byTwos.getNext());
        System.out.println(byTwos.getNext());
        System.out.println("--------------");

        byTwos.reset();
        for (int i = 0; i<5; i++){
            System.out.println("Next value: " + byTwos.getNext());
        }

        System.out.println("\nRestart");
        byTwos.reset();
        for (int i = 0; i<5; i++){
            System.out.println("Next value: " + byTwos.getNext());
        }

        System.out.println("\nRestart, start from 100");
        byTwos.reset();
        byTwos.setStart(100);
        for (int i = 0; i<5; i++){
            System.out.println(byTwos.getNext());
        }

        System.out.println(byTwos.getPrev());
        System.out.println("_______________");
        ByThrees byThrees = new ByThrees();
        System.out.println(byThrees.start);
        for (int i = 0; i<5; i++){
            System.out.println(byThrees.getNext());
        }
}
}
