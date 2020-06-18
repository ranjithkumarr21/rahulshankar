package Task_05;

public class Task_05_06 {
public boolean isBinaryNumber(int binary){
		
		boolean status = true;
		while(true){
			if(binary == 0){
				break;
			} else {
				int tmp = binary%10;
				if(tmp > 1){
					status = false;
					break;
				}
				binary = binary/10;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		Task_05_06 mbc = new Task_05_06();
	        System.out.println("Is 1000111 binary? :"+mbc.isBinaryNumber(10010011));
	        System.out.println("Is 10300111 binary? :"+mbc.isBinaryNumber(10300111));

	}

}
