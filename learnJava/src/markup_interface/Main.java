package markup_interface;

import java.util.ArrayList;

//金矿
class Gold implements Ore{
	
}

//铜矿
class Copper implements Ore{
	
}

//抢
class Gun implements Weapon{
	
}

//榴弹
class Grenade implements Weapon{
	
}

//石头
class Stone implements Rubbish{
	
}

class Test{
	/*
	 * 关键字：instanceof 判断是否继承指定的接口
	 */
	public ArrayList<Stuff> collectStuff(Stuff[] s){
		ArrayList<Stuff> al = new ArrayList<Stuff>();
		for(int i = 0; i < s.length; i++){
			if(!(s[i] instanceof Rubbish)){
				al.add(s[i]);
			}
		}
		return al;
	}
}

public class Main {

	public static void main(String[] args) {
		Stuff[] s = {new Gold(), new Copper(), new Gun(), new Grenade(), new Stone()};
		Test cs = new Test();
		
		ArrayList<Stuff> al = cs.collectStuff(s);
		
		System.out.println("The usefull Stuff collected is: ");
		for(int i = 0; i < al.size(); i++){
			System.out.println(al.get(i));
		}
	}
}
