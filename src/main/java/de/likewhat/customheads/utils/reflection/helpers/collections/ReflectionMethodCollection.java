package de.likewhat.customheads.utils.reflection.helpers.collections;

import com.mojang.authlib.GameProfile;
import de.likewhat.customheads.utils.reflection.helpers.NBTTagUtils;
import de.likewhat.customheads.utils.reflection.helpers.ReflectionUtils;
import de.likewhat.customheads.utils.reflection.helpers.Version;
import de.likewhat.customheads.utils.reflection.helpers.wrappers.MethodWrapper;

public class ReflectionMethodCollection {

    // NBTTagCompound
    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GET_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "c", ReflectionClassCollection.NBTBASE_CLASS.resolve(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), String.class);
    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GET = new MethodWrapper<>(null, Version.V1_17_R1, "get", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBT_TAGCOMPOUND_GET_V1181, String.class);

    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GETCOMPOUND_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "p", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), String.class);
    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GETCOMPOUND = new MethodWrapper<>(null, Version.V1_17_R1, "getCompound", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBT_TAGCOMPOUND_GETCOMPOUND_V1181, String.class);

    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GETLIST_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "c", NBTTagUtils.NBTType.LIST.getNBTClass(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), String.class, int.class);
    public static final MethodWrapper<Object> NBT_TAGCOMPOUND_GETLIST = new MethodWrapper<>(null, Version.V1_17_R1, "getList", NBTTagUtils.NBTType.LIST.getNBTClass(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBT_TAGCOMPOUND_GETLIST_V1181, String.class, int.class);

    public static final MethodWrapper<Void> NBT_TAGCOMPOUND_SET_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "a", ReflectionClassCollection.NBTBASE_CLASS.resolve(), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), String.class, ReflectionClassCollection.NBTBASE_CLASS.resolve());
    public static final MethodWrapper<Void> NBT_TAGCOMPOUND_SET = new MethodWrapper<>(null, Version.V1_17_R1, "set", void.class, NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBT_TAGCOMPOUND_SET_V1181, String.class, ReflectionClassCollection.NBTBASE_CLASS.resolve());

    public static final MethodWrapper<Boolean> NBT_TAGCOMPOUND_HASKEY_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "e", boolean.class, NBTTagUtils.NBTType.COMPOUND.getNBTClass(), String.class);
    public static final MethodWrapper<Boolean> NBT_TAGCOMPOUND_HASKEY = new MethodWrapper<>(null, Version.V1_17_R1, "hasKey", boolean.class, NBTTagUtils.NBTType.COMPOUND.getNBTClass(), NBT_TAGCOMPOUND_HASKEY_V1181, String.class);

    // NBTTagList
    public static final MethodWrapper<Boolean> NBT_TAGLIST_ADD_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "b", boolean.class, NBTTagUtils.NBTType.LIST.getNBTClass(), int.class, ReflectionClassCollection.NBTBASE_CLASS.resolve());
    public static final MethodWrapper<Void> NBT_TAGLIST_ADD_V1141 = new MethodWrapper<>(Version.V1_14_R1, Version.V1_17_R1, "add", void.class, NBTTagUtils.NBTType.LIST.getNBTClass(), NBT_TAGLIST_ADD_V1181, int.class, ReflectionClassCollection.NBTBASE_CLASS.resolve());
    public static final MethodWrapper<Void> NBT_TAGLIST_ADD = new MethodWrapper<>(null, Version.V1_13_R2, "add", void.class, NBTTagUtils.NBTType.LIST.getNBTClass(), NBT_TAGLIST_ADD_V1141, ReflectionClassCollection.NBTBASE_CLASS.resolve());

    public static final MethodWrapper<Integer> NBT_TAGLIST_SIZE = new MethodWrapper<>(null, null, "size", int.class, NBTTagUtils.NBTType.LIST.getNBTClass());

    public static final MethodWrapper<String> NBT_TAGLIST_GETSTRING_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "j", String.class, NBTTagUtils.NBTType.LIST.getNBTClass(), int.class);
    public static final MethodWrapper<String> NBT_TAGLIST_GETSTRING = new MethodWrapper<>(null, Version.V1_17_R1, "getString", String.class, NBTTagUtils.NBTType.LIST.getNBTClass(), NBT_TAGLIST_GETSTRING_V1181, int.class);

    // ItemStack
    public static final MethodWrapper<Boolean> ITEMSTACK_HASTAG_V1191 = new MethodWrapper<>(Version.V1_19_R1, null, "t", boolean.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve());
    public static final MethodWrapper<Boolean> ITEMSTACK_HASTAG_V1182 = new MethodWrapper<>(Version.V1_18_R2, Version.V1_18_R2, "s", boolean.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_HASTAG_V1191);
    public static final MethodWrapper<Boolean> ITEMSTACK_HASTAG_V1181 = new MethodWrapper<>(Version.V1_18_R1, Version.V1_18_R1, "r", boolean.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_HASTAG_V1182);
    public static final MethodWrapper<Boolean> ITEMSTACK_HASTAG = new MethodWrapper<>(null, Version.V1_17_R1, "hasTag", boolean.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_HASTAG_V1181);

    public static final MethodWrapper<Object> ITEMSTACK_GETTAG_V1191 = new MethodWrapper<>(Version.V1_19_R1, null, "u", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve());
    public static final MethodWrapper<Object> ITEMSTACK_GETTAG_V1182 = new MethodWrapper<>(Version.V1_18_R2, Version.V1_18_R2, "t", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_GETTAG_V1191);
    public static final MethodWrapper<Object> ITEMSTACK_GETTAG_V1181 = new MethodWrapper<>(Version.V1_18_R1, Version.V1_18_R1, "s", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_GETTAG_V1182);
    public static final MethodWrapper<Object> ITEMSTACK_GETTAG = new MethodWrapper<>(null, Version.V1_17_R1, "getTag", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_GETTAG_V1181);

    public static final MethodWrapper<Void> ITEMSTACK_SETTAG_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "c", void.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), NBTTagUtils.NBTType.COMPOUND.getNBTClass());
    public static final MethodWrapper<Void> ITEMSTACK_SETTAG = new MethodWrapper<>(null, Version.V1_17_R1, "setTag", void.class, ReflectionClassCollection.MINECRAFT_ITEMSTACK_CLASS.resolve(), ITEMSTACK_SETTAG_V1181, NBTTagUtils.NBTType.COMPOUND.getNBTClass());

    // GameProfile
    public static final MethodWrapper<Object> GAMEPROFILE_SERIALIZE = new MethodWrapper<>(Version.V1_18_R1, null, "a", NBTTagUtils.NBTType.COMPOUND.getNBTClass(), ReflectionUtils.getMCServerClassByName("GameProfileSerializer", "nbt"), NBTTagUtils.NBTType.COMPOUND.getNBTClass(), GameProfile.class);

    // Player Packet Handling
    public static final MethodWrapper<Void> PLAYER_SEND_PACKET_V1181 = new MethodWrapper<>(Version.V1_18_R1, null, "a", void.class, ReflectionUtils.getMCServerClassByName("PlayerConnection", "server.network"), ReflectionUtils.getMCServerClassByName("Packet", "network.protocol"));
    public static final MethodWrapper<Void> PLAYER_SEND_PACKET = new MethodWrapper<>(null, Version.V1_17_R1, "sendPacket", void.class, ReflectionUtils.getMCServerClassByName("PlayerConnection", "server.network"), PLAYER_SEND_PACKET_V1181, ReflectionUtils.getMCServerClassByName("Packet", "network.protocol"));

    public static final MethodWrapper<Object> CONTAINER_ACCESS_AT_V1182 = new MethodWrapper<>(Version.V1_18_R2, null, "a", ReflectionClassCollection.CONTAINER_ACCESS, ReflectionClassCollection.CONTAINER_ACCESS, ReflectionClassCollection.WORLD, ReflectionClassCollection.BLOCK_POSITION);
    public static final MethodWrapper<Object> CONTAINER_ACCESS_AT = new MethodWrapper<>(null, Version.V1_18_R1, "at", ReflectionClassCollection.CONTAINER_ACCESS, ReflectionClassCollection.CONTAINER_ACCESS, CONTAINER_ACCESS_AT_V1182, ReflectionClassCollection.WORLD, ReflectionClassCollection.BLOCK_POSITION);

}
