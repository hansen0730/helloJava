
package com.hansen;

//import com.hansen.Util;


class Launcher {
	final private boolean DBG=true;
	final private String TAG="Launcher";
	private static Launcher launcher=null;
	
	private Launcher() {}
	private static synchronized Launcher getInstance() {
		if(null == launcher) {
			launcher = new Launcher();
		}
		return launcher;
	}

	public static void main(String[] args) {
		Launcher launcher = getInstance();
		launcher.msg("==== Java Start ====");
		
		final byte[][] b = new byte[3][];
		b[0] = new byte[3];
		b[1] = new byte[5];
		b[2] = new byte[10];
		try {
			launcher.log("b0 len:" + b[0].length);
			launcher.log("b1 len:" + b[1].length);
			launcher.log("b2 len:" + b[2].length);
			launcher.log("b " + b[2][0]);
		} catch (Exception e) {
			e.printStackTrace();
			launcher.log(e.toString());
		}
		launcher.log("b " + b[2]);
		
		launcher.func();

		launcher.msg("==== Java  End  ====");
	}
	
	public static String stringReplace (String text) {
		return text = text.replace ('j', 'i'); 
	}

	public static void bufferReplace (StringBuffer text) {
		text = text.append ("C") ;
	}
	
	private void func() {
		String textString = new String ("java"); 
		StringBuffer textBuffer = new StringBuffer ("java"); 
		
		textString = stringReplace (textString); 
		bufferReplace (textBuffer); 
		
		Double a = new Double(1.234e2);
		launcher.log(a.toString());
	}

	private void log(String msg) {
		if(DBG) {
			Util.Hlog(msg);
		}
	}
	private void msg(String msg) {
		Util.Hlog(msg);
	}
}

