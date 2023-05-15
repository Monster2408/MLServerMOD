package xyz.mlserver.mod.mlservermod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(modid = "mlserver_mod", name = "MLServer MOD")
public class MLServerMOD {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Minecraftを立ち上げて最初に呼ばれる処理アイテムやブロックなどの登録をする

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // 2番めに呼ばれる処理色々書く
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // 最後に呼ばれる処理他のmodとの連携に使う
    }


}
