interface BlogPublisher {
    void registerFollower(Follower follower);
    void unregisterFollower(Follower follower);
    void notifyFollowers();
}


