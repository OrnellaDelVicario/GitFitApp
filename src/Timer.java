public class Timer {
    public void rest(int seconds) {
        System.out.println("Resting for " + seconds + " seconds...");
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Rest interrupted!");
        }
        System.out.println("Time to get back to work! 💪");
    }
}
