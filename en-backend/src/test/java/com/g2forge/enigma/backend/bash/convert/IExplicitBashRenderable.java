package com.g2forge.enigma.backend.bash.convert;

import com.g2forge.enigma.backend.convert.common.IExplicitRenderable;

@FunctionalInterface
public interface IExplicitBashRenderable extends IBashRenderable, IExplicitRenderable<IBashRenderContext> {}
