package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int x = 1; x <= height; x++) {
            for (int y = 1; y <= length ; y++) {
                if (y > 1 && y < length && x != 1 && x != height)
                    System.out.print(" ");
                else
                    System.out.print(8);
            }
            System.out.println();
        }
    }
}
