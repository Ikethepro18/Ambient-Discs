package ike.ambientdiscs.datagen;

import ike.ambientdiscs.item.ModItems;
import ike.ambientdiscs.sound.ModdedJukeboxSongs;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Util;

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
                            translationBuilder.add(musicDiscItem, discName);
                        }
                    }
                })
        );
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemgroup.ambient_discs", "Ambient Discs");
        for (Item musicDiscItem : ModItems.MUSIC_DISCS) {
            translationBuilder.add(musicDiscItem, "Music Disc");
        }

        Map<RegistryKey<JukeboxSong>, String> jukeboxSongsDescriptions = Map.<RegistryKey<JukeboxSong>, String>ofEntries(
                Map.entry(ModdedJukeboxSongs.AERIE, "Lena Raine - Aerie"), Map.entry(ModdedJukeboxSongs.ALPHA, "C418 - Alpha"),
                Map.entry(ModdedJukeboxSongs.ANCESTRY, "Lena Raine - Ancestry"), Map.entry(ModdedJukeboxSongs.AN_ORDINARY_DAY, "Kumi Tanioka - An Ordinary Day"),
                Map.entry(ModdedJukeboxSongs.ARIA_MATH, "C418 - Aria Math"), Map.entry(ModdedJukeboxSongs.AXOLOTL, "C418 - Axolotl"),
                Map.entry(ModdedJukeboxSongs.A_FAMILIAR_ROOM, "Aaron Cherof - A Familiar Room"), Map.entry(ModdedJukeboxSongs.BALLAD_OF_THE_CATS, "C418 - Ballad of the Cats"),
                Map.entry(ModdedJukeboxSongs.BEGINNING_2, "C418 - Beginning 2"), Map.entry(ModdedJukeboxSongs.BIOME_FEST, "C418 - Biome Fest"),
                Map.entry(ModdedJukeboxSongs.BLIND_SPOTS, "C418 - Blind Spots"), Map.entry(ModdedJukeboxSongs.BOSS, "C418 - Boss"),
                Map.entry(ModdedJukeboxSongs.BROMELIAD, "Aaron Cherof - Bromeliad"), Map.entry(ModdedJukeboxSongs.CHRYSOPOEIA, "Lena Raine - Chrysopoeia"),
                Map.entry(ModdedJukeboxSongs.CLARK, "C418 - Clark"), Map.entry(ModdedJukeboxSongs.COMFORTING_MEMORIES, "Kumi Tanioka - Comforting Memories"),
                Map.entry(ModdedJukeboxSongs.CONCRETE_HALLS, "C418 - Concrete Halls"), Map.entry(ModdedJukeboxSongs.CRESCENT_DUNES, "Aaron Cherof - Crescent Dunes"),
                Map.entry(ModdedJukeboxSongs.DANNY, "C418 - Danny"), Map.entry(ModdedJukeboxSongs.DEAD_VOXEL, "C418 - Dead Voxel"),
                Map.entry(ModdedJukeboxSongs.DEEPER, "Lena Raine - Deeper"), Map.entry(ModdedJukeboxSongs.DRAGON_FISH, "C418 - Dragon Fish"),
                Map.entry(ModdedJukeboxSongs.DREITON, "C418 - Dreiton"), Map.entry(ModdedJukeboxSongs.DRY_HANDS, "C418 - Dry Hands"),
                Map.entry(ModdedJukeboxSongs.ECHO_IN_THE_WIND, "Aaron Cherof - Echo in the Wind"), Map.entry(ModdedJukeboxSongs.ELD_UNKNOWN, "Lena Raine - Eld Unknown"),
                Map.entry(ModdedJukeboxSongs.ENDLESS, "Lena Raine - Endless"), Map.entry(ModdedJukeboxSongs.FEATHERFALL, "Aaron Cherof - Featherfall"),
                Map.entry(ModdedJukeboxSongs.FIREBUGS, "Lena Raine - Firebugs"), Map.entry(ModdedJukeboxSongs.FLOATING_DREAM, "Kumi Tanioka - Floating Dream"),
                Map.entry(ModdedJukeboxSongs.FLOATING_TREES, "C418 - Floating Trees"), Map.entry(ModdedJukeboxSongs.HAGGSTROM, "C418 - Haggstrom"),
                Map.entry(ModdedJukeboxSongs.HAUNT_MUSKIE, "C418 - Haunt Muskie"), Map.entry(ModdedJukeboxSongs.INFINITE_AMETHYST, "Lena Raine - Infinite Amethyst"),
                Map.entry(ModdedJukeboxSongs.KEY, "C418 - Key"), Map.entry(ModdedJukeboxSongs.KOMOREBI, "Kumi Tanioka - Komorebi"),
                Map.entry(ModdedJukeboxSongs.LABYRINTHINE, "Lena Raine - Labyrinthine"), Map.entry(ModdedJukeboxSongs.LEFT_TO_BLOOM, "Lena Raine - Left to Bloom"),
                Map.entry(ModdedJukeboxSongs.LIVING_MICE, "C418 - Living Mice"), Map.entry(ModdedJukeboxSongs.MICE_ON_VENUS, "C418 - Mice on Venus"),
                Map.entry(ModdedJukeboxSongs.MINECRAFT, "C418 - Minecraft"), Map.entry(ModdedJukeboxSongs.MOOG_CITY_2, "C418 - Moog City 2"),
                Map.entry(ModdedJukeboxSongs.MUTATION, "C418 - Mutation"), Map.entry(ModdedJukeboxSongs.ONE_MORE_DAY, "Lena Raine - One More Day"),
                Map.entry(ModdedJukeboxSongs.OXYGENE, "C418 - Oxygène"), Map.entry(ModdedJukeboxSongs.POKOPOKO, "Kumi Tanioka - Pokopoko"),
                Map.entry(ModdedJukeboxSongs.PUZZLEBOX, "Aaron Cherof - Puzzlebox"), Map.entry(ModdedJukeboxSongs.RUBEDO, "Lena Raine - Rubedo"),
                Map.entry(ModdedJukeboxSongs.SHUNIJI, "C418 - Shuniji"), Map.entry(ModdedJukeboxSongs.SO_BELOW, "Lena Raine - So Below"),
                Map.entry(ModdedJukeboxSongs.STAND_TALL, "Lena Raine - Stand Tall"), Map.entry(ModdedJukeboxSongs.SUBWOOFER_LULLABY, "C418 - Subwoofer Lullaby"),
                Map.entry(ModdedJukeboxSongs.SWEDEN, "C418 - Sweden"), Map.entry(ModdedJukeboxSongs.TASWELL, "C418 - Taswell"),
                Map.entry(ModdedJukeboxSongs.THE_END, "C418 - The End"), Map.entry(ModdedJukeboxSongs.WARMTH, "C418 - Warmth"),
                Map.entry(ModdedJukeboxSongs.WATCHER, "Aaron Cherof - Watcher"), Map.entry(ModdedJukeboxSongs.WENDING, "Lena Raine - Wending"),
                Map.entry(ModdedJukeboxSongs.WET_HANDS, "C418 - Wet Hands"), Map.entry(ModdedJukeboxSongs.YAKUSOKU, "Kumi Tanioka - Yakusoku")
        );

        jukeboxSongsDescriptions.forEach((registryKey, description) -> translationBuilder.add(Util.createTranslationKey("jukebox_song", registryKey.getValue()), description));
    }
}