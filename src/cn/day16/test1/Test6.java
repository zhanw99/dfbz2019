package cn.day16.test1;

/**
 * ?????
 */
public class Test6 {
    public static void main(String[] args) {
        Director director = new Director() {
            @Override
            public void makeMovie() {
                System.out.println("标准");
            }
        };
        invokeDirect(director);

    }
    private static void invokeDirect(Director director){
        director.makeMovie();
    }
}
