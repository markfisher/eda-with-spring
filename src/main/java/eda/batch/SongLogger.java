package eda.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class SongLogger implements ItemWriter<Song> {

	public void write(List<? extends Song> songs) throws Exception {
		for (Song song : songs) {
			System.out.println("title: " + song.getTitle()
					+ ", artist: " + song.getArtist()
					+ ", album: " + song.getAlbum());	
		}
	}

}
