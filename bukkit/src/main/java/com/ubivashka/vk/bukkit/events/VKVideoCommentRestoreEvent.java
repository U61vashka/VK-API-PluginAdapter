package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.callback.VideoComment;

public class VKVideoCommentRestoreEvent extends VKVideoCommentActionEvent {
	

	public VKVideoCommentRestoreEvent(VideoComment videoComment, Integer groupId) {
		super(videoComment, groupId);
	}
}
