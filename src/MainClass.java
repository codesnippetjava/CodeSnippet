public class MainClass extends InstagramAccount {

    @Override
    public String getAccount() {
        return "CodeSnippet";
    }
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        System.out.println(obj.getAccount());
    }
}
