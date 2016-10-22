package hacktx16.map;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * Platforms are specified in the following format, one on each line:
 * x1 y1 x2 y2
 * All values are ints.
 *
 */
public class PlatformLoader {

	private static String platformTest = "0 80 80 80\n90 80 120 80";
	
	public static Set<Platform> loadPlatforms(String platformInput) {
		String[] split = platformInput.split("\n");
		Set<Platform> platforms = new HashSet<>();
		for (String s : split) 
			platforms.add(loadPlatform(s));
		return platforms;
	}
	
	public static Set<Platform> loadTestPlatforms() {
		return loadPlatforms(platformTest);
	}
	
	public static Platform loadPlatform(String platformInput) {
		Scanner scan = new Scanner(platformInput);
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		scan.close();
		return new Platform(x1, y1, x2, y2);
	}
	
}
