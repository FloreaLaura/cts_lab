package ro.ase.cts.seminar9;

import ro.ase.cts.seminar9.proxy.YoutubeLibrary;
import ro.ase.cts.seminar9.proxy.YoutubeLibraryInterface;

public class Main {

	public static void main(String[] args) {
		YoutubeLibraryInterface youtubeLib=new YoutubeLibrary();
		System.out.println(youtubeLib.listVideos());
		System.out.println(youtubeLib.getVideoInfo(1));
	}

}
