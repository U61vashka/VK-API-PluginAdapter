package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.callback.GroupOfficersEdit;

public class VKGroupOfficersEditEvent extends AbstractVkEvent {
	
	private GroupOfficersEdit officersEdit;

	public VKGroupOfficersEditEvent(GroupOfficersEdit officersEdit, Integer groupId) {
		super(groupId);
		setOfficersEdit(officersEdit);
	}

	public GroupOfficersEdit getOfficersEdit() {
		return officersEdit;
	}

	public void setOfficersEdit(GroupOfficersEdit officersEdit) {
		this.officersEdit = officersEdit;
	}

}
