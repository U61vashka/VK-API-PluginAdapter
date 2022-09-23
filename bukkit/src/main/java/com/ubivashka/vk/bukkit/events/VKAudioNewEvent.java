package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.audio.Audio;

public class VKAudioNewEvent extends AbstractVkEvent {
	
	private Audio audio;

	public VKAudioNewEvent(Audio audio, Integer groupId) {
		super(groupId);
		setAudio(audio);
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}
}
