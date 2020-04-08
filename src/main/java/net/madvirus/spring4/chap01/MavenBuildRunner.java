package net.madvirus.spring4.chap01;

import java.util.List;

public class MavenBuildRunner implements BuildRunner {

    String mavenPath;

    @Override
    public void build(List<String> srcDirs, String binDir) {
        String info = "Maven Path: " + mavenPath + "\n";

        for(String srcDir : srcDirs) {
            info += "Source Path: " +srcDir + "\n";
        }

        info += "Class file Path: " + binDir + "\n";

        System.out.println("MavenBuildRunner.build() execute\n" + info);
    }

    public void setMavenPath(String mavenPath) {
        this.mavenPath = mavenPath;
    }

}
