public class JavaPractice {
    public static void main(String[] args) {
        System.out.println(" Hello Java  ");

        int result = solution1(1);




    }
    //피자 나눠먹기(1)
    public static int solution1(int n){
        int result;
        return result = (n%7==0) ? n/7 : n/7+1;
    }

    // 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
    // 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고
    // 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public static int solution2(int n){
        int pizza = 1;

        while (true){
        if(pizza*n%6==0) break;
            pizza++;
        }

        return pizza;
    }

    // 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
    // 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면
    // 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
    public static int solution3(int  slice, int n){
     return n%slice>0 ? n/slice+1 : n/slice;
    }
}
