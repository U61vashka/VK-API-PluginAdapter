package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.callback.UserBlock;

public class VKUserBlockEvent extends AbstractVkEvent {
	
	private UserBlock block;

	public VKUserBlockEvent(UserBlock block, Integer groupId) {
		super(groupId);
		setBlock(block);
	}

	public UserBlock getBlock() {
		return block;
	}

	public void setBlock(UserBlock block) {
		this.block = block;
	}

}
