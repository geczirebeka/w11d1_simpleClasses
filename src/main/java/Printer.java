public class Printer {
    private int paper;
    private int printed;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume) {
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getPaper() {
        return paper;
    }

    public int getPrinted() {
        return printed;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        if (this.paper >= pages * copies) {
            int printed = pages * copies;
            this.paper -= printed;
            this.printed = printed;
        }
    }

    public int reduceToner() {
        return this.tonerVolume -= this.printed;
    }
}
