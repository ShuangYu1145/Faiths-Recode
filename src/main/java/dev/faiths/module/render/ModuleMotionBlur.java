package dev.faiths.module.render;

import dev.faiths.module.Category;
import dev.faiths.module.CheatModule;
import dev.faiths.value.ValueFloat;

public class ModuleMotionBlur  extends CheatModule {

    public ModuleMotionBlur() {
        super("MotionBlur", Category.RENDER);
    }

    public static ValueFloat blurAmount = new ValueFloat("Amount", 5.0f, 0.0f, 10.0f);
}