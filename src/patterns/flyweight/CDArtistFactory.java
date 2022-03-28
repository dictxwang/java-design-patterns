package patterns.flyweight;

import java.util.HashMap;

public class CDArtistFactory {

	private HashMap<String, CDArtist> cdartists = new HashMap<>();
	
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
