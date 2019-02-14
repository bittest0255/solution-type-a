package problem02;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute( String function ) {
		if(function.equals("음악")) {
			System.out.println(runApp());
			return;
		}else if(function.equals("통화")) {
			super.execute(function);
		}else if(function.equals("앱")) {
			System.out.println("앱실행");
		}
	}
	
	public String runApp() {
		return "스트리밍";
	}
}