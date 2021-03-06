package moriyashiine.bewitchment.common.item.util;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BWBookItem extends Item {
	public BWBookItem(Settings settings) {
		super(settings);
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		//		if (user instanceof ServerPlayerEntity) {
		//			Book book = BookRegistry.INSTANCE.books.get(Registry.ITEM.getId(this));
		//			PatchouliAPI.get().openBookGUI((ServerPlayerEntity) user, book.id);
		//			SoundEvent sfx = PatchouliSounds.getSound(book.openSound, PatchouliSounds.book_open);
		//			user.playSound(sfx, 1, (float) (0.7 + Math.random() * 0.4));
		//		}
		return new TypedActionResult<>(ActionResult.SUCCESS, user.getStackInHand(hand));
	}
}
