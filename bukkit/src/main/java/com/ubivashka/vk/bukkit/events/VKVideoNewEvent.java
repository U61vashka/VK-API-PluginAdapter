package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.video.Video;

public class VKVideoNewEvent extends AbstractVkEvent {
	
	private Video video;

	public VKVideoNewEvent(Video video, Integer groupId) {
		super(groupId);
		setVideo(video);
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}
}
