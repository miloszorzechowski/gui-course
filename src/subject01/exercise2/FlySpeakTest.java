package subject02;

class FlySpeakTest {
    public static void main(String[] args) {
		var f = new Flyable[]{new Bird(), new Plane(), new UFO(), new Virus()};
		var s = new Speakable[]{new Bird(), new Plane(), new UFO(), new Virus()};

		System.out.println(shortest(f));
		System.out.println(loudest(s));
    }

	private static Flyable shortest(Flyable[] f) {
		var shortestDistance = f[0].distance();
		var object = f[0];

		for (var index = 1; index < f.length; index++) {
			if (f[index].distance() < shortestDistance) {
				shortestDistance = f[index].distance();
				object = f[index];
			}
		}

		return object;
	}

	private static Speakable loudest(Speakable[] s) {
		var loudestObject = s[0].speak().length();
		var object = s[0];

		for (var index = 1; index < s.length; index++) {
			if (s[index].speak().length() > loudestObject) {
				object = s[index];
			}
		}

		return object;
	}
}
