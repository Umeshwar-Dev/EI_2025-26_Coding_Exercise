// Real file class that simulates downloading from a remote server
public class RealRemoteFile implements RemoteFile {
    private String filename;

    public RealRemoteFile(String filename) {
        this.filename = filename;
        downloadFromServer();
    }

    private void downloadFromServer() {
        System.out.println("Downloading '" + filename + "' from remote server...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Download complete!");
    }

    @Override
    public void display() {
        System.out.println("Displaying file: " + filename);
    }
}
