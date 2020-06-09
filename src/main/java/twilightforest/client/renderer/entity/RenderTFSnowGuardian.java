package twilightforest.client.renderer.entity;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.util.math.MathHelper;
import twilightforest.client.model.entity.ModelTFSnowGuardian;
import twilightforest.entity.EntityTFSnowGuardian;

public class RenderTFSnowGuardian extends RenderTFBiped<EntityTFSnowGuardian, ModelTFSnowGuardian> {

	public RenderTFSnowGuardian(EntityRendererManager manager, ModelTFSnowGuardian model) {
		super(manager, model, 0.25F, "textures/entity/zombie/zombie.png");
		this.addLayer(new BipedArmorLayer<>(this, new ModelTFSnowGuardian(), new ModelTFSnowGuardian()));
	}

	@Override
	protected void scale(EntityTFSnowGuardian entity, MatrixStack stack, float partialTicks) {
		float bounce = entity.ticksExisted + partialTicks;
		stack.translate(0F, MathHelper.sin((bounce) * 0.2F) * 0.15F, 0F);
	}
}
