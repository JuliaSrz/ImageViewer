package persistance;

import java.io.File;
import java.io.FilenameFilter;

public class ImageLoader {

    private String filename;
    private File file;
    
    public ImageLoader(String filename) {
        file = new File(filename);
    }
    
    
    String[] filenames = file.getParentFile().list(getImageFilter());
    
    
    private FilenameFilter getImageFilter() {
        return null;
    
    }
    
    
        
}
