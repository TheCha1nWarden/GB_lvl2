public class Cat implements RunningAndJumping{
    private int maxRangeRun;
    private int maxRangeJump;

    public Cat(int maxRangeRun, int maxRangeJump) {
        this.maxRangeRun = maxRangeRun;
        this.maxRangeJump = maxRangeJump;
    }

    public int getMaxRangeRun() {
        return maxRangeRun;
    }

    public int getMaxRangeJump() {
        return maxRangeJump;
    }

    @Override
    public void run() {
        System.out.print("Кот пробежал ");
    }

    @Override
    public void jump() {
        System.out.print("Кот перепрыгнул ");
    }
}
