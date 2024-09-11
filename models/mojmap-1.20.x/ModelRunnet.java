// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelRunnet<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "runnet"), "main");
	private final ModelPart testa;
	private final ModelPart braccia;
	private final ModelPart corpo;
	private final ModelPart gambe;
	private final ModelPart gambe2;
	private final ModelPart braccia2;

	public ModelRunnet(ModelPart root) {
		this.testa = root.getChild("testa");
		this.braccia = root.getChild("braccia");
		this.corpo = root.getChild("corpo");
		this.gambe = root.getChild("gambe");
		this.gambe2 = root.getChild("gambe2");
		this.braccia2 = root.getChild("braccia2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition testa = partdefinition.addOrReplaceChild("testa", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -2.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition braccia = partdefinition.addOrReplaceChild("braccia", CubeListBuilder.create().texOffs(32, 0)
				.addBox(-1.8802F, -1.4393F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, -6.0F));

		PartDefinition corpo = partdefinition.addOrReplaceChild("corpo", CubeListBuilder.create().texOffs(0, 16)
				.addBox(-2.0F, -24.0F, -4.0F, 4.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition gambe = partdefinition.addOrReplaceChild("gambe", CubeListBuilder.create().texOffs(0, 36)
				.addBox(-1.7233F, -1.9509F, -1.9847F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 14.0F, 2.0F));

		PartDefinition gambe2 = partdefinition.addOrReplaceChild("gambe2", CubeListBuilder.create().texOffs(20, 32)
				.addBox(-0.9195F, -2.0381F, -2.1047F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, -2.0F));

		PartDefinition braccia2 = partdefinition.addOrReplaceChild("braccia2", CubeListBuilder.create().texOffs(24, 16)
				.addBox(-1.6638F, -1.8005F, -2.0884F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 3.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		testa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccia.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		corpo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gambe.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		gambe2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		braccia2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}