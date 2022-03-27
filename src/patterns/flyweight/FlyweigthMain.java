package patterns.flyweight;

public class FlyweigthMain {

	public static void main(String args[]) {
		String nameA = "Eson";
		String nameB = "Chris Yu";
		String cdnameA = "CD-A";
		String cdnameA2 = "CD-A2";
		String cdnameB = "CD-B";
		int cdyear = 2;
		
		CDArtistFactory factory = new CDArtistFactory();
		CDArtist artistA = factory.getCDArtist(nameA);
		CDArtist artistA2 = factory.getCDArtist(nameA);
		CDArtist artistB = factory.getCDArtist(nameB);
		
		if (artistA.equals(artistA2)) {
			System.out.println("ArtistA equals with artistA2.");
		}
		
		if (!artistB.equals(artistA)) {
			System.out.println("ArtistB not equals with artistA.");
		}
		
		int artistCount = factory.getArtistCount();
		System.out.println("Artist count is " + artistCount);
	}
}
