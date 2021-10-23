import java.util.Arrays;

public class Homework {
    static int size = 1000000;
    static int h = size / 2;
    public static void main(String[] args) {
        first();
        second();
    }

    public static void first() {
        float[] array = new float[size];
        Arrays.fill(array, 1);
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
    }
    public static void second() {
        float[] array = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(array,1);
        long a = System.currentTimeMillis();
        System.arraycopy(array, 0, a1, 0, h);
        System.arraycopy(array, h, a2, 0, h);

        Thread t0 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t0.start();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < h; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        t1.start();
        try {
            t0.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(a1,0, array,0, h);
        System.arraycopy(a2,0, array,h, h);
        System.out.println(System.currentTimeMillis() - a);
    }
}
