package mypackagedemtestne;

class ByThrees implements Series {

    int start;
    int val;

    ByThrees(){
        start = 0;
        val = 0;
    }
    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        val = start;
    }

    @Override
    public void setStart(final int x) {
        val = x;
        start = x;
    }
}
