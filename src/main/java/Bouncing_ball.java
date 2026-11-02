public class Bouncing_ball {

    public static int bouncingBall(double h, double bounce, double window) {


        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }

        int seen = 1; // initial fall

        h *= bounce;

        while (h > window) {
            seen += 2; // up and down
            h *= bounce;
        }

        return seen;
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5)); // 3
        System.out.println(bouncingBall(30.0, 0.66, 1.5)); // 15
    }
}