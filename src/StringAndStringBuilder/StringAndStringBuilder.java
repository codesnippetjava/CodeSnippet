package StringAndStringBuilder;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        String str = "Apple";
        System.out.println(str+":"+str.hashCode());
        str=str.concat("pie");
        System.out.println(str+":"+str.hashCode());

        StringBuilder stringBuilder = new StringBuilder("Apple");
        stringBuilder.append("pie");
        System.out.println(stringBuilder);
    }
}
