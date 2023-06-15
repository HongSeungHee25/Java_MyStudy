package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student sh = new Student("승희",5000);
		Student jh = new Student("재호",10000);
		
		//버스를 타는 승희
		Bus bus1009 = new Bus(1009);
		sh.takeBus(bus1009);
		sh.showinfo();
		bus1009.showinfo();
		
		//지하철을 타는 재호
		Subway subwayPink = new Subway(8);
		jh.takeSubway(subwayPink);
		jh.showinfo();
		subwayPink.showinfo();
	}

}
