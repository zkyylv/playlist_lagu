public class playlist {
		class Song {
				String title;
				Song next;

				public Song(String title) {
						this.title = title;
						this.next = null;
				}
		}

		class playlistManager {
				private Song head;

				public void addSong(String title) {
						Song newSong = new Song(title);
						if (head == null) {
								head = newSong;
						} else {
								Song current = head;
								while (current.next != null) {
										current = current.next;
								}
								current.next = newSong;
						}
				}

				public void displayplaylist() {
						if (head == null) {
								System.out.println("playlist kosong.");
								return;
						}
						System.out.println("My Favorite Songs:");
						Song current = head;
						while (current != null) {
								System.out.println("- " + current.title);
								current = current.next;
						}
				}
		}

		public static void main(String[] args) {
				playlist outer = new playlist();
				playlistManager playlist = outer.new playlistManager();

				playlist.addSong("Confident - Justin Bieber ft. Chance the Rapper");
				playlist.addSong("Die With A Smile - Lady Gaga & Bruno Mars");
				playlist.addSong("Too Sweet - Hozier");
				playlist.addSong("Birds of a Feather - Billie Eilish");
				playlist.addSong("Fortnight - Taylor Swift ft. post Malone");

				playlist.displayplaylist();
		}
}
