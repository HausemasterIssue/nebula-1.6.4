package wtf.nebula.util.render;

import static org.lwjgl.opengl.GL11.glColor4f;

public class ColorUtil {
    public static float[] getColor(int color) {
        float alpha = (float) (color >> 24 & 255) / 255.0F;
        float red = (float) (color >> 16 & 255) / 255.0F;
        float green = (float) (color >> 8 & 255) / 255.0F;
        float blue = (float) (color & 255) / 255.0F;

        return new float[] { red, green, blue, alpha };
    }

    public static void setColor(int color) {
        float[] rgba = getColor(color);
        glColor4f(rgba[0], rgba[1], rgba[2], rgba[3]);
    }
}
