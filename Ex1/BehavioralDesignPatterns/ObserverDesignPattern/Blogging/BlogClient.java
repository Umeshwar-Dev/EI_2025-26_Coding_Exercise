public class BlogClient {
    public static void main(String[] args) {
        ConcreteBlogPublisher publisher = new ConcreteBlogPublisher();

        BlogFollower alice = new BlogFollower("Alice");
        BlogFollower bob = new BlogFollower("Bob");
        BlogFollower charlie = new BlogFollower("Charlie");

        // Followers subscribe to publisher
        publisher.registerFollower(alice);
        publisher.registerFollower(bob);
        publisher.registerFollower(charlie);

        // Publisher posts new blogs
        publisher.publishNewPost("Observer Pattern in Java Explained");
        System.out.println();

        // Bob unfollows
        publisher.unregisterFollower(bob);

        // Another blog post
        publisher.publishNewPost("Understanding Design Patterns with Examples");
    }
}