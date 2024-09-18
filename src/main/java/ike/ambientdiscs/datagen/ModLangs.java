package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModLangs extends FabricLanguageProvider {
    public ModLangs(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    public static void addLanguageProviders(Consumer<FabricDataGenerator.Pack.RegistryDependentFactory<? extends FabricLanguageProvider>> languageProviderFactoryConsumer) {

        Map<String, String> languageToDiscName = Map.<String, String>ofEntries(
                Map.entry("af_za", "Musiekplaat"), Map.entry("ar_sa", "قرص موسيقى"), Map.entry("ast_es", "Vinilu"),
                Map.entry("az_az", "Musiqi Diski"), Map.entry("bar", "Schoiplattn"), Map.entry("ba_ru", "Пластинка"),
                Map.entry("be_by", "Грампласцінка"), Map.entry("be_latn", "Hrampłascinka"), Map.entry("bg_bg", "Музикална плоча"),
                Map.entry("brb", "Muziekplaat"), Map.entry("br_fr", "Pladenn sonerezh"), Map.entry("bs_ba", "Muzička ploča"),
                Map.entry("ca_es", "Disc de música"), Map.entry("cs_cz", "Gramofonová deska"), Map.entry("cy_gb", "Disg Cerddoriaeth"),
                Map.entry("da_dk", "Musikplade"), Map.entry("de_at", "Schoiplottn"), Map.entry("de_ch", "Schallplatte"),
                Map.entry("de_de", "Schallplatte"), Map.entry("el_gr", "Μουσικός Δίσκος"), Map.entry("enp", "Song Dish"),
                Map.entry("enws", "Music Plate"), Map.entry("en_au", "Music Disc"), Map.entry("en_ca", "Music Disc"),
                Map.entry("en_gb", "Music Disc"), Map.entry("en_nz", "Music Disc"), Map.entry("en_pt", "Shanty"),
                Map.entry("en_ud", "ɔsᴉᗡ ɔᴉsnW"), Map.entry("eo_uy", "Sondisko"),
                Map.entry("esan", "Dîcco de múçica"), Map.entry("es_ar", "Disco"), Map.entry("es_cl", "Disco de música"),
                Map.entry("es_ec", "Disco"), Map.entry("es_es", "Disco de música"), Map.entry("es_mx", "Disco"),
                Map.entry("es_uy", "Disco"), Map.entry("es_ve", "Disco"), Map.entry("et_ee", "Muusikaplaat"),
                Map.entry("eu_es", "Musika diskoa"), Map.entry("fa_ir", "ديسک موسيقی"), Map.entry("fil_ph", "Disko ng Musika"),
                Map.entry("fi_fi", "Musiikkilevy"), Map.entry("fo_fo", "Ljómfløga"), Map.entry("fra_de", "Schallbladdn"),
                Map.entry("fr_ca", "Disque de musique"), Map.entry("fr_fr", "Disque"), Map.entry("fur_it", "Disc musicâl"),
                Map.entry("fy_nl", "Muzykplaat"), Map.entry("ga_ie", "Diosca Ceoil"), Map.entry("gd_gb", "Clàr Ceòl"),
                Map.entry("gl_es", "Disco de música"), Map.entry("haw_us", "Disc Music"), Map.entry("he_il", "דיסק מוזיקה"),
                Map.entry("hi_in", "संगीत चक्रिका"), Map.entry("hr_hr", "Glazbeni disk"), Map.entry("hu_hu", "Hanglemez"),
                Map.entry("hy_am", "Ձայնասկավառակ"), Map.entry("id_id", "Cakram Musik"), Map.entry("ig_ng", "Music Disc"),
                Map.entry("io_en", "Muzikdisko"), Map.entry("isv", "Muzikalny disk"), Map.entry("is_is", "Hljómplata"),
                Map.entry("it_it", "Disco musicale"), Map.entry("ja_jp", "レコード"), Map.entry("jbo_en", "zgike vreji"),
                Map.entry("ka_ge", "მუსიკალური დისკი"), Map.entry("kk_kz", "Күйтабақ"), Map.entry("kn_in", "Music Disc"),
                Map.entry("ko_kr", "음반"), Map.entry("ksh", "Musikplaat"), Map.entry("kw_gb", "Plasen Ilow"),
                Map.entry("la_la", "Phonodiscus"), Map.entry("lb_lu", "Schallplack"), Map.entry("li_li", "Meziekplaat"),
                Map.entry("lmo", "Disch de musega"), Map.entry("lol_us", "Round loud thing"), Map.entry("lo_la", "ແຜ່ນສຽງ"),
                Map.entry("lt_lt", "Muzikos diskas"), Map.entry("lv_lv", "Mūzikas disks"), Map.entry("lzh", "留聲盤"),
                Map.entry("mk_mk", "Музички диск"), Map.entry("mn_mn", "Пянз"), Map.entry("ms_my", "Cakera Muzik"),
                Map.entry("mt_mt", "Music Disc"), Map.entry("nah", "Dīskoh"), Map.entry("nds_de", "Music Disc"),
                Map.entry("nl_be", "Muziekplaat"), Map.entry("nl_nl", "Muziekplaat"), Map.entry("nn_no", "Musikkplate"),
                Map.entry("no_no", "Musikkplate"), Map.entry("oc_fr", "Disc de musica"), Map.entry("ovd", "Musikstjiv"),
                Map.entry("pl_pl", "Płyta muzyczna"), Map.entry("pt_br", "Disco musical"), Map.entry("pt_pt", "Disco de música"),
                Map.entry("qya_aa", "Rindë lindalëo"), Map.entry("ro_ro", "Disc muzical"), Map.entry("rpr", "Пластинка"),
                Map.entry("ru_ru", "Пластинка"), Map.entry("ry_ua", "Ґрамофонова плита"), Map.entry("sah_sah", "Пластинка"),
                Map.entry("se_no", "Musihkkaskearru"), Map.entry("sk_sk", "Hudobná platňa"), Map.entry("sl_si", "Glasbeni disk"),
                Map.entry("so_so", "Music Disc"), Map.entry("sq_al", "Disk Muzike"), Map.entry("sr_cs", "Muzička ploča"),
                Map.entry("sr_sp", "Музичка плоча"), Map.entry("sv_se", "Musikskiva"), Map.entry("sxu", "Schallbladde"),
                Map.entry("szl", "Dysketka"), Map.entry("ta_in", "இசை வட்டு"), Map.entry("th_th", "แผ่นเสียง"),
                Map.entry("tlh_aa", "bom jengva'"), Map.entry("tl_ph", "Music Disc"), Map.entry("tok", "sike kalama"),
                Map.entry("tr_tr", "Müzik Diski"), Map.entry("tt_ru", "Пластинка"), Map.entry("tzo_mx", "Risko"),
                Map.entry("uk_ua", "Платівка"), Map.entry("val_es", "Disc de música"), Map.entry("vec_it", "Disco muzegal"),
                Map.entry("vi_vn", "Đĩa nhạc"), Map.entry("vp_vl", "Liidkrais"), Map.entry("yi_de", "מוזיק דיסק"),
                Map.entry("yo_ng", "Diski Orin"), Map.entry("zh_cn", "音乐唱片"), Map.entry("zh_hk", "唱片"),
                Map.entry("zh_tw", "唱片"), Map.entry("zlm_arab", "چکرا موزيک")
        );

        languageToDiscName.forEach((language, discName) ->
                languageProviderFactoryConsumer.accept((output, registriesFuture) -> new FabricLanguageProvider(output, language, registriesFuture) {
                    @Override
                    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
                        for (Item musicDiscItem : ModItems.MUSIC_DISCS) {
                            translationBuilder.add(musicDiscItem, "Music Disc");
                        }
                    }
                })
        );
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemgroup.ambient_discs", "Ambient Discs");
    }
}