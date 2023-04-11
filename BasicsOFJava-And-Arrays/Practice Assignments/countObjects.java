package CodesWithoutPackages;

public class countObjects {
    private static int count = 0;

    public countObjects() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        countObjects object1 = new countObjects();
        countObjects object2 = new countObjects();
        countObjects object3 = new countObjects();

        System.out.println("Total Number of Objects in the Program are: " + countObjects.getCount());
    }

}
