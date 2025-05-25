public class Print {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 }; // Even Though It Has Same Value As a It Is Not Same As B,
        int[] b = { 1, 2, 3 }; // They Are Referenced In Different Memeory Location
        System.out.println(a == b); // Checks If Refering To Same Point In Memory
    }
}
