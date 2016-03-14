package com.orhanobut.logger;

/**
 * Logger is a wrapper of {@link android.util.Log} But more pretty, simple and
 * powerful
 * <br>在{@link com.telchina.BuildConfig} 中设置是否输出LOG信息，
 * DEBUG==true时输出LOG信息,反之则反之。<br>
 * 可以使用 init(String tag)统一设置tag，或以参数形式设置。
 */
public final class Logger {

	private static Printer printer = new LoggerPrinter();

	// no instance
	private Logger() {
	}

	/**
	 * It is used to change the tag
	 * (非必须调用)
	 * @param tag
	 *            is the given string which will be used in Logger as TAG
	 */
	public static Settings init(String tag) {
		printer = new LoggerPrinter();
		return printer.init(tag);
	}

	public static void clear() {
		printer.clear();
		printer = null;
	}

	public static Printer t(String tag) {
		return printer.t(tag, printer.getSettings().getMethodCount());
	}

	public static Printer t(int methodCount) {
		return printer.t(null, methodCount);
	}

	public static Printer t(String tag, int methodCount) {
		return printer.t(tag, methodCount);
	}

	public static void d(String message) {
		printer.d(null,message);
	}
	
	public static void d(String tag, String message) {
		printer.d(tag, message);
	}

	public static void e(String message) {
		printer.e(null, message);
	}
	
	public static void e(String tag, String message) {
		printer.e(tag, message);
	}

	public static void e(Throwable throwable, String message) {
		printer.e(null,throwable, message);
	}
	
	public static void e(String tag, Throwable throwable, String message) {
		printer.e(tag, throwable, message);
	}

	public static void i(String message) {
		printer.i(null,message);
	}
	
	public static void i(String tag, String message) {
		printer.i(tag, message);
	}

	public static void v(String message) {
		printer.v(null,message);
	}
	
	public static void v(String tag, String message) {
		printer.v(tag, message);
	}

	public static void w(String message) {
		printer.w(null,message);
	}
	
	public static void w(String tag, String message) {
		printer.w(tag, message);
	}

	public static void wtf(String message) {
		printer.wtf(null,message);
	}
	
	public static void wtf(String tag, String message) {
		printer.wtf(tag, message);
	}

	/**
	 * Formats the json content and print it
	 * 
	 * @param json
	 *            the json content
	 */
	public static void json(String tag, String json) {
		printer.json(tag, json);
	}
	
	public static void json(String json) {
		printer.json(null, json);
	}

	/**
	 * Formats the json content and print it
	 * 
	 * @param xml
	 *            the xml content
	 */
	public static void xml(String tag, String xml) {
		printer.xml(tag, xml);
	}
	
	public static void xml(String xml) {
		printer.xml(null, xml);
	}

}
