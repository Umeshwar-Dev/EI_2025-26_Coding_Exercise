import java.util.HashMap;
import java.util.Map;

// Proxy class that caches files
public class RemoteFileProxy implements RemoteFile {
    private String filename;
    private RealRemoteFile realFile;
    private static Map<String, RealRemoteFile> cache = new HashMap<>();

    public RemoteFileProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (cache.containsKey(filename)) {
            System.out.println("Retrieving '" + filename + "' from cache...");
            realFile = cache.get(filename);
        } else {
            realFile = new RealRemoteFile(filename);
            cache.put(filename, realFile);
        }
        realFile.display();
    }
}
