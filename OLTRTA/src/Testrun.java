
import parser.*;
import CommonLanguageObjects.*;

public class Testrun {

	public static void main(String[] args) {
		CommonToCParser cp = new CommonToCParser();
		BotMethods bm = new BotMethods("ArduinoShieldBot","ShieldBot1(standard)");
		for(int i = 0; i < bm.global_variables.length; i++){
			System.out.println(cp.parseExpression(bm.global_variables[i]));
		}
		System.out.println(cp.parseMethod(bm.setup));
		for(Method method : bm.methods){
			System.out.println(cp.parseMethod(method));
		}
		for(Method method : bm.metamethods){
			System.out.println(cp.parseMethod(method));
		}
	}

}
