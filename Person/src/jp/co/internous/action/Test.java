package jp.co.internous.action;

public class Test {

	public static void main(String[] args) {

Person taro =new Person();
taro.name="山田太郎";
taro.age=20;
taro.phoneNumber="000-0000-0000";
taro.address="xxx@gmail.cp.jp";

	System.out.println(taro.name);
	System.out.println(taro.age);
	System.out.println(taro.phoneNumber);
	System.out.println(taro.address);
	taro.talk();
	taro.walk();
	System.out.println();

Person jiro =new Person();
jiro.name="木村次郎";
jiro.age=18;
jiro.phoneNumber="000-0000-0000";
jiro.address="xxx@gmail.cp.jp";

	System.out.println(jiro.name);
	System.out.println(jiro.age);
	System.out.println(jiro.phoneNumber);
	System.out.println(jiro.address);
	System.out.println();

Person hanako =new Person();
hanako.name="鈴木花子";
hanako.age=16;
hanako.phoneNumber="000-0000-0000";
hanako.address="xxx@gmail.cp.jp";

	System.out.println(hanako.name);
	System.out.println(hanako.age);
	System.out.println(hanako.phoneNumber);
	System.out.println(hanako.address);
	System.out.println();

Person natsumi =new Person();
natsumi.name="大竹夏実";
natsumi.age=26;
natsumi.phoneNumber="000-0000-0000";
natsumi.address="xxx@gmail.cp.jp";

	System.out.println(natsumi.name);
	System.out.println(natsumi.age);
	System.out.println(natsumi.phoneNumber);
	System.out.println(natsumi.address);
	System.out.println();

Robot aibo =new Robot();
aibo.name="aibo";

	aibo.talk();
	aibo.walk();
	aibo.run();
	System.out.println();


Robot asimo =new Robot();
asimo.name="asimo";

	asimo.talk();
	asimo.walk();
	asimo.run();
	System.out.println();


Robot pepper =new Robot();
pepper.name="pepper";

	pepper.talk();
	pepper.walk();
	pepper.run();
	System.out.println();

	}
}