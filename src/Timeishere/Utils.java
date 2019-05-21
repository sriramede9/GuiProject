package Timeishere;

public class Utils {
	public static String getFileExtension(String name) {
		int pointindex = name.lastIndexOf(".");
		if (pointindex == -1) {
			return null;
		}
		if (pointindex == name.length() - 1) {
			return null;
		}
		return name.substring(pointindex + 1, name.length());
	}
}
