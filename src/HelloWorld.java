public class HelloWorld {
    public static void main(String[]args){
        //"Hello World"を10回表示し、その後"Hello"を10回表示する
        for(int i = 0; i < 20; i++){
            if(i < 10){
                System.out.println("Hello World");
            }else{
                System.out.println("Hello");
            }
        }
    }
}