package com.github.helpermethod.membrane.starter;

import java.util.Collections;
import java.util.List;

public class PathResolver {
    private final List<String> prefixPaths;
    private final List<String> regexPaths;

    public PathResolver(List<String> prefixPaths, List<String> regexPaths) {
        this.prefixPaths = prefixPaths;
        this.regexPaths = regexPaths;
    }

    public List<String> prefixPaths() {
        return Collections.unmodifiableList(prefixPaths);
    }

    public List<String> regexPaths() {
        return Collections.unmodifiableList(regexPaths);
    }
}