package challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;
	
	
	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String title, double duration) {		
		//make sure that we're not duplicating songs.
		if(findSong(title) == null)
		{
			this.songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}
	
	private Song findSong(String title) {
		for(Song checkedSong : this.songs)
//	for each command : go through and creates a variable for every entry in the array list.
//			
		{
			if(checkedSong.getTitle().equals(title))
			{
				return checkedSong;
			}
		}
		
		return null;
	}
	
	public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
		//1. passing the actual track number and matching actual number with the index number
		int index = trackNumber - 1;
		if((index >= 0) && (index <= this.songs.size()))
//			reason we put >= : index always start from 0 so if we enter track number 1 then index value will be 0
//			: index = trackNumber - 1 = 1 - 1 = 0; doesn't match with actual number
		{
			playList.add(this.songs.get(index));
			return true;
		}
		System.out.println("This album does not have a track " + trackNumber);
		return false;
	}
	
	
	public boolean addToPlayList(String title, LinkedList<Song> playList) {
//		2. adding the title of the songs to the tracknumber by overloading method
		Song checkedSong = findSong(title);
		if(checkedSong != null) 
		{
			playList.add(checkedSong);
			return true;
		}
		
		System.out.println("The song " + title + "is not in thie album");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	

}
