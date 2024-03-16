public class Bone {
    public int total(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        Bone bone = new Bone(); // Creating an instance of the Bone class
        int a = bone.total(400, 600, 500);
        int b = bone.total(400, 800, 1000);
        System.out.println("a: " + a + " b: " + b);
    }
}