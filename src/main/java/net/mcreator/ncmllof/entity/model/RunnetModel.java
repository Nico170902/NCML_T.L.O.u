package net.mcreator.ncmllof.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ncmllof.entity.RunnetEntity;

public class RunnetModel extends GeoModel<RunnetEntity> {
	@Override
	public ResourceLocation getAnimationResource(RunnetEntity entity) {
		return new ResourceLocation("ncmllof", "animations/runnet_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RunnetEntity entity) {
		return new ResourceLocation("ncmllof", "geo/runnet_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RunnetEntity entity) {
		return new ResourceLocation("ncmllof", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RunnetEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("testa");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
