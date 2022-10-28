package dev.hilla.parser.test.nodes;

import dev.hilla.shared.Nonnull;

import dev.hilla.parser.core.AbstractNode;
import dev.hilla.parser.models.FieldInfoModel;

public final class FieldNode extends AbstractNode<FieldInfoModel, String> {
    private FieldNode(@Nonnull FieldInfoModel source, @Nonnull String target) {
        super(source, target);
    }

    @Nonnull
    static public FieldNode of(@Nonnull FieldInfoModel source) {
        return new FieldNode(source, "");
    }
}
