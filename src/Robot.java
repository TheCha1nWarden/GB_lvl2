public class Robot  implements RunningAndJumping{
    private int maxRangeRun;
    private int maxRangeJump;

    public Robot(int maxRangeRun, int maxRangeJump) {
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
        System.out.print("Робот пробежал ");
    }

    @Override
    public void jump() {
        System.out.print("Робот перепрыгнул ");
    }
}
