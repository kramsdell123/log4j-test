public class modloader {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("notepad");
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
