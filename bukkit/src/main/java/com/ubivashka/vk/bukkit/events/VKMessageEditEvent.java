package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.messages.Message;

public class VKMessageEditEvent extends VKMessageUpdateEvent {
	

	public VKMessageEditEvent(Message message, Integer groupId) {
		super(message,groupId);
	}
}
