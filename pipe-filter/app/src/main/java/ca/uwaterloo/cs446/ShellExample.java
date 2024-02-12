package ca.uwaterloo.cs446;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ShellExample {
    public static void main(String[] args) {
        // create a pipeline of filters
        List<AbstractFilter> pipeline = List.of(
                new FindFilesFilter(),
                new GrepFilter(".java"),
                new GrepFilter("src/main"),
                new LineCountFilter(),
                new PrintlnFilter());

        // connect the pipes
        for (int i = 0; i < pipeline.size() - 1; i++) {
            new Pipe(pipeline.get(i), pipeline.get(i + 1));
        }

        // start the pipeline
        for (String arg : args) {
            pipeline.get(0).run(arg);
        }
        pipeline.get(0).run(AbstractFilter.END_OF_STREAM);
    }
}

/** A filter that finds all files under each given directory. */
class FindFilesFilter extends AbstractFilter {
    @Override
    protected void runInternal(String data) {
        if (data.equals(END_OF_STREAM)) {
            emit(END_OF_STREAM);
            return;
        }

        try {
            for (Path path : Files.walk(Paths.get(data)).toList()) {
                emit(path.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// GrepFilter
class GrepFilter extends AbstractFilter {
    private final String pattern;

    public GrepFilter(String pattern) {
        this.pattern = pattern;
    }

    @Override
    protected void runInternal(String data) {
        if (data.equals(END_OF_STREAM)) {
            emit(END_OF_STREAM);
            return;
        }
        if (data.contains(pattern)) {
            emit(data);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "[" + pattern + "]";
    }
}

// LineCountFilter
class LineCountFilter extends AbstractFilter {
    private int count = 0;

    @Override
    protected void runInternal(String data) {
        if (data.equals(END_OF_STREAM)) {
            emit(Integer.toString(count));
        } else {
            count++;
        }
    }
}

/** A filter that prints all the input data. */
class PrintlnFilter extends AbstractFilter {
    @Override
    protected void runInternal(String data) {
        if (data.equals(END_OF_STREAM)) {
            emit(END_OF_STREAM);
            return;
        }
        System.out.println(data);
    }
}
