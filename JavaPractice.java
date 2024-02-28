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

    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

    public static double solution4(int[] numbers){
        int sum=0;
        for (int number : numbers) {
            sum+=number;
        }
        return (double) sum /numbers.length;
    }

    // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
    // 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
    public static int solution5(int price){
        int answer =0;
        double discount = 1.0;
        if(price>=500000){
            discount =0.8;
        } else if (price>=300000) {
            discount=0.9;
        }else if (price>=100000){
            discount=0.95;
        }else discount= 1.0;

        return (int)(price*discount);
    }

    // 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
    // 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
    // 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
    public static int[] solution6(int money){
        return new int[] { money / 5500, money % 5500 };
    }

    // 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
    public static int solution7(int age){
        return 2022-age+1;
    }

    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    public static int[] solution8(int[] num_list){
        int[] answer= new int[num_list.length];
            for(int i=0; i<num_list.length; i++){
                answer[num_list.length-i-1]=num_list[i];
            }

        return answer;
    }
}
