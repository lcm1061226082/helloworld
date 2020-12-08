package cn.lee.demo;

public class aaa {
    public static void main(String[] argss) {
    	int b,b1,b2,b3,b4;
    	b = 0xabcd;
    	b1 = b&0xf000;
    	b2 = b&0x0f00;
    	b3 = b&0x00f0;
    	b4 = b&0x000f;
    	System.out.println(Integer.toBinaryString(b));
    	System.out.format("%16s\n", Integer.toBinaryString(b1));
    	System.out.format("%16s\n", Integer.toBinaryString(b2));
    	System.out.format("%16s\n", Integer.toBinaryString(b3));
    	System.out.format("%16s\n", Integer.toBinaryString(b4));
    	
//        int moneyEachDay = 0;
//        int day = 10;
//        int sum=0;
//        for (int i = 1; i <= day; i++) {
//            if(0==moneyEachDay)
//                moneyEachDay = 1;
//            else
//                moneyEachDay *= 2;
//              
//            sum+=moneyEachDay;
//              
//            System.out.println(i + " 天之后，洪帮主手中的钱总数是: " + sum );
//        }
    }
}
  