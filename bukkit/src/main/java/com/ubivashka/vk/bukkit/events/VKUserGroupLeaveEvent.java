package com.ubivashka.vk.bukkit.events;

import com.vk.api.sdk.objects.callback.GroupLeave;

public class VKUserGroupLeaveEvent extends AbstractVkEvent {
	
	private GroupLeave leave;

	public VKUserGroupLeaveEvent(GroupLeave leave, Integer groupId) {
		super(groupId);
		setLeave(leave);
	}

	public GroupLeave getLeave() {
		return leave;
	}

	public void setLeave(GroupLeave leave) {
		this.leave = leave;
	}

}
