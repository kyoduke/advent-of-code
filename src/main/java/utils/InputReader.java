package utils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InputReader {
    public static List<String> readInputByLine(String resourcePath, Class<?> clazz) {
        URL resourceUrl = clazz.getClassLoader().getResource(resourcePath);
        URI resourceUri;
        Stream<String> stream = null;
        try {
            assert resourceUrl != null;
            resourceUri = resourceUrl.toURI();
            Path path = Path.of(resourceUri);
            stream = Files.lines(path);
            return stream.collect(Collectors.toList());
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (stream != null) {
                stream.close();
            }
        }
    }
}
