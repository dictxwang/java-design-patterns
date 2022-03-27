package patterns.flyweight;

import java.util.Hashtable;

public class CDArtistFactory {

	private Hashtable<String, CDArtist> cdartists = new Hashtable<String, CDArtist>();
	
	public CDArtist getCDArtist(String key) {
		CDArtist cdartist = (CDArtist)cdartists.get(key);
		if (cdartist == null) {
			cdartist = new CDArtist(key);
			cdartists.put(key, cdartist);
		}

		return cdartist;
	}
	
	public int getArtistCount() {
		int count = 0;
		if (cdartists != null) {
			count = cdartists.size();
		}
		return count;
	}
}
