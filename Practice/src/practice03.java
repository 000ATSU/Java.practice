//class GeographicInfo {
//	double latitude;
//	double longitude;
//}
//
//class GeographicInfo3D extends GeographicInfo {
//	double height;
//}
//
//public class practice03 {
//	public static void main(String[] args) {
//		GeographicInfo g;
//		GeographicInfo3D h = new GeographicInfo3D();
//
//		h.latitude = 35.66;
//		h.longitude = 139.75;
//		h.height = 435.7;
//
//		g = h;
//
//		System.out.println(g.latitude);
//		System.out.println(g.longitude);
//	}
//}

class GeographicInfo {
	double latitude;
	double longitude;
}

class GeographicInfo3D extends GeographicInfo {
	double height;

	GeographicInfo3D(double la, double lo, double he) {
		latitude = la;
		longitude = lo;
		height = he;
	}

	void display() {
		System.out.println(latitude);
		System.out.println(longitude);
		System.out.println(height);
	}
}

public class practice03 {
	public static void main(String[] args) {
		GeographicInfo3D h = new GeographicInfo3D(33.4, 55.9, 77.1);
		GeographicInfo3D g = new GeographicInfo3D(534.5, 576.2, 7.33);

		h.display();
		g.display();
	}
}