package ca.uwaterloo.cs446;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ShellExample {
    public static void main(String[] args) {
        // create a pipeline of filters
        List<AbstractFilter> pipeline = List.of(new FindFilesFilter(), new PrintlnFilter());

        // connect the pipes
        for (int i = 0; i < pipeline.size() - 1; i++) {
            new Pipe(pipeline.get(i), pipeline.get(i + 1));
        }

        // start the pipeline
        for (String arg : args) {
            pipeline.get(0).run(arg);
        }
    }
}

/** A filter that finds all files under each given directory. */
class FindFilesFilter extends AbstractFilter {
    public void runInternal(String data) {
        try {
            for (Path path : Files.walk(Paths.get(data)).toList()) {
                emit(path.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// TODO: GrepFilter

// TODO: LineCountFilter

/** A filter that prints all the input data. */
class PrintlnFilter extends AbstractFilter {
    public void runInternal(String data) {
        System.out.println(data);
    }
}
