import java.util.ArrayList;
import java.util.List;


class ConcreteBlogPublisher implements BlogPublisher {
    private List<Follower> followers = new ArrayList<>();
    private String latestPost;

    public void registerFollower(Follower follower) {
        followers.add(follower);
    }

    public void unregisterFollower(Follower follower) {
        followers.remove(follower);
    }

    public void notifyFollowers() {
        for (Follower follower : followers) {
            follower.update(latestPost);
        }
    }

    public void publishNewPost(String post) {
        System.out.println("Blog Publisher: Publishing new post: " + post);
        this.latestPost = post;
        notifyFollowers();
    }
}