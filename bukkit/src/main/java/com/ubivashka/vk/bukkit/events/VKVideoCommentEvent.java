package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.callback.VideoComment;

public class VKVideoCommentEvent extends VKVideoCommentActionEvent {
	

	public VKVideoCommentEvent(VideoComment videoComment, Integer groupId) {
		super(videoComment, groupId);
	}
}
