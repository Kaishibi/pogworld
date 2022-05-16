package me.wurgo.pogworld.mixin.generation.village;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PaneBlock;
import net.minecraft.structure.PlainsVillageData;
import net.minecraft.structure.pool.*;
import net.minecraft.structure.processor.RuleStructureProcessor;
import net.minecraft.structure.processor.StructureProcessor;
import net.minecraft.structure.processor.StructureProcessorRule;
import net.minecraft.structure.rule.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlainsVillageData.class)
public class PlainsVillageDataMixin {
    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void pogworld_inject_pvd_static_tail(CallbackInfo ci) {
        ImmutableList<StructureProcessor> immutableList = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.8F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()), new StructureProcessorRule(new TagMatchRuleTest(BlockTags.DOORS), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.WALL_TORCH), AlwaysTrueRuleTest.INSTANCE, Blocks.AIR.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.MOSSY_COBBLESTONE, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHITE_TERRACOTTA, 0.07F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.OAK_LOG, 0.05F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.OAK_PLANKS, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.OAK_STAIRS, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.STRIPPED_OAK_LOG, 0.02F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.GLASS_PANE, 0.5F), AlwaysTrueRuleTest.INSTANCE, Blocks.COBWEB.getDefaultState()), new StructureProcessorRule(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.NORTH, true).with(PaneBlock.SOUTH, true)), new StructureProcessorRule(new BlockStateMatchRuleTest(Blocks.GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)), AlwaysTrueRuleTest.INSTANCE, Blocks.BROWN_STAINED_GLASS_PANE.getDefaultState().with(PaneBlock.EAST, true).with(PaneBlock.WEST, true)), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
        ImmutableList<StructureProcessor> immutableList2 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/town_centers"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_fountain_01", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_1", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_2"), 50), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_3", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 50), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_fountain_01", immutableList), 1), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_1", immutableList), 1), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_2", immutableList), 1), new Pair(new LegacySinglePoolElement("village/plains/town_centers/plains_meeting_point_3", immutableList), 1)), StructurePool.Projection.RIGID));
        ImmutableList<StructureProcessor> immutableList3 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new BlockMatchRuleTest(Blocks.GRASS_PATH), new BlockMatchRuleTest(Blocks.WATER), Blocks.OAK_PLANKS.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.GRASS_PATH, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.GRASS_BLOCK.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.GRASS_BLOCK), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()), new StructureProcessorRule(new BlockMatchRuleTest(Blocks.DIRT), new BlockMatchRuleTest(Blocks.WATER), Blocks.WATER.getDefaultState()))));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/streets"), new Identifier("village/plains/terminators"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/streets/corner_01", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/corner_02", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/corner_03", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_01", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_02", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_03", immutableList3), 7), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_04", immutableList3), 7), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_05", immutableList3), 3), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_06", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_01", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_02", immutableList3), 1), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_03", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_04", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_05", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_06", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/turn_01", immutableList3), 3)), StructurePool.Projection.TERRAIN_MATCHING));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/zombie/streets"), new Identifier("village/plains/terminators"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/streets/corner_01", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/corner_02", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/corner_03", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_01", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_02", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_03", immutableList3), 7), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_04", immutableList3), 7), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_05", immutableList3), 3), new Pair(new LegacySinglePoolElement("village/plains/streets/straight_06", immutableList3), 4), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_01", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_02", immutableList3), 1), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_03", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_04", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_05", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/crossroad_06", immutableList3), 2), new Pair(new LegacySinglePoolElement("village/plains/streets/turn_01", immutableList3), 3)), StructurePool.Projection.TERRAIN_MATCHING));
        ImmutableList<StructureProcessor> immutableList4 = ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.3F), AlwaysTrueRuleTest.INSTANCE, Blocks.CARROTS.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.2F), AlwaysTrueRuleTest.INSTANCE, Blocks.POTATOES.getDefaultState()), new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.WHEAT, 0.1F), AlwaysTrueRuleTest.INSTANCE, Blocks.BEETROOTS.getDefaultState()))));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/houses"), new Identifier("village/plains/terminators"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_3", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_4", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_5", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_6", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_7", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_8", immutableList2), 3), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_medium_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_medium_house_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_big_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_butcher_shop_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_butcher_shop_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_tool_smith_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_fletcher_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_shepherds_house_1"), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_armorer_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_fisher_cottage_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_tannery_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_cartographer_1", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_library_1", immutableList2), 5), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_library_2", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_masons_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_weaponsmith_1", immutableList2), 100), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_temple_3", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_temple_4", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_stable_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_stable_2"), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_large_farm_1", immutableList4), 4), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_farm_1", immutableList4), 4), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_1"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_2"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_3"), 5), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_accessory_1"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_meeting_point_4", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 3), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_meeting_point_5"), 1), Pair.of(EmptyPoolElement.INSTANCE, 10)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/zombie/houses"), new Identifier("village/plains/terminators"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_3", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_4", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_5", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_6", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_7", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_house_8", immutableList2), 3), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_medium_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_medium_house_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_big_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_butcher_shop_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_butcher_shop_2", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_tool_smith_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_fletcher_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_shepherds_house_1"), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_armorer_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_fisher_cottage_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_tannery_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_cartographer_1", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_library_1", immutableList2), 5), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_library_2", immutableList2), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_masons_house_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_weaponsmith_1", immutableList2), 100), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_temple_3", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_temple_4", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_stable_1", immutableList2), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_stable_2"), 2), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_large_farm_1", immutableList4), 4), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_small_farm_1", immutableList4), 4), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_1"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_2"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_animal_pen_3"), 5), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_accessory_1"), 1), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_meeting_point_4", ImmutableList.of(new RuleStructureProcessor(ImmutableList.of(new StructureProcessorRule(new RandomBlockMatchRuleTest(Blocks.COBBLESTONE, 0.7F), AlwaysTrueRuleTest.INSTANCE, Blocks.MOSSY_COBBLESTONE.getDefaultState()))))), 3), new Pair(new LegacySinglePoolElement("village/plains/houses/plains_meeting_point_5"), 1), Pair.of(EmptyPoolElement.INSTANCE, 10)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/terminators"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/terminators/terminator_01", immutableList3), 1), new Pair(new LegacySinglePoolElement("village/plains/terminators/terminator_02", immutableList3), 1), new Pair(new LegacySinglePoolElement("village/plains/terminators/terminator_03", immutableList3), 1), new Pair(new LegacySinglePoolElement("village/plains/terminators/terminator_04", immutableList3), 1)), StructurePool.Projection.TERRAIN_MATCHING));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/trees"), new Identifier("empty"), ImmutableList.of(new Pair(new FeaturePoolElement(Feature.TREE.configure(DefaultBiomeFeatures.OAK_TREE_CONFIG)), 1)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/decor"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/plains_lamp_1"), 2), new Pair(new FeaturePoolElement(Feature.TREE.configure(DefaultBiomeFeatures.OAK_TREE_CONFIG)), 1), new Pair(new FeaturePoolElement(Feature.FLOWER.configure(DefaultBiomeFeatures.PLAINS_FLOWER_CONFIG)), 1), new Pair(new FeaturePoolElement(Feature.BLOCK_PILE.configure(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 1), Pair.of(EmptyPoolElement.INSTANCE, 2)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/zombie/decor"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/plains_lamp_1"), 2), new Pair(new FeaturePoolElement(Feature.TREE.configure(DefaultBiomeFeatures.OAK_TREE_CONFIG)), 1), new Pair(new FeaturePoolElement(Feature.FLOWER.configure(DefaultBiomeFeatures.PLAINS_FLOWER_CONFIG)), 1), new Pair(new FeaturePoolElement(Feature.BLOCK_PILE.configure(DefaultBiomeFeatures.HAY_PILE_CONFIG)), 1), Pair.of(EmptyPoolElement.INSTANCE, 2)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/villagers"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/villagers/nitwit"), 0), new Pair(new LegacySinglePoolElement("village/plains/villagers/baby"), 0), new Pair(new LegacySinglePoolElement("village/plains/villagers/unemployed"), 10)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/plains/zombie/villagers"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/plains/villagers/nitwit"), 0), new Pair(new LegacySinglePoolElement("village/plains/villagers/baby"), 0), new Pair(new LegacySinglePoolElement("village/plains/villagers/unemployed"), 10)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/animals"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/animals/cows_1"), 7), new Pair(new LegacySinglePoolElement("village/common/animals/pigs_1"), 7), new Pair(new LegacySinglePoolElement("village/common/animals/horses_1"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/horses_2"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/horses_3"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/horses_4"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/horses_5"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/sheep_1"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/sheep_2"), 1), Pair.of(EmptyPoolElement.INSTANCE, 5)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/sheep"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/animals/sheep_1"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/sheep_2"), 1)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/cats"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/animals/cat_black"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_british"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_calico"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_persian"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_ragdoll"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_red"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_siamese"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_tabby"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_white"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/cat_jellie"), 1), Pair.of(EmptyPoolElement.INSTANCE, 3)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/butcher_animals"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/animals/cows_1"), 3), new Pair(new LegacySinglePoolElement("village/common/animals/pigs_1"), 3), new Pair(new LegacySinglePoolElement("village/common/animals/sheep_1"), 1), new Pair(new LegacySinglePoolElement("village/common/animals/sheep_2"), 1)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/iron_golem"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/iron_golem"), 1)), StructurePool.Projection.RIGID));
        StructurePoolBasedGenerator.REGISTRY.add(new StructurePool(new Identifier("village/common/well_bottoms"), new Identifier("empty"), ImmutableList.of(new Pair(new LegacySinglePoolElement("village/common/well_bottom"), 1)), StructurePool.Projection.RIGID));
    }
}
