package net.madvirus.spring4.chap01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MavenBuildRunner buildRunner = new MavenBuildRunner();
        buildRunner.setMavenPath("C:\\Users\\kjy79\\git\\common-resource\\apache-maven-3.6.3\\bin");

        Project sampleProject = new Project();

        List<String> srcDirs = new ArrayList<>();
        srcDirs.add("src");
        srcDirs.add("srcResources");
        sampleProject.setBinDir("bin");
        sampleProject.setBuildRunner(buildRunner);
        sampleProject.setSrcDirs(srcDirs);

        sampleProject.build();
    }
}
