public class Human implements RunningAndJumping{

    private int maxRangeRun;
    private int maxRangeJump;


    public Human(int maxRangeRun, int maxRangeJump) {
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
        System.out.print("Человек пробежал ");
    }

    @Override
    public void jump() {
        System.out.print("Человек перепрыгнул ");
    }
}
