package com.github.eirslett.maven.plugins.frontend.lib;

import java.util.Collections;

public interface NodeRunner extends NodeTaskRunner {}

final class DefaultNodeRunner extends NodeTaskExecutor implements NodeRunner {

    private static final String TASK_NAME = "node";

    DefaultNodeRunner(NodeExecutorConfig config) {
        super(config, TASK_NAME, null, Collections.<String>emptyList());
    }
}
