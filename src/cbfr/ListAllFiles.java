package cbfr;

import java.io.*;

class Listing {
        String st = "";
        File file;
        File f;

        public Listing(File f) {
                this.file = f;
                this.f = f;
        }

        public void displayFiles() {
                findFiles(f);
        }

        public void findFiles(File f) {
                if (f.isDirectory()) {
                        st = getFiles(f);
                        System.out.println(st + f.getName());
                        File files[] = f.listFiles();
                        for (File ff : files) {
                                findFiles(ff);
                        }
                } else if (f.isFile()) {
                        System.out.println(st + "  " + f.getName() + "           Size is: "
                                        + f.length());
                }
        }

        private String getFiles(File f) {
                String originalPath = file.getAbsolutePath();
                String path = f.getAbsolutePath();
                String subString = path.substring(originalPath.length(), path.length());
                String st = "";
                for (int index = 0; index < subString.length(); index++) {
                        char ch = subString.charAt(index);
                        if (ch == File.separatorChar) {
                                st = st + "  ";
                        }
                }
                return st;
        }
}

public class ListAllFiles {
        public static void main(String[] args) {
                String p = "C:\\";
                Listing list = new Listing(new File(p));
                list.displayFiles();
        }
}
