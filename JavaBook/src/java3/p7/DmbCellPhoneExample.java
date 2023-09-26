package java3.p7;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone dmbcellphone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("model : " + dmbcellphone.model);
		System.out.println("color : " + dmbcellphone.color);
		System.out.println("channel : " + dmbcellphone.channel);

		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("여보세요?");
		dmbcellphone.receiveVoice("안녕하세요. 홍길동 입니다.");
		dmbcellphone.sendVoice("네, 반갑습니다.");
		dmbcellphone.hangUp();

		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
	}
}
