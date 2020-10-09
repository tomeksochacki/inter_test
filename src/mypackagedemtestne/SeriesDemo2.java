package mypackagedemtestne;

class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos byTwos = new ByTwos();
        ByThrees byThrees = new ByThrees();
        Series obS;

        for (int i = 0; i<5; i++){
            obS = new ByTwos();
            System.out.println(obS.getNext());
            obS = new ByThrees();
            System.out.println(obS.getNext());
        }
    }
}
