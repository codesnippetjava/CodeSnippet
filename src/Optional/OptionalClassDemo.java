package Optional;

import java.util.Optional;

public class OptionalClassDemo {
    private Optional<String> getUserName(int id){
        if(id==0){
            return Optional.ofNullable(null);
        }else {
            return Optional.ofNullable("FollowCodeSnippet");
        }
    }
    public static void main(String[] args) {
        OptionalClassDemo optionalClassDemo = new OptionalClassDemo();
        Optional<String> userName = optionalClassDemo.getUserName(1);

        userName.ifPresentOrElse(
                (uName) -> System.out.println("username "+uName),
                ()-> System.out.println("username not found")
        );

    }
}
