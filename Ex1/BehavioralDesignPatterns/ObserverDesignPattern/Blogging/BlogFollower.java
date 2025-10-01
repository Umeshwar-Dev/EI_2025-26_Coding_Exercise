class BlogFollower implements Follower {
    private String followerName;

    public BlogFollower(String name) {
        this.followerName = name;
    }

    public void update(String blogPost) {
        System.out.println(followerName + " received notification of new blog post: " + blogPost);
    }
}