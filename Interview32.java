package com.qiuqiu.practice.interview;

public class Interview32 {
	public static void main(String[] args) {
		/*int[] screen = {0,0,0,0};
		int[] fix = renderPixel(screen,7,16);*/
		/*int[] screen = {0,0,0,0,0,0,0,0,0,0};
		int[] fix = renderPixel(screen,8,15);*/
		int[] screen = {58,211,111,90,248,124,27,226,39,43,124,183,
				182,141,133,12,233,227,27,103,216,14,187,200,22,
				115,28,50,132,174,173,105,203,231,134,21,129,46,
				108,241,196};
		int[] fix = renderPixel(screen,194,313);
		for(int i:fix) {
			System.out.println(i);
		}
	}
	/**
	 * case:[0,0,0,0,0,0,0,0,0,0],8,15 [0,0,0,0] 7,16
	 * return:[0,255,0,0,0,0,0,0,0,0] [1,255,128,,0]
	 * @param screen
	 * @param x 从第x位开始
	 * @param y 到第y位结束
	 * @return
	 * [58,211,111,90,248,124,27,226,39,43,124,183,182,141,
	 * 133,12,233,227,27,103,216,14,187,200,22,115,28,50,132,
	 * 174,173,105,203,231,134,21,129,46,108,241,196],194,313
	 * 
	 * [58,211,111,90,248,124,27,226,39,43,124,183,182,141,
	 * 133,12,233,227,27,103,216,14,187,200,!!!254,255,255,255,
	 * 255,255,255,255,255,255,255,255,255,255,255,!!!243,196]
	 * 
	 * [58,211,111,90,248,124,27,226,39,43,124,183,182,141,
	 * 133,12,233,227,27,103,216,14,187,200,!!!63,255,255,255,
	 * 255,255,255,255,255,255,255,255,255,255,255,!!!192,196]
	 */
	public static int[] renderPixel(int[] screen, int x, int y) {
		if(x==y) {
			int index=x/8;
			int weight=1;
			int bit=x%8;
			while(bit>0) {
				weight*=2;
				bit--;
			}
			screen[index]=weight;
		}else {
			if(x%8==0 && (y+1)%8==0) {
				for(int i=x/8;i<(y+1)/8;i++) {
					screen[i]=255;
				}
			}else if(x%8==0) {
				int i=x/8;
				for(;i<(y+1)/8;i++) {
					screen[i]=255;
				}
				screen[i]|=getBinaryNumber2((y+1)%8);
			}else if((y+1)%8==0) {
				int i=x/8;
				screen[i++]|=getBinaryNumber1(x%8);
				for(;i<(y+1)/8;i++) {
					screen[i]=255;
				}
			}else {
				int i=x/8;
				screen[i++]|=getBinaryNumber1(x%8);
				for(;i<(y+1)/8;i++) {
					screen[i]=255;
				}
				screen[i]|=getBinaryNumber2((y+1)%8);
			}
		}
		return screen;
    }
	public static int getBinaryNumber1(int bit) {
		StringBuilder sb = new StringBuilder();
		for(int i=8;i>0;i--) {
			if(i<=bit) {
				sb.append(0);
			}else {
				sb.append(1);
			}
		}
		return Integer.parseInt(sb.toString(),2);
	}
	public static int getBinaryNumber2(int bit) {
		StringBuilder sb = new StringBuilder();
		for(int i=8;i>0;i--) {
			if(i<=bit) {
				sb.append(1);
			}else {
				sb.append(0);
			}
		}
		return Integer.parseInt(sb.toString(),2);
	}
}
