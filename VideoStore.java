import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store;

    public VideoStore() {
        this.store = new ArrayList<Video>();
    }

    public void addVideo(String name) {
        Video video = new Video(name);
        store.add(video);
    }

    public void doCheckout(String name) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doCheckout();
                break;
            }
        }
    }

    public void doReturn(String name) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.doReturn();
                break;
            }
        }
    }

    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video.getName().equals(name)) {
                video.receiveRating(rating);
                break;
            }
        }
    }

    public void listInventory() {
        for (Video video : store) {
            System.out.println("Video Name: " + video.getName());
            System.out.println("Checkout Status: " + video.getCheckout());
            System.out.println("Rating: " + video.getRating());
            System.out.println("---------------------------");
        }
    }
}