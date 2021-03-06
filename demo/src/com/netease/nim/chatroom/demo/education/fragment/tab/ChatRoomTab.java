package com.netease.nim.chatroom.demo.education.fragment.tab;


import com.netease.nim.chatroom.demo.R;
import com.netease.nim.chatroom.demo.im.ui.tab.reminder.ReminderId;

/**
 * Created by hzxuwen on 2015/12/14.
 */
public enum ChatRoomTab {
    RTS(0, ReminderId.RTS, RTSTabFragment.class, R.string.chat_room_rts, R.layout.chat_room_rts_tab);

    public final int tabIndex;

    public final int reminderId;

    public final Class<? extends ChatRoomTabFragment> clazz;

    public final int resId;

    public final int fragmentId;

    public final int layoutId;

    ChatRoomTab(int index, int reminderId, Class<? extends ChatRoomTabFragment> clazz, int resId, int layoutId) {
        this.tabIndex = index;
        this.reminderId = reminderId;
        this.clazz = clazz;
        this.resId = resId;
        this.fragmentId = index;
        this.layoutId = layoutId;
    }

    public static final ChatRoomTab fromTabIndex(int tabIndex) {
        for (ChatRoomTab value : ChatRoomTab.values()) {
            if (value.tabIndex == tabIndex) {
                return value;
            }
        }

        return null;
    }

    public static final ChatRoomTab fromReminderId(int reminderId) {
        for (ChatRoomTab value : ChatRoomTab.values()) {
            if (value.reminderId == reminderId) {
                return value;
            }
        }

        return null;
    }
}
