package legendarium;

import com.google.common.base.CaseFormat;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import lotr.common.item.LOTRItemAnduril;
import lotr.common.item.LOTRItemSauronMace;
import net.minecraft.item.Item;

public class LegendariumRegistry {
	public static Item weapon_angrist;
	public static Item weapon_anguirel;
	public static Item weapon_aranruth;
	public static Item weapon_azog;
	public static Item weapon_balin;
	public static Item weapon_barazanthual;
	public static Item weapon_boromir;
	public static Item weapon_dagmor;
	public static Item weapon_dain;
	public static Item weapon_dori;
	public static Item weapon_dramborleg;
	public static Item weapon_durin;
	public static Item weapon_dwalin;
	public static Item weapon_eowyn;
	public static Item weapon_gimli;
	public static Item weapon_gurthang;
	public static Item weapon_guthwine;
	public static Item weapon_herugrim;
	public static Item weapon_kili;
	public static Item weapon_legolas;
	public static Item weapon_melkor;
	public static Item weapon_narcil;
	public static Item weapon_thorin;
	public static Item weapon_thrain;
	public static Item weapon_thror;
	public static Item weapon_urfael;
	
	public static Item armor_anarion_boots;
	public static Item armor_anarion_legs;
	public static Item armor_anarion_chestplate;
	public static Item armor_anarion_helmet;
	
	public static Item armor_arpharazon_boots;
	public static Item armor_arpharazon_legs;
	public static Item armor_arpharazon_chestplate;
	public static Item armor_arpharazon_helmet;
	
	public static Item armor_arvedui_boots;
	public static Item armor_arvedui_legs;
	public static Item armor_arvedui_chestplate;
	public static Item armor_arvedui_helmet;
	
	public static Item armor_boromir_boots;
	public static Item armor_boromir_legs;
	public static Item armor_boromir_chestplate;
	
	public static Item armor_elendil_boots;
	public static Item armor_elendil_legs;
	public static Item armor_elendil_chestplate;
	public static Item armor_elendil_helmet;
	
	public static Item armor_elros_boots;
	public static Item armor_elros_legs;
	public static Item armor_elros_chestplate;
	public static Item armor_elros_helmet;
	
	public static Item armor_feanor_boots;
	public static Item armor_feanor_legs;
	public static Item armor_feanor_chestplate;
	public static Item armor_feanor_helmet;
	
	public static Item armor_gilgalad_boots;
	public static Item armor_gilgalad_legs;
	public static Item armor_gilgalad_chestplate;
	public static Item armor_gilgalad_helmet;
	
	public static Item armor_gimli_boots;
	public static Item armor_gimli_legs;
	public static Item armor_gimli_chestplate;
	public static Item armor_gimli_helmet;
	
	public static Item armor_isildur_boots;
	public static Item armor_isildur_legs;
	public static Item armor_isildur_chestplate;
	public static Item armor_isildur_helmet;
	
	public static Item armor_jiindur_boots;
	public static Item armor_jiindur_legs;
	public static Item armor_jiindur_chestplate;
	public static Item armor_jiindur_helmet;
	
	public static Item armor_khamul_boots;
	public static Item armor_khamul_legs;
	public static Item armor_khamul_chestplate;
	public static Item armor_khamul_helmet;
	
	public static Item armor_khommurat_boots;
	public static Item armor_khommurat_legs;
	public static Item armor_khommurat_chestplate;
	public static Item armor_khommurat_helmet;
	
	public static Item armor_morgomir_boots;
	public static Item armor_morgomir_legs;
	public static Item armor_morgomir_chestplate;
	public static Item armor_morgomir_helmet;
	
	public static Item armor_theoden_boots;
	public static Item armor_theoden_legs;
	public static Item armor_theoden_chestplate;
	public static Item armor_theoden_helmet;
	
	public static Item armor_turgon_boots;
	public static Item armor_turgon_legs;
	public static Item armor_turgon_chestplate;
	public static Item armor_turgon_helmet;

    public static void onInit() {
    	weapon_angrist = new LOTRItemAnduril();
		weapon_anguirel = new LOTRItemAnduril();
		weapon_aranruth = new LOTRItemAnduril();
		weapon_azog = new LOTRItemAnduril();
		weapon_balin = new LOTRItemAnduril();
		weapon_barazanthual = new LOTRItemAnduril();
		weapon_boromir = new LOTRItemAnduril();
		weapon_dagmor = new LOTRItemAnduril();
		weapon_dain = new LOTRItemAnduril();
		weapon_dori = new LOTRItemAnduril();
		weapon_dramborleg = new LOTRItemAnduril();
		weapon_durin = new LOTRItemAnduril();
		weapon_dwalin = new LOTRItemAnduril();
		weapon_eowyn = new LOTRItemAnduril();
		weapon_gimli = new LOTRItemAnduril();
		weapon_gurthang = new LOTRItemAnduril();
		weapon_guthwine = new LOTRItemAnduril();
		weapon_herugrim = new LOTRItemAnduril();
		weapon_kili = new LOTRItemAnduril();
		weapon_legolas = new LOTRItemAnduril();
		weapon_melkor = new LOTRItemSauronMace();
		weapon_narcil = new LOTRItemAnduril();
		weapon_thorin = new LOTRItemAnduril();
		weapon_thrain = new LOTRItemAnduril();
		weapon_thror = new LOTRItemAnduril();
		weapon_urfael = new LOTRItemAnduril();
		
    	armor_anarion_helmet = new LegendariumArmor(LegendariumArmor.ANARION, 0);
    	armor_anarion_chestplate = new LegendariumArmor(LegendariumArmor.ANARION, 1);
    	armor_anarion_legs = new LegendariumArmor(LegendariumArmor.ANARION, 2);
    	armor_anarion_boots = new LegendariumArmor(LegendariumArmor.ANARION, 3);
    	
    	armor_arpharazon_helmet = new LegendariumArmor(LegendariumArmor.ARPHARAZON, 0);
    	armor_arpharazon_chestplate = new LegendariumArmor(LegendariumArmor.ARPHARAZON, 1);
    	armor_arpharazon_legs = new LegendariumArmor(LegendariumArmor.ARPHARAZON, 2);
    	armor_arpharazon_boots = new LegendariumArmor(LegendariumArmor.ARPHARAZON, 3);
    	
    	armor_arvedui_helmet = new LegendariumArmor(LegendariumArmor.ARVEDUI, 0);
    	armor_arvedui_chestplate = new LegendariumArmor(LegendariumArmor.ARVEDUI, 1);
    	armor_arvedui_legs = new LegendariumArmor(LegendariumArmor.ARVEDUI, 2);
    	armor_arvedui_boots = new LegendariumArmor(LegendariumArmor.ARVEDUI, 3);
    	
    	armor_boromir_chestplate = new LegendariumArmor(LegendariumArmor.BOROMIR, 1);
    	armor_boromir_legs = new LegendariumArmor(LegendariumArmor.BOROMIR, 2);
    	armor_boromir_boots = new LegendariumArmor(LegendariumArmor.BOROMIR, 3);
    	
    	armor_elendil_helmet = new LegendariumArmor(LegendariumArmor.ELENDIL, 0);
    	armor_elendil_chestplate = new LegendariumArmor(LegendariumArmor.ELENDIL, 1);
    	armor_elendil_legs = new LegendariumArmor(LegendariumArmor.ELENDIL, 2);
    	armor_elendil_boots = new LegendariumArmor(LegendariumArmor.ELENDIL, 3);
    	
    	armor_elros_helmet = new LegendariumArmor(LegendariumArmor.ELROS, 0);
    	armor_elros_chestplate = new LegendariumArmor(LegendariumArmor.ELROS, 1);
    	armor_elros_legs = new LegendariumArmor(LegendariumArmor.ELROS, 2);
    	armor_elros_boots = new LegendariumArmor(LegendariumArmor.ELROS, 3);
    	
    	armor_feanor_helmet = new LegendariumArmor(LegendariumArmor.FEANOR, 0);
    	armor_feanor_chestplate = new LegendariumArmor(LegendariumArmor.FEANOR, 1);
    	armor_feanor_legs = new LegendariumArmor(LegendariumArmor.FEANOR, 2);
    	armor_feanor_boots = new LegendariumArmor(LegendariumArmor.FEANOR, 3);
    	
    	armor_gilgalad_helmet = new LegendariumArmor(LegendariumArmor.GILGALAD, 0);
    	armor_gilgalad_chestplate = new LegendariumArmor(LegendariumArmor.GILGALAD, 1);
    	armor_gilgalad_legs = new LegendariumArmor(LegendariumArmor.GILGALAD, 2);
    	armor_gilgalad_boots = new LegendariumArmor(LegendariumArmor.GILGALAD, 3);
    	
    	armor_gimli_helmet = new LegendariumArmor(LegendariumArmor.GIMLI, 0);
    	armor_gimli_chestplate = new LegendariumArmor(LegendariumArmor.GIMLI, 1);
    	armor_gimli_legs = new LegendariumArmor(LegendariumArmor.GIMLI, 2);
    	armor_gimli_boots = new LegendariumArmor(LegendariumArmor.GIMLI, 3);
    	
    	armor_isildur_helmet = new LegendariumArmor(LegendariumArmor.ISILDUR, 0);
    	armor_isildur_chestplate = new LegendariumArmor(LegendariumArmor.ISILDUR, 1);
    	armor_isildur_legs = new LegendariumArmor(LegendariumArmor.ISILDUR, 2);
    	armor_isildur_boots = new LegendariumArmor(LegendariumArmor.ISILDUR, 3);
    	
    	armor_jiindur_helmet = new LegendariumArmor(LegendariumArmor.JIINDUR, 0);
    	armor_jiindur_chestplate = new LegendariumArmor(LegendariumArmor.JIINDUR, 1);
    	armor_jiindur_legs = new LegendariumArmor(LegendariumArmor.JIINDUR, 2);
    	armor_jiindur_boots = new LegendariumArmor(LegendariumArmor.JIINDUR, 3);
    	
    	armor_khamul_helmet = new LegendariumArmor(LegendariumArmor.KHAMUL, 0);
    	armor_khamul_chestplate = new LegendariumArmor(LegendariumArmor.KHAMUL, 1);
    	armor_khamul_legs = new LegendariumArmor(LegendariumArmor.KHAMUL, 2);
    	armor_khamul_boots = new LegendariumArmor(LegendariumArmor.KHAMUL, 3);
    	
    	armor_khommurat_helmet = new LegendariumArmor(LegendariumArmor.KHOMMURAT, 0);
    	armor_khommurat_chestplate = new LegendariumArmor(LegendariumArmor.KHOMMURAT, 1);
    	armor_khommurat_legs = new LegendariumArmor(LegendariumArmor.KHOMMURAT, 2);
    	armor_khommurat_boots = new LegendariumArmor(LegendariumArmor.KHOMMURAT, 3);
    	
    	armor_morgomir_helmet = new LegendariumArmor(LegendariumArmor.MORGOMIR, 0);
    	armor_morgomir_chestplate = new LegendariumArmor(LegendariumArmor.MORGOMIR, 1);
    	armor_morgomir_legs = new LegendariumArmor(LegendariumArmor.MORGOMIR, 2);
    	armor_morgomir_boots = new LegendariumArmor(LegendariumArmor.MORGOMIR, 3);
    	
    	armor_theoden_helmet = new LegendariumArmor(LegendariumArmor.THEODEN, 0);
    	armor_theoden_chestplate = new LegendariumArmor(LegendariumArmor.THEODEN, 1);
    	armor_theoden_legs = new LegendariumArmor(LegendariumArmor.THEODEN, 2);
    	armor_theoden_boots = new LegendariumArmor(LegendariumArmor.THEODEN, 3);
    	
    	armor_turgon_helmet = new LegendariumArmor(LegendariumArmor.TURGON, 0);
    	armor_turgon_chestplate = new LegendariumArmor(LegendariumArmor.TURGON, 1);
    	armor_turgon_legs = new LegendariumArmor(LegendariumArmor.TURGON, 2);
    	armor_turgon_boots = new LegendariumArmor(LegendariumArmor.TURGON, 3);
    	
    	LegendariumRegistry.nameAndRegisterItem(weapon_angrist, "weapon_angrist");
		LegendariumRegistry.nameAndRegisterItem(weapon_anguirel, "weapon_anguirel");
		LegendariumRegistry.nameAndRegisterItem(weapon_aranruth, "weapon_aranruth");
		LegendariumRegistry.nameAndRegisterItem(weapon_azog, "weapon_azog");
		LegendariumRegistry.nameAndRegisterItem(weapon_balin, "weapon_balin");
		LegendariumRegistry.nameAndRegisterItem(weapon_barazanthual, "weapon_barazanthual");
		LegendariumRegistry.nameAndRegisterItem(weapon_boromir, "weapon_boromir");
		LegendariumRegistry.nameAndRegisterItem(weapon_dagmor, "weapon_dagmor");
		LegendariumRegistry.nameAndRegisterItem(weapon_dain, "weapon_dain");
		LegendariumRegistry.nameAndRegisterItem(weapon_dori, "weapon_dori");
		LegendariumRegistry.nameAndRegisterItem(weapon_dramborleg, "weapon_dramborleg");
		LegendariumRegistry.nameAndRegisterItem(weapon_durin, "weapon_durin");
		LegendariumRegistry.nameAndRegisterItem(weapon_dwalin, "weapon_dwalin");
		LegendariumRegistry.nameAndRegisterItem(weapon_eowyn, "weapon_eowyn");
		LegendariumRegistry.nameAndRegisterItem(weapon_gimli, "weapon_gimli");
		LegendariumRegistry.nameAndRegisterItem(weapon_gurthang, "weapon_gurthang");
		LegendariumRegistry.nameAndRegisterItem(weapon_guthwine, "weapon_guthwine");
		LegendariumRegistry.nameAndRegisterItem(weapon_herugrim, "weapon_herugrim");
		LegendariumRegistry.nameAndRegisterItem(weapon_kili, "weapon_kili");
		LegendariumRegistry.nameAndRegisterItem(weapon_legolas, "weapon_legolas");
		LegendariumRegistry.nameAndRegisterItem(weapon_melkor, "weapon_melkor");
		LegendariumRegistry.nameAndRegisterItem(weapon_narcil, "weapon_narcil");
		LegendariumRegistry.nameAndRegisterItem(weapon_thorin, "weapon_thorin");
		LegendariumRegistry.nameAndRegisterItem(weapon_thrain, "weapon_thrain");
		LegendariumRegistry.nameAndRegisterItem(weapon_thror, "weapon_thror");
		LegendariumRegistry.nameAndRegisterItem(weapon_urfael, "weapon_urfael");
		
    	LegendariumRegistry.nameAndRegisterItem(armor_anarion_helmet, "armor_anarion_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_anarion_chestplate, "armor_anarion_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_anarion_legs, "armor_anarion_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_anarion_boots, "armor_anarion_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_arpharazon_helmet, "armor_arpharazon_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_arpharazon_chestplate, "armor_arpharazon_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_arpharazon_legs, "armor_arpharazon_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_arpharazon_boots, "armor_arpharazon_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_arvedui_helmet, "armor_arvedui_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_arvedui_chestplate, "armor_arvedui_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_arvedui_legs, "armor_arvedui_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_arvedui_boots, "armor_arvedui_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_boromir_chestplate, "armor_boromir_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_boromir_legs, "armor_boromir_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_boromir_boots, "armor_boromir_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_elendil_helmet, "armor_elendil_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_elendil_chestplate, "armor_elendil_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_elendil_legs, "armor_elendil_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_elendil_boots, "armor_elendil_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_elros_helmet, "armor_elros_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_elros_chestplate, "armor_elros_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_elros_legs, "armor_elros_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_elros_boots, "armor_elros_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_feanor_helmet, "armor_feanor_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_feanor_chestplate, "armor_feanor_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_feanor_legs, "armor_feanor_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_feanor_boots, "armor_feanor_boots");

    	LegendariumRegistry.nameAndRegisterItem(armor_gilgalad_helmet, "armor_gilgalad_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_gilgalad_chestplate, "armor_gilgalad_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_gilgalad_legs, "armor_gilgalad_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_gilgalad_boots, "armor_gilgalad_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_gimli_helmet, "armor_gimli_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_gimli_chestplate, "armor_gimli_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_gimli_legs, "armor_gimli_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_gimli_boots, "armor_gimli_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_isildur_helmet, "armor_isildur_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_isildur_chestplate, "armor_isildur_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_isildur_legs, "armor_isildur_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_isildur_boots, "armor_isildur_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_jiindur_helmet, "armor_jiindur_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_jiindur_chestplate, "armor_jiindur_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_jiindur_legs, "armor_jiindur_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_jiindur_boots, "armor_jiindur_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_khamul_helmet, "armor_khamul_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_khamul_chestplate, "armor_khamul_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_khamul_legs, "armor_khamul_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_khamul_boots, "armor_khamul_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_khommurat_helmet, "armor_khommurat_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_khommurat_chestplate, "armor_khommurat_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_khommurat_legs, "armor_khommurat_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_khommurat_boots, "armor_khommurat_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_morgomir_helmet, "armor_morgomir_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_morgomir_chestplate, "armor_morgomir_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_morgomir_legs, "armor_morgomir_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_morgomir_boots, "armor_morgomir_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_theoden_helmet, "armor_theoden_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_theoden_chestplate, "armor_theoden_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_theoden_legs, "armor_theoden_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_theoden_boots, "armor_theoden_boots");
    	
    	LegendariumRegistry.nameAndRegisterItem(armor_turgon_helmet, "armor_turgon_helmet");
    	LegendariumRegistry.nameAndRegisterItem(armor_turgon_chestplate, "armor_turgon_chestplate");
    	LegendariumRegistry.nameAndRegisterItem(armor_turgon_legs, "armor_turgon_legs");
    	LegendariumRegistry.nameAndRegisterItem(armor_turgon_boots, "armor_turgon_boots");
    }
    
    private static void nameAndRegisterItem(Item item, String name) {
        String lowerUnderscoreName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, name);
        item.setUnlocalizedName(name);
        item.setTextureName("legendarium:" + lowerUnderscoreName);
        GameRegistry.registerItem(item, lowerUnderscoreName);
   }
}