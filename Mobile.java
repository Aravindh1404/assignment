package week01.day1;

public class Mobile {

	
	public void makeCall() {
		String mobileModel = "one plus nord";
		float mobileWeight = 250f;
		System.out.println("mobile model :" + mobileModel);
		System.out.println("mobile weight :"+ mobileWeight);
		
		
	}
	
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost = 25000;
		System.out.println("fully charged :" + isFullCharged );
		System.out.println("Mobile cost :"+ mobileCost );
		
		
	}
	public static void main(String[] args) {
		Mobile My = new Mobile();
		 My.makeCall();
		 My.sendMsg();
		 System.out.println("This is my mobile");

	}

}
